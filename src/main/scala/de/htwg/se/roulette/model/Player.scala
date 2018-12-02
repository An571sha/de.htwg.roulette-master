package de.htwg.se.roulette.model

  case class Player(val name: String, val bet: String, var bankmoney: Int) {

    override def toString: String = name

    def getbankmoney: Int ={
    bankmoney
    }

    def playerBet: String = bet

    def updateplayermoney(betMoney: Int): Unit = {
      bankmoney += betMoney
      //bankmoney
    }
  }

