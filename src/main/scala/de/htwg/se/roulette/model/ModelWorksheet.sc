import de.htwg.se.roulette.model.{Bet, PossibleBets}
var i: Int = 0
var entrylist = new Array[Bet](4)
def promptBet(): Array[Bet] = {
    for (i <- 0 until 3) {
      entrylist(i)= PossibleBets(i).PossibleOptions()
    }
    entrylist
  }
  print(promptBet())



