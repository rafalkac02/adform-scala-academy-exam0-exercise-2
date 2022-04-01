import org.scalatest._
import flatspec._
import matchers._
import Isogram._

class IsogramSpec extends AnyFlatSpec with should.Matchers {

  "isIsogram()" should "take word (string) and return true if the word is isogram and false if otherwise." in {

    isIsogram("lumberjacks") shouldBe true
    isIsogram("background") shouldBe true
    isIsogram("downstream") shouldBe true
    isIsogram("six-year-old") shouldBe true

    isIsogram("isograms") shouldBe false
    isIsogram("hello") shouldBe false
  }
}