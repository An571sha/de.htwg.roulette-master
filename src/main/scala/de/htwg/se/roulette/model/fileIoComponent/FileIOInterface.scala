package de.htwg.se.roulette.model.fileIoComponent

import de.htwg.se.roulette.model.playerComponent.Player

trait FileIOInterface {

  def load: Player
  def save(player: Player):Unit

}
