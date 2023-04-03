import org.scalatest.flatspec.AnyFlatSpec

class Testing1 extends AnyFlatSpec{

  val permutation = new Permutation()

  behavior of "Combination of 5,3"
  it should "match with 10" in{
    assert(permutation.ncr(5,3)==10)
  }

  behavior of "Permutation of 5,3"
  it should("Match with 60")in {
    assert(permutation.npr(5,3)==60)
  }
}
