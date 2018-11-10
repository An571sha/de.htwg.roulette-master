package de.htwg.se.roulette.model

import org.scalatest.{Matchers,WordSpec}

class wheelTest extends WordSpec with Matchers {

  "wheelColor" when {
    "spinned using the method spin" should {
      val colourCode: String =  wheel().wheelColor(7)
      "have value 7" in {
        colourCode should be("Red")
      }
      /*wheel().wheelColor(0)
      "have value 0" in {
        colourCode should be("black")
      }*/
    }
  }
  "spin" should{
    "increase the number the values" in {

    }
    }
  }
