package de.htwg.se.roulette.model.playerComponent

case class Player(val name: String, val bet: String, var bankmoney: Int) extends playerInterface {

  override def toString: String = name

  def getbankmoney: Int ={
  bankmoney
  }

  def playerBet: String = bet

  def updateplayermoney(betMoney: Int): Int = {
    this.bankmoney = betMoney + bankmoney
    bankmoney
  }
}

