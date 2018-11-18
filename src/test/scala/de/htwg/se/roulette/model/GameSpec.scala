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

  "To chose the possilbe Numbers of a Bet" should {
    val betarray = new Game("Red").NumberorColor()
    "with the option Red" in {
      betarray should be(Array(1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36))
    }
  }
  "To chose the possilbe Numbers of a Bet" should {
    val betarray = new Game("Black").NumberorColor()
    "with the option Black" in {
      betarray should be(Array(2, 4, 6, 8, 10, 13, 15, 17, 20, 22, 24, 26, 28, 31, 33, 35))
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
  /*"if Check bet is true then black" should {
    val black = new wheel().value;
    "black is selected" in {
      Game("Black").NumberorColor() should be(black)
    }
  }
  "The choice for Red or Black" when {
    "new" should {
      val RBnumbers = new Game("Red")
      "with choice Red" in {
        RBnumbers.RedOrBlack() should be(Array(1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36))
      }
    }
    "new" should {
      val RBnumbers = new Game("Black")
      "with choice Black" in {
        RBnumbers.RedOrBlack() should be(Array(2, 4, 6, 8, 10, 13, 15, 17, 20, 22, 24, 26, 28, 31, 33, 35))
      }
    }
    "new" should {
      val RBnumbers = new Game("Green")
      "with choice Green" in {
        RBnumbers.RedOrBlack() should be(Array(0))
      }
    }
    "new" should {
      val RBnumbers = new Game("something")
      "with a not existential choice" in{
        RBnumbers.RedOrBlack() should be(null)
      }
    }
  }
  "The method OddOrEven" when {
    "input is Even" should {
      val evenNB = new Game("Even")
      "with choice Even" in {
        evenNB.OddOrEven() should be(Game("Even").Even)
      }
    }
    "new" should {
      val evenNB = new Game("Odd")
      "with choice Odd" in {
        evenNB.OddOrEven() should be(Game("Odd").Odd)
      }
    }
  }
  */
}
