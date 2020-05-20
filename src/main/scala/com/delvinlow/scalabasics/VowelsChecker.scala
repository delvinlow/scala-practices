package com.delvinlow.scalabasics

object VowelsChecker {
  // Write a function that tests whether a character is a lowercase vowel a, e, i, o, u without using an if-expression
  def isVowel(ch: Char): Boolean = {
    "aeiou".contains(ch)
  }

  // Write a function that, given a string, returns a string of all of its vowels.
  def onlyVowels(input: String): String = {
    for (ch <- input if isVowel(ch)) yield ch
  }

  // Write a function that, given a string, returns a string of all of its vowels. Use filter statement.
  def onlyVowelsWithFilter(input: String): String = {
    input.filter(isVowel)
  }

  /**
   * Write a vowelsImproved function that takes two additional arguments vowelChars and ignoreCase
   * Arguments:
   *  input - Original string
   *  vowelChars - default to 'aeiou',
   *  ignoreCase - default to true
   */
  def vowelsImproved(s: String, vowelChars: String = "aeiou", ignoreCase: Boolean = true): String = {
    println(s)
    println(vowelChars)
    val stringToChange = if (ignoreCase) s.toLowerCase else s
    val acceptedVowels = if (ignoreCase) vowelChars.toLowerCase else vowelChars
    println(stringToChange)
    println(acceptedVowels)
    for (ch <- stringToChange if isVowelImproved(ch, acceptedVowels)) yield ch
  }

  def isVowelImproved(ch: Char, vowelChars: String = "aeiou"): Boolean = {
    vowelChars.contains(ch)
  }
}
