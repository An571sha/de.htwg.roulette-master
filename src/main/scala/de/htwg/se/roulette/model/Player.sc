package de.htwg.se.roulette.model

  import java.util.Scanner

  case class Player(var name: String, var bet: Int) {

    val input: String = scala.io.StdIn.readLine("Whats*s your name? ")
    println("name: " + input)
    name = input
    println("How much do you want to  bet?")
    var money: Int = scala.io.StdIn.readInt()
    println("bet: " + bet)
    bet = money

    override def toString: String = name

    def playerBet: Int = bet
  }