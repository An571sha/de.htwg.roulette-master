package de.htwg.se.roulette.model.fileIoComponent.fileIoJsonImpl

import java.io.{File, PrintWriter}

import de.htwg.se.roulette.model.fileIoComponent.FileIOInterface
import de.htwg.se.roulette.model.playerComponent.Player

import scala.io._
import play.api.libs.json.{JsNumber, JsString, JsValue, Json}

class FileIO extends FileIOInterface {


  override def load: Player = {
    var player: Player = null
    val source: String = Source.fromFile("C:\\Users\\jan\\.IntelliJIdea2018.1\\de.htwg.roulette-master\\src\\main\\scala\\de\\htwg\\se\\roulette\\FILES\\test.json").getLines().mkString
    val json: JsValue = Json.parse(source)
    val playerName = (json \ "player" \ "name").get.toString()
    val playerBet = (json \ "player" \ "bet").get.toString()
    val playerMoney = (json \ "player" \ "money").get.toString().toInt

    var name = playerName.toString().replaceAll("\"","")
    player = new Player(name, playerBet, playerMoney)
    println(playerName+" "+playerBet+" "+playerMoney)
    player
  }

  override def save(player: Player): Unit = {
    val pw = new PrintWriter(new File("C:\\Users\\jan\\.IntelliJIdea2018.1\\de.htwg.roulette-master\\src\\main\\scala\\de\\htwg\\se\\roulette\\FILES\\test.json"))
    pw.write(Json.prettyPrint(PlayertoJson(player)))
    pw.close
    println("finished writing")
  }

  def PlayertoJson(player: Player) = {
    Json.obj(
      "player" -> Json.obj(
        "name" -> player.toString,
        "bet" ->player.bet,
        "money" -> player.getbankmoney
      )
    )
  }
}
