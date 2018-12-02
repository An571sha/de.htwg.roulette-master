package de.htwg.se.roulette
import aview.Tui
import de.htwg.se.roulette.controller.Controller
import de.htwg.se.roulette.model.Player

object roulette {
    val controller = new Controller(,)
    val tui = new Tui(controller)
    controller.notifyObservers

    def main(args: Array[String]): Unit = {
      var input: String = ""

      do {
        input = readLine()
        tui.processInputLine(input)
      } while (input != "q")
    }
}
