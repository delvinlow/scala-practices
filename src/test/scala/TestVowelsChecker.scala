import org.scalatest.funsuite.AnyFunSuite
import com.delvinlow.scalabasics.VowelsChecker._

class TestVowelsChecker extends AnyFunSuite {
  test("vowels should return true if character is a vowel") {
    assert(isVowel('a') == true)
  }

  test("vowels should return false if character is not a vowel character") {
    assert(isVowel('v') == false)
  }

  test("vowels should return false if character is a number") {
    assert(isVowel('1') == false)
  }

  test("vowels should return false if character is a punctuation") {
    assert(isVowel('+') == false)
  }

  // testing vowels with loop
  test("vowelsWithLoop should return the string with only its vowels in order") {
    val input = "Nicaragua"
    val expectedOutput = "iaaua"
    assert(onlyVowels(input) == expectedOutput)
  }

  test("vowelsWithLoop with all lower letters should return the string with only its vowels aeiou") {
    val input = "abcdefghijklmnopqrstruvwxyz"
    val expectedOutput = "aeiou"
    assert(onlyVowels(input) == expectedOutput)
  }

  test("vowelsWithLoop with all upper letters should return empty string") {
    val input = "ABCDEFGHIJKLMNOPQRSTRUVWXYZ"
    val expectedOutput = ""
    assert(onlyVowels(input) == expectedOutput)
  }

  // Test onlyVowelsWithFilter
  // testing vowels with loop
  test("onlyVowelsWithFilter should return the string with only its vowels in order") {
    val input = "Nicaragua"
    val expectedOutput = "iaaua"
    assert(onlyVowelsWithFilter(input) == expectedOutput)
  }

  test("onlyVowelsWithFilter with all lower letters should return the string with only its vowels aeiou") {
    val input = "abcdefghijklmnopqrstruvwxyz"
    val expectedOutput = "aeiou"
    assert(onlyVowelsWithFilter(input) == expectedOutput)
  }

  test("onlyVowelsWithFilter with all upper letters should return empty string") {
    val input = "ABCDEFGHIJKLMNOPQRSTRUVWXYZ"
    val expectedOutput = ""
    assert(onlyVowelsWithFilter(input) == expectedOutput)
  }

  // Test vowelsImproved
  test("vowelsImproved should return the string with only its vowels in order") {
    val input = "Nicaragua"
    val expectedOutput = "iaaua"
    assert(vowelsImproved(input) == expectedOutput)
  }

  test("vowelsImproved should accept different vowelCharacters and keep those") {
    val input = "nicaraguA"
    val acceptedVowels = "gA"
    val ignoredCase = true
    val expectedOutput = "aaga"
    assert(vowelsImproved(input, acceptedVowels, ignoredCase) == expectedOutput)
  }

  test("vowelsImproved should be case sensitive and keep only one upper A") {
    val input = "nicaraguA"
    val acceptedVowels = "A"
    val ignoredCase = false
    val expectedOutput = "A"
    assert(vowelsImproved(input, acceptedVowels, ignoredCase) == expectedOutput)
  }
}
