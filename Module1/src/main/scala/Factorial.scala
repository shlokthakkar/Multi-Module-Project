class Factorial {

  def factorial(n:Int,temp:Int=1): Int ={
    if(n<=1) {
      temp
    }
    else{
      factorial(n-1,temp*n)
    }
  }

}
