import de.htwg.se.roulette.model.Wheel

case class Bet(options: String, multiplicator: Double) {

  def Multiplicator: Double = multiplicator

  def Options: String = options

  val arrayGrid = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35)
  val string = arrayGrid.mkString
  for (x <- arrayGrid) {
    if (x.equals(Wheel().value)) {
      string(x)='X'
    }
  }
  string
}