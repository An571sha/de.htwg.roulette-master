package de.htwg.se.roulette.model

import org.scalatest._

class GameSpec extends WordSpec with Matchers {
  "A number" when {
    "using method isEven" should {
      val even = new Game("Black").isEven(2)
      "with value 2" in {
        even should be(true)
      }
    }
    "using method isOdd" should {
      val odd = new Game("Black").isOdd(3)
      "with value 3" in {
        odd should be(true)
      }
    }
  }

  "A Number" when {
    "using CheckBet" should {
      val xs = List(Game("Red").CheckBet(),Game("Black").CheckBet())
      "joining and comparing " in {
        xs should (contain(true) or contain(false))
      }
    }
  }

  "To chose the possilbe Numbers of a Bet" should {
    val betarray = new Game("Red").NumberorColor()
    "with the option Red" in {
      betarray should be(Array(1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36))
    }
  }
  "To chose the possilbe Numbers of a Bet" should {
    val betarray = new Game("Black").NumberorColor()
    "with the option Black" in {
      betarray should be(Array(2,4,6,8,10,11,13,15,17,20,22,24,26,28,29,31,33,35))
    }
  }
  "To chose the possilbe Numbers of a Bet" should {
    val betarray = new Game("Green").NumberorColor()
    "with the option Green" in {
      betarray should be(Array(0))
    }
  }
  "To chose the possilbe Numbers of a Bet" should {
    val betarray = new Game("Even").NumberorColor()
    "with the option Even" in {
      betarray should be(Game("Even").Even)
    }
  }
  "To chose the possilbe Numbers of a Bet" should {
    val betarray = new Game("Odd").NumberorColor()
    "with the option Odd" in {
      betarray should be(Game("Odd").Odd)
    }
  }

}
