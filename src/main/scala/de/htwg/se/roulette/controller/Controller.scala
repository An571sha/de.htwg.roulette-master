package de.htwg.se.roulette.controller

import de.htwg.se.roulette.model.{Player, Rtable, Wheel}
import de.htwg.se.roulette.util.Observable

class Controller(var player: Player) extends Observable{
  def createNewPlayer(name: String, bet: String, bankmoney: Int): Unit ={
    player = new Player(name, bet, bankmoney)
    notifyObservers
  }
  def createTable(): Int ={
    var rtable = new Rtable(player)
    var r = rtable.play()
    notifyObservers
    r
  }
  def changeBet(newbet:String): Unit = {
    player = player.copy(bet = newbet)
    notifyObservers
  }

}
