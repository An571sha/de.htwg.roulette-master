package de.htwg.se.roulette.controller.controllerComponent.controllerBaseImpl

import com.google.inject.{Guice, Inject}
import de.htwg.se.roulette.RouletteModule
import net.codingwell.scalaguice.InjectorExtensions._
import de.htwg.se.roulette.controller.controllerComponent._
import de.htwg.se.roulette.controller.controllerComponent.GameStatus._
import de.htwg.se.roulette.controller.controllerComponent.controllerBaseImpl.SetCommand
import de.htwg.se.roulette.model.fileIoComponent.FileIOInterface
import de.htwg.se.roulette.model.gameComponent.{tableInterface, wheelInterface}
import de.htwg.se.roulette.model.playerComponent.{Player, playerInterface}
//import de.htwg.se.roulette.model.gameComponent.gameBaseImpl._
import de.htwg.se.roulette.util.UndoManager

import scala.swing.Publisher

class Controller @Inject()(var player: Player) extends ControllerInterface with Publisher {

  val injector = Guice.createInjector(new RouletteModule)

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
    //publish(new EventHappens)

  }
  def changeBet(newbet:String): Unit = {
    player = player.copy(bet = newbet)
    gameStatus= NEWBET
    //publish(new EventHappens)
  }
  def undo: Unit = {
    undoManager.undoStep
    gameStatus= UNDO
    //publish(new EventHappens)
    publish(new CellChange)
  }

  def redo: Unit = {
    undoManager.redoStep
    gameStatus= REDO
    //publish(new EventHappens)
    publish(new CellChange)
  }
  def getbankmoney: Int = {
    player.getbankmoney
  }
  def bankmoney: Int = {
    player.bankmoney
  }
  def bet: String = {
    player.bet
  }
  def name: String = {
    player.name
  }
  /*def createFileIO(): FileIOInterface = {
    injector.instance[FileIOInterface]
  }*/

}
