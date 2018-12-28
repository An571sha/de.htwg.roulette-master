package de.htwg.se.roulette.model

import org.scalatest.{Matchers, WordSpec}

class RtableSpec extends WordSpec with Matchers {
  "An Rtable" when {
    "new" should {
      val playerRed = Player("Your Name", "Red", 100)
      val table = Rtable(playerRed)
      "get your result" in {
          table.play() should be(110)

      }
    }
  }


}
