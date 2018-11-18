package de.htwg.se.roulette.model

/*This class is resposible for holding the players bet*/
case class wheel() {
  var colour: String = "Blue"
  var NumSpins = 0
  val value1 = new scala.util.Random
  val value : Int = value1.nextInt(36)

  /*def wheelColor(i: Int): Unit = if ((i eq 1) || (i eq 3) || (i eq 5) || (i eq 7) || (i eq 9) || (i eq 12) || (i eq 14) || (i eq 16) || (i eq 18) || (i eq 19) || (i eq 21) || (i eq 23) || (i eq 25) || (i eq 27) || (i eq 30) || (i eq 32) || (i eq 34) || (i eq 36)) colour = "red"
  else if (i eq 0) colour = "green"
  else colour = "black"
  */


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
    // print("The wheel is Spinning..." + wheelColor(value) + value)
    value
  }





}
