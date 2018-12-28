package de.htwg.se.roulette.controller

import de.htwg.se.roulette.model.{Player, Rtable, Wheel}
import de.htwg.se.roulette.util.UndoManager
import de.htwg.se.roulette.util.Observable
import scala.swing.Publisher

class Controller(var player: Player) extends Publisher{

  private val undoManager = new UndoManager;
  def createNewPlayer(name: String, bet: String, bankmoney: Int): Unit ={
    player = new Player(name, bet, bankmoney)
    //publish(new CellChange)
  }
  def createTable(): Int ={
    var rtable = new Rtable(player)
    var r = rtable.play()
    publish(new CellChange)
    r
  }
  def set(bankmoney: Int): Unit ={
    undoManager.doStep(new SetCommand(bankmoney, player,this))
    publish(new CellChange)

  }
  def changeBet(newbet:String): Unit = {
    player = player.copy(bet = newbet)
    //publish(new CellChange)
  }
  def undo: Unit = {
    undoManager.undoStep
    System.out.print(player.bankmoney)
  }

  def redo: Unit = {
    undoManager.redoStep
  }

}
