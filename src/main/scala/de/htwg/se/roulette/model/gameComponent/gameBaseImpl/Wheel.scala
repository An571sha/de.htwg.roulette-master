package de.htwg.se.roulette.model.gameComponent.gameBaseImpl

import de.htwg.se.roulette.model.gameComponent.wheelInterface

import scala.util.Random

/*This class is resposible for holding the players bet*/
case class Wheel(size: Int) extends wheelInterface {
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

