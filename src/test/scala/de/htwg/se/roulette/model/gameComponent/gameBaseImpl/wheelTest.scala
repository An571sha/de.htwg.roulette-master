package de.htwg.se.roulette.model.gameComponent.gameBaseImpl

import org.scalatest.{Matchers, WordSpec}

class wheelTest extends WordSpec with Matchers {

  "wheelColor" when {
    "spinned using the method spin" should {
      val Randomnumber: Int = Wheel(1).setRandom()
      "have SetRandom" in {
        Randomnumber should be(0)
      }
    }
  }
}