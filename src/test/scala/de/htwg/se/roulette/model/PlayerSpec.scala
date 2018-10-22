package de.htwg.se.roulette.model
import org.scalatest._

class PlayerSpec {

  class PlayerSpec extends WordSpec with Matchers {
    "A Player" when { "new" should {
      val player = Player("Your Name", 0)
      "have a name" in {
        player.name should be ("Your Name")
      }
      "put your bet" in {
        player.bet should be (0)
      }
      "have a String presentation" in {
        player.toString should be("Your name")
        player.playerBet should be(0)
      }
    }
    }
  }

}
