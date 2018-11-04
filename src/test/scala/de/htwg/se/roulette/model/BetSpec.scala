package de.htwg.se.roulette.model

import org.scalatest._

class BetSpec extends WordSpec with Matchers {
  "A Bet" when {
    "new" should {
      val bet = Bet("Your option", 0.0)
      "take an option" in {
        bet.options should be("Your option")
      }
      "take a multiplicator" in {
        bet.multiplicator should be(0.0)
      }
      "have a String representation" in {
        bet.Options should be("Your option")
        bet.Multiplicator should be(0.0)
      }
    }
  }
}
