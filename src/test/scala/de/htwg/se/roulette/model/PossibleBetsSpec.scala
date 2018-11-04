package de.htwg.se.roulette.model

import org.scalatest._

class PossibleBetsSpec extends WordSpec with Matchers {
  "A PossibleBet" when {
    "new" should {
      val possibleBets = PossibleBets(1)
      "get the mulstiplicator from Bet" in {
        possibleBets.PossibleOptions().multiplicator should be(1.2)
      }
      "get the options from Bet" in {
        possibleBets.PossibleOptions().options should be("Odd or Even")
      }
    }
  }
}
