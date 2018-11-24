package de.htwg.se.roulette.model

/*This class is resposible for holding the players bet*/
case class wheel() {
  var colour: String = "Blue"
  var NumSpins = 0
  val value1 = new scala.util.Random
  val value : Int = value1.nextInt(36)

  def wheelColor(i: Int): String = {
    if (i == 1 || i == 3 || i == 5
      || i == 7 || i == 9 || i == 12
      || i == 14 || i == 16 || i == 18
      || i == 19 || i == 21 || i == 23
      || i == 25 || i == 27 || i == 30
      || i == 32 || i == 34 || i == 36) {
      colour = "Red"

    } else if(i == 0) {
        colour = "Green"
      }
      else {
        colour = "Black"
      }
      colour.toString
    }



  def spin(): Int = {
    NumSpins += NumSpins
    value
  }





}
