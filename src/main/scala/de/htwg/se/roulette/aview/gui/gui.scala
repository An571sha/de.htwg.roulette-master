package de.htwg.se.roulette.aview.gui

import scala.swing._
import scala.swing.event._
import de.htwg.se.roulette.controller._
import de.htwg.se.roulette.controller.controllerComponent.ControllerInterface

import scala.io.Source._

class gui(controller: ControllerInterface) extends Frame {
  listenTo(controller)

  preferredSize = new Dimension(420, 340)
  def frame = new MainFrame {

    title = "HTWG Roulette"

    val statusline = new TextField("welcome", 20)
    val nameLine = new TextField("Name", 10)
    val moneyLine = new TextField("Your money", 4)

    val evenB = new Button {
      text = "Even"
    }
    val oddB = new Button {
      text = "Odd"
    }
    val redB = new Button {
      text = "Red"
    }
    val blackB = new Button {
      text = "Black"
    }
    val greenB = new Button {
      text = "Green"
    }
    val undoB = new Button {
      text = "undo"
    }
    val redoB = new Button {
      text = "redo"
    }

    contents = new BoxPanel(Orientation.Vertical) {
      contents += statusline
      contents += nameLine
      contents += moneyLine
      contents += evenB
      contents += oddB
      contents += redB
      contents += blackB
      contents += greenB
      contents += undoB
      contents += redoB
      contents += Button("press me") {println("lmao")}

    }

  }
  visible = true
}
