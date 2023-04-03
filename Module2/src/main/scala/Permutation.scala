class Permutation {

  val fact = new Factorial

  def ncr(n:Int,r:Int):Int={
    fact.factorial(n)/(fact.factorial(n-r)*fact.factorial(r))
  }

  def npr(n:Int,r:Int):Int={
    fact.factorial(n)/fact.factorial(n-r)
  }
}
