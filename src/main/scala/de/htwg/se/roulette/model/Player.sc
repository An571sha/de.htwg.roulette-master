package de.htwg.se.roulette.model

  case class Player(var name: String, var bet: Int, var money: Int) {

    override def toString: String = name

    def playerBet: Int = bet

    def updateplayermoney(betMoney: Int): Int = {
      money += betMoney
      money
    }

  }