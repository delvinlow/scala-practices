import org.scalatest.funsuite.AnyFunSuite
import com.delvinlow.scalabasics.StringExercises._

class TestStringExercises extends AnyFunSuite {
  test("toReverse() should reverse a string in lower caps") {
    assert(toReverse("abcdef") == "fedcba")
  }

  test("toReverse() should reverse a sentence") {
    assert(toReverse("The quick brown fox jumps.") == ".spmuj xof nworb kciuq ehT")
  }

  test("toUpper should return the string in upper case") {
    assert(toUpper("abcdef") == "ABCDEF")
  }

  test("toUpperAndReversed should return upper case and reversed") {
    assert(toUpperAndReversed("abcdef") == "FEDCBA")
  }
}
