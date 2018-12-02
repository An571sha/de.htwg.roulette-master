package de.htwg.se.roulette.controller

import de.htwg.se.roulette.model.{Player, Rtable, Wheel}
import de.htwg.se.roulette.util.Observable

class Controller(var player: Player, var rtable: Rtable) extends Observable{

  def createNewPlayer(name: String, bet: String, money: Int, bankmoney: Int): Unit ={
    player = new Player(name, bet, bankmoney)
    notifyObservers
  }
  def createTable(): Unit ={
    rtable = new Rtable(player)
    rtable.play()
    notifyObservers
  }
  def changeBet(newbet:String): Unit = {
    player = player.copy(bet = newbet)
    notifyObservers
  }

}
