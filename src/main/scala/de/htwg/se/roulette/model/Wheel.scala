package de.htwg.se.roulette.model
import scala.util.Random

case class Wheel(size: Int) {
  var colour: String = "Blue"
  def setRandom() : Int = {
    Random.nextInt(size)
  }

  }

