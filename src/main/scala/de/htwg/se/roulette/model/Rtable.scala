package de.htwg.se.roulette.model

 case class Rtable(val player: Player) {

   def play(): Int ={
     if(player.playerBet.equals("Red")){
       if (Game("Red").CheckBet()){
         player.updateplayermoney(10)
       }else{
         player.updateplayermoney(-10)
       }
     }
     else if(player.playerBet.equals("Green")){
       if (Game("Green").CheckBet()){
         player.updateplayermoney(10)
       }else{
         player.updateplayermoney(-10)
       }
     }
     else if(player.playerBet.equals("Odd")){
       if (Game("Odd").CheckBet()){
         player.updateplayermoney(10)
       }else{
         player.updateplayermoney(-10)
       }
     }
     else if (player.playerBet.equals("Even")){
       if (Game("Even").CheckBet()){
         player.updateplayermoney(10)
       }else{
         player.updateplayermoney(-10)
       }
     }
     player.bankMoney
   }



 }


