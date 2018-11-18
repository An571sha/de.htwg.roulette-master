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

  /*def WhichBet(choice :Int) : Array[Int] = {

    if(choice == 0) {
      PossibleBets(0).PossibleOptions()
      //println("please make a choice of Red or Black")
      RedOrBlack()
    }
    if(choice == 1) {
      PossibleBets(0).PossibleOptions()
      //println("please make a choice of odd and even")
      OddOrEven()
    }
    Array(0)
  }*/


  /*def Choice() : String = {
    val choice = scala.io.StdIn.readLine()
    choice.toString()
   }*/

  def NumberorColor() : Array[Int] ={
    choice match {
      case "Red" => return Array(1, 3, 5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36)
      case "Black" => return Array(2,4,6,8,10,13,15,17,20,22,24,26,28,31,33,35)
      case "Green" => return Array(0)
      case "Even" => return Even
      case "Odd" => return Odd
    }
  }
/*
  def RedOrBlack() : Array[Int] = {
    if (choice.equals("Red")) {
      Array(1, 3, 5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36)
    } else if (choice.equals("Black")) {
      Array(2,4,6,8,10,13,15,17,20,22,24,26,28,31,33,35)
    } else if (choice.equals("Green")) {
      Array(0)
    } else {
      //println("please enter Red or Black only")
      null
    }
  }


  def OddOrEven() : Array[Int] = {
    if(choice.equals("Even")){
      return Even

    }else if (choice.equals("Odd")){
      return Odd
    }
    return
  }*/

  def CheckBet() : Boolean = {
    if (NumberorColor().contains(wheel().value))
      return true
    false
    /*for (e <- NumberorColor() {

      if (e.equals(wheel().value))
        return true
      false*/
    /*}
    for (e <- OddOrEven()){

      if(e.equals(wheel().value))
        true
    }

    false*/
  }


}

