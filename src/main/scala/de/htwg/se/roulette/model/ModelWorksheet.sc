import de.htwg.se.roulette.model.{Game, Player}
val arrayGrid = Array(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35)
def arrayToString(a: Array[Int]) : String ={
  val str = for (l <- a) yield arrayGrid.mkString("{", ",", "}")
  str.mkString("{", ",\n","}")
}
println(arrayGrid.mkString(" | "))
arrayGrid[1].s
