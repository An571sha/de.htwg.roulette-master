package de.htwg.se.roulette.model

case class Bet(val options: String,val multiplicator: Double) {

  def Multiplicator: Double = multiplicator

  def Options: String = options

}
