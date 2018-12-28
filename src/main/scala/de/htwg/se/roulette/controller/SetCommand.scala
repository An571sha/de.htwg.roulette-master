package de.htwg.se.roulette.controller

import de.htwg.se.roulette.model.{Player, Rtable}
import de.htwg.se.roulette.util.Command

class SetCommand(bankmoney: Int, player: Player, controller: Controller) extends Command {


  override def doStep: Unit =   controller.player.bankmoney = Rtable(player).play()

  override def undoStep: Unit = controller.player.bankmoney = player.getbankmoney

  override def redoStep: Unit = controller.player.bankmoney = player.getbankmoney
}

import de.htwg.se.roulette.util.Command
/*
class SetCommand(row:Int, col: Int, value:Int, controller: Controller) extends Command {
  override def doStep: Unit =   controller.grid = controller.grid.set(row, col, value)

  override def undoStep: Unit = controller.grid = controller.grid.set(row, col, 0)

  override def redoStep: Unit = controller.grid = controller.grid.set(row, col, value)
}*/

