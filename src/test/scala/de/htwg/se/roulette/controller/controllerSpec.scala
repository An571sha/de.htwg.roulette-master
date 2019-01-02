package de.htwg.se.roulette.controller

import de.htwg.se.roulette.model.Player
import org.scalatest.{Matchers, WordSpec}

class controllerSpec extends WordSpec with Matchers {
  "A controller" should{
    val player = new Player("name", "Red", 100)
    val controller = new Controller(player)
    "set the chain of motion " in {
      controller.set(100)
      controller.statusText should be("Bet is Set")
      controller.changeBet("Black")
      controller.statusText should be("New Bet is Made")
      controller.set(100)
      controller.undo
      controller.statusText should be("Undo")
      controller.redo
      controller.statusText should be("Redo")
    }
  }
}

