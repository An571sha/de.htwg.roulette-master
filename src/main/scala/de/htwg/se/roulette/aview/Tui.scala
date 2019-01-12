package de.htwg.se.roulette.aview

import de.htwg.se.roulette.controller.controllerComponent.controllerBaseImpl.Controller
import de.htwg.se.roulette.controller.controllerComponent.{CellChange, EventHappens, GameStatus}
//import de.htwg.se.roulette.controller.GameStatus
import scala.collection.immutable.Range.Int
import scala.swing.Reactor

class Tui(controller: Controller) extends Reactor {

  listenTo(controller)
  var i = Int
  val arrayGrid = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35)
  val string = arrayGrid.mkString(" | ")
  var oldMoney = 0
  var newMoney = 0
  println(string)
  println("If you want to play              --> Pls enter: q YourName YourBet YourMoney")

  def processInputLine(input: String): Unit = {
    if (controller.player.bankmoney <= 0) {
      println("+.+ Game Over +.+")
      System.exit(1)
    }
    var a = input.split(" ")
    if (a(0).equals("q")) {
      val name = a(1)
      val bet = a(2)
      val bankmoney = a(3).toInt
      controller.createNewPlayer(name, bet, bankmoney)
      oldMoney = controller.player.getbankmoney
      controller.set(controller.player.bankmoney)
      newMoney = controller.player.getbankmoney
      if (oldMoney<newMoney){
        println("You Have Won!")
      }else {
        println("You have Lost!")
      }
      /*println("Your bet is: " +controller.player.bet)
      println("Your name is: " +controller.player.name)
      println("You have won: " + controller.createTable())
      println("If you want to change your bet   --> Pls enter: m YourNewBet")
      println("if you want to end this Game     --> Pls enter: exit")*/
    } else if (a(0).equals("m")) {
      val bet = a(1)
      controller.changeBet(bet)
      oldMoney = controller.player.getbankmoney
      controller.set(controller.player.bankmoney)
      newMoney = controller.player.getbankmoney
      if (oldMoney<newMoney){
        println("You Have Won!")
      }else{
        println("You have Lost!")
      }
     /* println("Your bet is: " + controller.player.bet)
      controller.createTable()
      println("You have won: " + controller.player.bankmoney)
      println("If you want to change your bet   --> Pls enter: m YourNewBet")
      println("if you want to end this Game     --> Pls enter: exit")
      */
    } else if (a(0).equals("exit")) {
      println("^(+.+)^Bye^(+.+)^")
      System.exit(1)
    } else if (a(0).equals("u")) {
      controller.undo
      update
    } else if(a(0).equals("r")){
      controller.redo
      update
    }
  }

    reactions += {
      case event: CellChange => update
      case event: EventHappens => printTui
    }

    def update: Unit = {
      println("Your bet is: " +controller.player.bet)
      println("Your name is: " +controller.player.name)
      println("You have won: " +controller.player.bankmoney)
      println("If you want to change your bet   --> Pls enter: m YourNewBet")
      println("if you want to end this Game     --> Pls enter: exit")
    }
  def printTui: Unit = {
    println(GameStatus.message(controller.gameStatus))
  }
    /*
  input match {
    case "q" =>
      val a = input.split(" ")
      val name = a(1)
      val bet = a(2)
      val bankmoney = a(3).toInt
      controller.createNewPlayer(name, bet, bankmoney)
      controller.createTable()

    case "m"=>
      val a = input.split(" ")
      val bet = a(1)
      controller.changeBet(bet)
      controller.createTable()
    case "exit" =>
  }
  }*/
}
