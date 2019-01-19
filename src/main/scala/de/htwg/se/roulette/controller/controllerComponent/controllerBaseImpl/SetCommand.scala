package de.htwg.se.roulette.controller.controllerComponent.controllerBaseImpl

//import de.htwg.se.roulette.controller.controllerComponent.Controller
import de.htwg.se.roulette.model.gameComponent.gameBaseImpl.Rtable
import de.htwg.se.roulette.model.gameComponent.{tableInterface, wheelInterface}
import de.htwg.se.roulette.model.playerComponent.Player
import de.htwg.se.roulette.util.Command

class SetCommand(bankmoney: Int, player: Player, controller: Controller) extends Command {


  override def doStep: Unit =   controller.player.bankmoney = Rtable(player).play()

  override def undoStep: Unit = controller.player.bankmoney = player.getbankmoney

  override def redoStep: Unit = controller.player.bankmoney = player.getbankmoney
}

