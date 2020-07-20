package com.delvinlow.scalabasics

object StringExercises {
  def toReverse(original: String): String = {
    original.reverse
  }

  def toUpper(original: String): String = {
    original.toUpperCase
  }

  def toUpperAndReversed(original: String): String = {
    val uppercase = toUpper(original)
    val reversed = toReverse(uppercase)
    reversed
  }
}
