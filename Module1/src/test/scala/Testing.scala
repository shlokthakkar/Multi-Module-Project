import org.scalatest.flatspec.AnyFlatSpec

class Testing extends AnyFlatSpec{

  val fact = new Factorial

  behavior of "Factorial of 5"
  it should "match with 120" in{
    assert(fact.factorial(5)==120)
  }
}
