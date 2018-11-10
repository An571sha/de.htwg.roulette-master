package de.htwg.se.roulette.model
import de.htwg.se.roulette.model.Rtable

case class Game() {

  val y  = 0 to 36 toArray

  val filter = (predicate: Int => Boolean, xs: Array[Int]) => {
    for (x <- xs if predicate(x)) yield x
  }

  def isEven(x : Int) : Boolean = {
    if (x % 2 == 0)
      true
    false

  }

  def isOdd(x:Int): Boolean = {
    if(x % 2 != 0)
      true
    false
  }

  val Even = filter(isEven, y)

  val Odd = filter(isOdd, y)

  def WhichBet(choice :Int) : Array[Int] = {

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
  }


  def Choice() : Int = {
    val choice = scala.io.StdIn.readInt()
    choice.intValue()
   }

  def RedOrBlack() : Array[Int] = {
    if (Choice().equals("Red")) {
      Array(1, 3, 5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36)
    } else if (Choice().equals("Black")) {
      Array(2,4,6,8,10,13,15,17,20,22,24,26,28,31,33,35)
    } else if (Choice().equals("Green")) {
      Array(0)
    } else {
      //println("please enter Red or Black only")
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

