package aview

import de.htwg.se.roulette.controller.Controller
import de.htwg.se.roulette.util.Observable

class Tui(controller: Controller) extends Observable{
  def processInputLine(input: String): Unit ={
  input match {
    case "q" =>
      val a = input.split(" ")
      val name = a(1)
      val bet = a(2)
      val money = a(3).toInt
      val bankmoney = a(4).toInt
      controller.createNewPlayer(name, bet, money, bankmoney)
      controller.createTable()

    case "m"=>
      val a = input.split(" ")
      val bet = a(1)
      controller.changeBet(bet)
      controller.createTable()
  }
  }

}
