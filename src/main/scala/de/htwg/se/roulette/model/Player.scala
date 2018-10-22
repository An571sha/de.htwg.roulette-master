package de.htwg.se.roulette.model

  case class Player(val name: String, val bet: Int) {

    override def toString: String = name

    def playerBet: Int = bet
  }

