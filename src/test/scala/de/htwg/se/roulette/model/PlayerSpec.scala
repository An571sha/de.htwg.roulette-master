package de.htwg.se.roulette.model

import org.scalatest._

class PlayerSpec extends WordSpec with Matchers {
  "A Player" when {
    "new" should {
      val player = Player("Your Name", "bet", 0)
      "have a name" in {
        player.name should be("Your Name")
      }
      "put your bet" in {
        player.bet should be("bet")
      }
      /*"put your money" in {
        player.money should be(0)
      }*/
      "put your total money" in {
        player.bankmoney should be(0)
      }
      "have a String presentation" in {
        player.toString should be("Your Name")
        player.playerBet should be("bet")
        //player.updateplayermoney(0) should be(0)
        player.getbankmoney should be(0)
      }
    }
  }
}

