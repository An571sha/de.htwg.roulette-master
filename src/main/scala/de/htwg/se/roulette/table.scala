package de.htwg.se.roulette.model


case class table() {
  val r = scala.util.Random(36)
  val numbers = 0 to 36 toList
  val first12 = 0 to 11 toList
  val second12 = 12 to 24 toList
  val third12 =  25 to 36 toList

  var colour = "green"

  def selectcolor(): Unit = {
    if (numbers == 1 || numbers == 3 || numbers == 5
      || numbers == 7 || numbers == 9 || numbers == 12
      || numbers == 14 || numbers == 16 || numbers == 18
      || numbers == 19 || numbers == 21 || numbers == 23
      || numbers == 25 || numbers == 27 || numbers == 30
      || numbers == 32 || numbers == 34 || numbers == 36) {
      colour = "red"
    } else if (numbers == 0) {

      colour = "green"
    }
    else {
      colour = "black"
    }
  }

  var arr = Array.ofDim[Int](12,3)

  arr(0)(0)=1
  arr(0)(1)=2
  arr(0)(2)=3
  arr(1)(0)=4
  arr(1)(1)=5
  arr(1)(2)=6
  arr(2)(0)=7
  arr(2)(1)=8
  arr(2)(2)=9
  arr(3)(0)=10
  arr(3)(1)=11
  arr(3)(2)=12
  arr(4)(0)=13
  arr(4)(1)=14
  arr(4)(2)=15
  arr(5)(0)=16
  arr(5)(1)=17
  arr(5)(2)=18
  arr(6)(0)=19
  arr(6)(1)=20
  arr(6)(2)=21
  arr(7)(0)=22
  arr(7)(1)=23
  arr(7)(2)=24
  arr(8)(0)=25
  arr(8)(1)=26
  arr(8)(2)=27
  arr(9)(0)=28
  arr(9)(1)=29
  arr(9)(2)=30
  arr(10)(0)=31
  arr(10)(1)=32
  arr(10)(2)=33
  arr(11)(0)=34
  arr(11)(1)=35
  arr(11)(2)=36
  print(arr.map(_.mkString(" ")).mkString("\n"))







}
