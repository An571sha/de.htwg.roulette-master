package de.htwg.se.roulette.aview.gui

import java.awt.FlowLayout

import de.htwg.se.roulette.controller.controllerComponent.{CellChange, ControllerInterface}
import javax.swing.{ImageIcon, JLabel}

import scala.swing._

class gui(controller: ControllerInterface) extends Frame{
  listenTo(controller)

  reactions += {
    case event: CellChange => update
    //case event: EventHappens => frame.update
  }

  /*def update: Unit = {
    frame.statusline.text_=(controller.gameStatus.toString)
    frame.nameLine.text_=(controller.name)
    frame.moneyLine.text_=(controller.bankmoney.toString)
  }*/

  var bet = "bet"

  //preferredSize = new Dimension(420, 340)
  //def frame = new MainFrame {

    def update: Unit = {
      if (controller.bankmoney <= 0) {
        result.text_=("^+.+^ GAME OVER ^+.+^")
        Thread.sleep(5000)
        System.exit(0)
      }
        statusline.text = (">.> " + controller.gameStatus.toString + " <.<")
        nameLine.text_=(controller.name)
        moneyLine.text_=(controller.bankmoney.toString)
        repaint()
    }

  val icon = new ImageIcon("C:\\00-Studium\\Scala-Projekt\\RouletteBild\\roulette.jpg")
  val image = new JLabel(icon)
  val flowLayout = new FlowLayout
  flowLayout.setAlignment(FlowLayout.CENTER)

    title = "HTWG Roulette"

    val statusline = new Label(">.> Status <.<")
    val nameLine = new TextField("Name", 10)
    val moneyLine = new TextField("100", 4)
    var result = new Label("")
    var oldMoney = 0
    var newMoney = 0

  def frame = new MainFrame {

      menuBar = new MenuBar {
        contents += new Menu("File") {
          contents += new MenuItem(Action("Quit") {
            System.exit(-1)
          })
          contents += new MenuItem(Action("Create new Player") {
            controller.createNewPlayer(nameLine.text, bet, moneyLine.text.toInt)
            controller.set(controller.bankmoney)
            update
          })
        }
        contents += new Menu("Edit") {
          contents += new MenuItem(Action("Undo") {
            controller.undo
            //update
          })
          contents += new MenuItem(Action("Redo") {
            controller.redo
            update
          })
        }
      }

    contents = new BoxPanel(Orientation.Vertical) {
      contents += new BoxPanel(Orientation.Horizontal) {
        contents += statusline
        border = Swing.TitledBorder(Swing.EtchedBorder(Swing.Raised), "Status")
      }
      contents += new Label("\n")
      contents += new BoxPanel(Orientation.Horizontal) {
        //contents += new Label("Your Name: ")
        contents += nameLine
        border = Swing.TitledBorder(Swing.EtchedBorder(Swing.Lowered), "Your Name")
      }
      contents += new BoxPanel(Orientation.Horizontal) {
        contents += new Label("\n")
        contents += moneyLine
        border = Swing.TitledBorder(Swing.EtchedBorder(Swing.Lowered), "Your Money")
      }
      //contents += evenB
      //contents += oddB
      //contents += redB
      //contents += blackB
      //contents += greenB
      //contents += undoB
      //contents += redoB


      //border = Swing.EmptyBorder(10,10,10,10)

      contents += new Label("\n")

      contents += new BoxPanel(Orientation.Horizontal) {
        contents += result
      }

      contents += new BoxPanel(Orientation.Horizontal) {

        contents += Button("Even") {
          bet = "Even"
          controller.changeBet(bet)
          oldMoney = controller.bankmoney
          controller.set(controller.bankmoney)
          newMoney = controller.bankmoney
          if (oldMoney > newMoney) {
            result.text_=("You lost")
          } else if (newMoney > oldMoney) {
            result.text_=("You won")
          }
          repaint()
          update
        }

        contents += Button("Odd") {
          bet = "Odd"
          controller.changeBet(bet)
          oldMoney = controller.bankmoney
          controller.set(controller.bankmoney)
          newMoney = controller.bankmoney
          if (oldMoney > newMoney) {
            result.text_=("You lost")
          } else if (newMoney > oldMoney) {
            result.text_=("You won")
          }
          update
        }
        contents += Button("Black") {
          bet = "Black"
          controller.changeBet(bet)
          oldMoney = controller.bankmoney
          controller.set(controller.bankmoney)
          newMoney = controller.bankmoney
          if (oldMoney > newMoney) {
            result.text_=("You lost")
          } else if (newMoney > oldMoney) {
            result.text_=("You won")
          }
          update
        }

        contents += Button("Red") {
          bet = "Red"
          controller.changeBet(bet)
          oldMoney = controller.bankmoney
          controller.set(controller.bankmoney)
          newMoney = controller.bankmoney
          if (oldMoney > newMoney) {
            result.text_=("You lost")
          } else if (newMoney > oldMoney) {
            result.text_=("You won")
          }
          update
        }
        contents += Button("Green") {
          bet = "Green"
          controller.changeBet(bet)
          oldMoney = controller.bankmoney
          controller.set(controller.bankmoney)
          newMoney = controller.bankmoney
          if (oldMoney > newMoney) {
            result.text_=("You lost")
          } else if (newMoney > oldMoney) {
            result.text_=("You won")
          }
          update
        }
        border = Swing.TitledBorder(Swing.EtchedBorder(Swing.Raised), "Bet obtions")
      }

      contents += new Label("\n")

      contents += new BoxPanel(Orientation.Horizontal) {
        contents += Button("Undo") {
          controller.undo
        }
        contents += Button("Redo") {
          controller.redo
        }
        border = Swing.TitledBorder(Swing.EtchedBorder(Swing.Lowered), "Undo & Redo")
      }
      border = Swing.EmptyBorder(20, 20, 20, 20)
    }
  }
  frame.visible = true
}
