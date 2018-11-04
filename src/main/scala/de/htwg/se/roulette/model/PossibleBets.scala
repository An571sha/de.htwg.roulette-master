package de.htwg.se.roulette.model

case class PossibleBets(val index: Int) {
  val array = new Array[Bet](3)
  array(0) = new Bet("Res or Black", 1.2)
  array(1) = new Bet("Odd or Even", 1.2)
  array(2) = new Bet("Three in a Row", 2)
  def PossibleOptions(): Bet = {
    index match {
      case 0 => return array(0)
      case 1 => return array(1)
      case 2 => return array(2)
    }
  }
}
