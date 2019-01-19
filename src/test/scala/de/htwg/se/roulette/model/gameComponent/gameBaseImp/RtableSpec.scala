package de.htwg.se.roulette.model.gameComponent.gameBaseImp

import de.htwg.se.roulette.model.gameComponent.gameBaseImpl.Rtable
import de.htwg.se.roulette.model.playerComponent.Player
import org.scalatest.{Matchers, WordSpec}

class RtableSpec extends WordSpec with Matchers {
  "An Rtable" when {
    "first round with red" should {
      val playerRed = Player("Your Name", "Red", 100)
      val table = Rtable(playerRed)
      "get your result" in {
        table.play() should (be >= 90 and be <= 110)
      }
      "seconnd round with black" should {
        val playerRed = Player("Your Name", "Black", 100)
        val table = Rtable(playerRed)
        "get your result" in {
          table.play() should (be >= 90 and be <= 110)
        }
        "third round with black" should {
          val playerRed = Player("Your Name", "Odd", 100)
          val table = Rtable(playerRed)
          "get your result" in {
            table.play() should (be >= 90 and be <= 110)
          }
          "fourth round with black" should {
            val playerRed = Player("Your Name", "Even", 100)
            val table = Rtable(playerRed)
            "get your result" in {
              table.play() should (be >= 90 and be <= 110)
            }
            "fifth round with black" should {
              val playerRed = Player("Your Name", "Green", 100)
              val table = Rtable(playerRed)
              "get your result" in {
                table.play() should (be >= 80 and be <= 200)
              }

            }
          }

        }

      }
    }
  }
}
