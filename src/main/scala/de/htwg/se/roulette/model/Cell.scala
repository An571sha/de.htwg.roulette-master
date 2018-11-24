package model

import java.awt.Color

case class Cell(value: Int, color: Color, set: Boolean) {
  def isSet: Boolean ={
    set
  }
  def getColor(): Color ={
  color
  }
  def setColor(newColor: Color):Cell ={
  Cell(value, newColor, set)
  }
  def setSet(): Cell ={
    Cell(value, color, true)
  }
  def resetSet(): Cell={
    Cell(value, color, false)
  }


}
