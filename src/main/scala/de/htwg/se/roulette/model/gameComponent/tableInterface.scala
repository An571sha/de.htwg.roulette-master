package de.htwg.se.roulette.model.gameComponent

import de.htwg.se.roulette.model.gameComponent
import de.htwg.se.roulette.model.gameComponent.gameBaseImpl.Player

trait tableInterface {
  def play(): Int

}

trait wheelInterface {
  def setRandom(): Int
}
