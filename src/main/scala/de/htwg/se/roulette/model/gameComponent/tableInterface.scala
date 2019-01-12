package de.htwg.se.roulette.model.gameComponent

trait tableInterface {
  def play(): Int

}

trait wheelInterface {
  def setRandom(): Int
}
