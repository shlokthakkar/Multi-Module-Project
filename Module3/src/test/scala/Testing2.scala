import org.scalatest.flatspec.AnyFlatSpec

class Testing2 extends AnyFlatSpec{

  val perm1 = new Permutation1
  val perm2 = new Permutation


  behavior of "Permutation of 5,3"
  it should("Match with 60")in {
    assert(perm1.npr(5,3)==perm2.npr(5,3))
  }

}
