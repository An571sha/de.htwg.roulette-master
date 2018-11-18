package de.htwg.se.roulette.model

import org.scalatest._

class GameSpec extends WordSpec with Matchers {
  "A number" when {
    "using method isEven" should {
      val even =  new Game("Black").isEven(2)
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
  /*"A Bet" when {
    "using method WhichBet" should {
      val betnumbers = new Game("Black")
      "with choice == 0" in {
        betnumbers.WhichBet(0) should be(Game("Black").RedOrBlack())
      }
    }
    "using method WhichBet" should {
      val betnumbers = new Game("Black")
      "with choice == 1" in {
        betnumbers.WhichBet(1) should be(Game("Black").OddOrEven())
      }
    }
    "using method WhichBet" should {
      val betnumbers = new Game("Black")
      "with choice !=0 & != 1" in {
        betnumbers.WhichBet(3) should be(Array(0))
      }
    }
  }*/
  /*"A Choice" when {
    "between Red or Black or Green" should {
      val finalchoice = new Game("Red")
      "when finalchoice is Red" in {
        finalchoice.RedOrBlack() should be(Array(1, 3, 5,7,9,12,14,16,18,19,21,23,25,27,30,32,34,36))
      }
    }
  }*/
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


}
