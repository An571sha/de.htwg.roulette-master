package de.htwg.se.roulette.model.gameComponent.gameBaseImp

import de.htwg.se.roulette.model.gameComponent.gameBaseImpl.Player
import org.scalatest._

class PlayerSpec extends WordSpec with Matchers {
  "A Player" when {
    "new" should {
      val player = Player("Your Name", "bet", 10)
      "have a name" in {
        player.name should be("Your Name")
      }
      "put your bet" in {
        player.bet should be("bet")
      }
      "put your total money" in {
        player.bankmoney should be(10)
        player.getbankmoney should be(10)
      }
      "have a String presentation" in {
        player.toString should be("Your Name")
        player.playerBet should be("bet")
        player.getbankmoney should be(10)
      }
      "updating player money" in {
        player.updateplayermoney(betMoney = 10) should be (10+10)
      }
    }
  }
}

