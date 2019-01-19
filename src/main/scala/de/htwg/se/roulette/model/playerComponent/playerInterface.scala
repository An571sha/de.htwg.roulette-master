package de.htwg.se.roulette.model.playerComponent

trait playerInterface {

  def getbankmoney: Int

  def playerBet: String

  def updateplayermoney(betMoney: Int): Int

}
