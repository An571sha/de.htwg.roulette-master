package de.htwg.se.roulette.controller.controllerComponent.controllerBaseImpl

import de.htwg.se.roulette.controller.controllerComponent.GameStatus._
import de.htwg.se.roulette.controller.controllerComponent._
import de.htwg.se.roulette.model.gameComponent.gameBaseImpl.Player
//import de.htwg.se.roulette.model.gameComponent.gameBaseImpl._
import de.htwg.se.roulette.util.UndoManager

import scala.swing.Publisher

class Controller(var player: Player) extends ControllerInterface with Publisher {

  def statusText:String =  GameStatus.message(gameStatus)

  private val undoManager = new UndoManager;
  var gameStatus: GameStatus = IDLE

  def createNewPlayer(name: String, bet: String, bankmoney: Int): Unit ={
    player = new Player(name, bet, bankmoney)
    gameStatus= PLAYED
    publish(new EventHappens)
  }
  /*def createTable(): Int ={
    var rtable = new Rtable(player)
    var r = rtable.play()
    gameStatus= PLAYED
    publish(new CellChange)
    publish(new EventHappens)
    r
  }*/
  def set(bankmoney: Int): Unit ={
    undoManager.doStep(new SetCommand(bankmoney, player,this))
    gameStatus= SET
    publish(new CellChange)
    publish(new EventHappens)

  }
  def changeBet(newbet:String): Unit = {
    player = player.copy(bet = newbet)
    gameStatus= NEWBET
    publish(new EventHappens)
  }
  def undo: Unit = {
    undoManager.undoStep
    gameStatus= UNDO
    publish(new EventHappens)
  }

  def redo: Unit = {
    undoManager.redoStep
    gameStatus= REDO
    publish(new EventHappens)
  }

}