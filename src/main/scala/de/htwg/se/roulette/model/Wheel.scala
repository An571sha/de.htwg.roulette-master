package de.htwg.se.roulette.model
import scala.util.Random

/*This class is resposible for holding the players bet*/
case class Wheel(size: Int) {
  var colour: String = "Blue"
  var NumSpins = 0

  def setRandom() : Int = {
    Random.nextInt(size)
  }

  /*def spin(): Int = {
    NumSpins = NumSpins+1
    setRandom()
    */

  }

