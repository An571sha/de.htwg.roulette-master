package de.htwg.se.roulette
import de.htwg.se.roulette.aview.Tui
import de.htwg.se.roulette.aview.gui.gui
import com.google.inject.Guice
import controller.controllerComponent.ControllerInterface
import de.htwg.se.roulette.controller.controllerComponent.controllerBaseImpl.Controller
import de.htwg.se.roulette.model.playerComponent.Player
//import de.htwg.se.roulette.controller.Controller
import de.htwg.se.roulette.model.gameComponent.tableInterface


//import de.htwg.se.roulette.model.{Player, Rtable}
import scala.io.StdIn.readLine
object roulette {
  val injector = Guice.createInjector(new RouletteModule)
  //val controller = injector.getInstance(classOf[ControllerInterface])
    val controller = new Controller(Player("name", "Rot", 20))
    val tui = new Tui(controller)
    val gui = new gui(controller)
    //controller.notifyObservers

    def main(args: Array[String]): Unit = {
      var input: String = ""

      do {
        input = readLine()
        tui.processInputLine(input)
      } while (input != "exit")
    }
}
