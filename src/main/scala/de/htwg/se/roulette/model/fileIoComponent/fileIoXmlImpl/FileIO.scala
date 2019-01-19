package de.htwg.se.roulette.model.fileIoComponent.fileIoXmlImpl

import java.io.{File, PrintWriter}

import scala.io._
import play.api.libs.json.{JsNumber, JsString, JsValue, Json}
import de.htwg.se.roulette.model.fileIoComponent.FileIOInterface
import de.htwg.se.roulette.model.playerComponent.Player

import scala.xml.{Elem, PrettyPrinter}

class FileIO extends FileIOInterface {

  override def load: Player = {
    var player: Player = null
    val file = scala.xml.XML.loadFile("C:\\Users\\jan\\.IntelliJIdea2018.1\\de.htwg.roulette-master\\src\\main\\scala\\de\\htwg\\se\\roulette\\FILES\\test.xml")
    val playerName = (file \\ "PlayerName").text.toString
    val playerBet = (file \\ "PlayerBet").text.toString
    val playerMoney = (file \\ "PlayerMoney").text.toString.toInt

    player = new Player(playerName, playerBet, playerMoney)
    player
  }

  override def save(player: Player): Unit = {
    val pw = new PrintWriter(new File("C:\\Users\\jan\\.IntelliJIdea2018.1\\de.htwg.roulette-master\\src\\main\\scala\\de\\htwg\\se\\roulette\\FILES\\test.xml"))
    val prettyPrinter = new PrettyPrinter(120,4)
      val PLAYER =
      <player>
        <PlayerName>{player.name.toString}</PlayerName>
        <PlayerBet>{player.bet.toString}</PlayerBet>
        <PlayerMoney>{player.getbankmoney.toString}</PlayerMoney>
      </player>
    val xml = prettyPrinter.format(PLAYER)
    //}
    pw.write(xml)
    println("writing xml")
    pw.close()
  }
}
