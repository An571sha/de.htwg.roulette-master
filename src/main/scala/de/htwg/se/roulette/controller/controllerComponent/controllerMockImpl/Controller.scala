package de.htwg.se.roulette.controller.controllerComponent.controllerMockImpl

import de.htwg.se.roulette.controller.controllerComponent.GameStatus._
import de.htwg.se.roulette.controller.controllerComponent.{ControllerInterface, GameStatus}
import de.htwg.se.roulette.model.fileIoComponent.FileIOInterface
import de.htwg.se.roulette.model.gameComponent.gameBaseImpl.Rtable
import de.htwg.se.roulette.model.gameComponent.{tableInterface, wheelInterface}
import de.htwg.se.roulette.model.playerComponent.Player
import net.codingwell.scalaguice.InjectorExtensions._
import com.google.inject.{Guice, Inject}
import play.api.libs.json.Json

class Controller (var game: tableInterface) extends ControllerInterface{
  game = new Rtable(new Player("jan", "Red", 100))
  val player = new Player("Jan", "Red", 100)

  override def statusText: String = GameStatus.message(gameStatus)

  def gameStatus: GameStatus = IDLE

  override def createNewPlayer(name: String, bet: String, bankmoney: Int): Unit = {}

  override def set(bankmoney: Int): Unit = {}

  override def changeBet(newBet: String): Unit = {}

  override def undo: Unit = {}

  override def redo: Unit = {}

  override def getbankmoney: Int = 1

  override def bankmoney: Int = 1

  override def name: String = "name"

  override def bet: String = "bet"

  //override def createFileIO: Unit = {}
}