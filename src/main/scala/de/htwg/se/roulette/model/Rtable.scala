package de.htwg.se.roulette.model

 case class Rtable() {

  def promptBet(): Bet = {
   var i: Int = 0
   var entrylist = PossibleBets(index = i).PossibleOptions()
   for(i <- 0 until 3){
    entrylist
   }
   entrylist

  }

   def play(player: Player): Unit ={


   }

}

