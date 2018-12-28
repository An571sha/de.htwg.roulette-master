package de.htwg.se.roulette.controller

import de.htwg.se.roulette.model.{Player, Rtable}
import de.htwg.se.roulette.util.Command

class SetCommand(bankmoney: Int, player: Player, controller: Controller) extends Command {


  override def doStep: Unit =   controller.player.bankmoney = Rtable(player).play()

  override def undoStep: Unit = controller.player.bankmoney = player.getbankmoney

  override def redoStep: Unit = controller.player.bankmoney = player.getbankmoney
}
