package de.htwg.se.roulette.aview

//import de.htwg.se.roulette.controller.Controller
import de.htwg.se.roulette.controller.controllerComponent.controllerBaseImpl.Controller
//mport de.htwg.se.roulette.model.Player
import de.htwg.se.roulette.model.gameComponent.gameBaseImpl.Player
import org.scalatest.{Matchers, WordSpec}

class TuiSpec extends WordSpec with Matchers {

  "A Roulette Tui" should  {
    val player = new Player("name", "bet", 100)
    val controller = new Controller(player)
    val tui = new Tui(controller)

    "start the game by asking the input" in {
      tui.processInputLine("q name Red 100")
      controller.createNewPlayer("name", "Red", 100)
      val xs = List(tui.oldMoney, tui.newMoney)
      xs should (contain(110) or contain(90))
    }
    "set the bet again " in {
      tui.processInputLine("m Red")
      val changedbet = controller.changeBet("Red")
      val xs = List(tui.oldMoney, tui.newMoney)
      xs should (contain(110) or contain(90))
    }
    "undo" in {
      tui.processInputLine("u")
      controller.undo
      controller.set(10)
    }
    "redo" in {
      tui.processInputLine("u")
      controller.redo
      controller.set(10)
    }
  }
}