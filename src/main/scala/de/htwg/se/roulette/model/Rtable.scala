package de.htwg.se.roulette.model

 case class Rtable() {

  def promptBet(): Int = {
  println(" you must Choose from this List of Bets")
  var i: Int = 0
  for (x <- PossibleBets(i)) {
    print(PossibleBets(i).PossibleOptions())
    i += i
  }
  scala.io.StdIn.readInt()
  }

   def play(player: Player): Unit ={

   }
}

