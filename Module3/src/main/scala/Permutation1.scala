class Permutation1 {

  val fac = new Factorial()
  val per = new Permutation()

  def npr(n:Int,r:Int):Int={
    per.ncr(n,r)*fac.factorial(r)
  }
}
