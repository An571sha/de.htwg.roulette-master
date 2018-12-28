/*package model

import de.htwg.se.roulette.model.{Game, Player, Wheel}

case class Grid(color: String) {

  def fullGrid(): String = {
    val arrayGrid = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35)
    val string = arrayGrid.mkString(" | ")
    string
  }

  def RedGrid(): String = {
    val blueGrid = Game("Red").NumberorColor()
    val string = blueGrid.mkString(" | ")
    string
  }

  def BlackGrid(): String = {
    val blackGrid = Game("Black").NumberorColor()
    val string = blackGrid.mkString(" | ")
    string
  }

  def GreenGrid(): String = {
    val greenGrid = Game("Green").NumberorColor()
    val string = greenGrid.mkString(" | ")
    string
  }

  def fullGridsolved(): String = {
    val arrayGrid = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35)
    for (x <- arrayGrid) {
      if (x == Wheel(36).setRandom()) {
        arrayGrid(x) = 'X'
      }
    }
    val string = arrayGrid.mkString(" | ")
    string
  }
}
*/
/*
  def ColorGrid() : Array[Int] ={
    color match {
      case "Red" => return Array(1, 3, 5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36).mkString(" | ")
      case "Black" => return Array(2,4,6,8,10,13,15,17,20,22,24,26,28,31,33,35)
      case "Green" => return Array(0)
      case "Even" => return Even
      case "Odd" => return Odd


}*/
