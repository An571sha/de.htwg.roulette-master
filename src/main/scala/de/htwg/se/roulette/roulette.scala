package de.htwg.se.roulette
import aview.Tui
import de.htwg.se.roulette.controller.Controller
import de.htwg.se.roulette.model.{Player, Rtable}
import scala.io.StdIn.readLine
object roulette {
    val controller = new Controller(Player("name", "Rot", 20))
    val tui = new Tui(controller)
    controller.notifyObservers

    def main(args: Array[String]): Unit = {
      var input: String = ""

      do {
        input = readLine()
        tui.processInputLine(input)
      } while (input != "exit")
    }
}
