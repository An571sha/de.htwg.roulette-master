package de.htwg.se.roulette.model

  case class Player(val name: String, val bet: String, var money: Int) {

    override def toString: String = name

    def playerBet: String = bet

    def updateplayermoney(betMoney: Int): Int = {
      money += betMoney
      money
    }
  }

