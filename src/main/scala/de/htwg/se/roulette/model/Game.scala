package de.htwg.se.roulette.model
import de.htwg.se.roulette.model.Rtable

case class Game(val choice: String) {

  val y  = 0 to 36 toArray

  val filter = (predicate: Int => Boolean, xs: Array[Int]) => {
    for (x <- xs if predicate(x)) yield x
  }

  def isEven(x : Int) : Boolean = {
    if (x % 2 == 0)
      return true
    false

  }

  def isOdd(x:Int): Boolean = {
    if(x % 2 != 0)
      return true
    false
  }

  val Even = filter(isEven, y)

  val Odd = filter(isOdd, y)

  def NumberorColor() : Array[Int] ={
    choice match {
      case "Red" => return Array(1,3,5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36)
      case "Black" => return Array(2,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33,35)
      case "Green" => return Array(0)
      case "Even" => return Even
      case "Odd" => return Odd
    }
  }


  def CheckBet() : Boolean = {
    if (NumberorColor().contains(Wheel(36).setRandom()))
      return true
    false

  }


}

