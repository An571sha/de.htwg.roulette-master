package de.htwg.se.roulette.model
import de.htwg.se.roulette.model.Rtable

class Game {
  val y  = 0 to 36 toArray
  val filter = (predicate: Int => Boolean, xs: Array[Int]) => {
    for (x <- xs if predicate(x)) yield x
  }

  val isEven = (x: Int) => x % 2 == 0

  val isOdd  = (x:Int) => x % 2 != 0

  val Even = filter(isEven, y)

  val Odd = filter(isOdd, y)

  val whichBet = Rtable().promptBet()

  def WhichBet(whichBet : Int): Unit = {

    if(whichBet == 0) {
      PossibleBets(0).PossibleOptions()
      println("please make a choice of Red or Black")
      RedOrBlack()
    }
    if(whichBet == 1) {
      PossibleBets(0).PossibleOptions()
      println("please make a choice of odd and even")
      OddOrEven()
    }
  }


  def Choice() : String = {
    val choice = scala.io.StdIn.readLine()
    choice
  }

  def RedOrBlack() : Array[Int] = {
    if (Choice().equals("Red")) {
      Array(1, 3, 5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36)
    } else if (Choice().equals("Black")) {
      Array(2,4,6,8,10,13,15,17,20,22,24,26,28,31,33,35)
    } else if (Choice().equals("Green")) {
      Array(0)
    } else {
      println("please enter Red or Black only")
      null
    }
  }


  def OddOrEven() : Array[Int] = {
    if(Choice().equals("Even")){
      Even

    }else if (Choice().equals("Odd")){
      Odd
    }
    return null
  }

  def CheckBet() : Boolean = {
    for (e <- RedOrBlack()) {

      if (e.equals(wheel().value.nextInt()))
        true
    }
    for (e <- OddOrEven()){

      if(e.equals(wheel().value.nextInt()))
        true
    }

    false
  }


}

