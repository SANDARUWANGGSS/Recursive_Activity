package codes
import java.util.Scanner
import scala.io.StdIn._

object Sixth 
{
  def fib(x:Int):Int=
  {
    def fib_tail(x: Int, a: Int, b: Int): Int = x match 
    {
    case 0 => a
    case _ => fib_tail(x-1, b, a + b)
  }
  return fib_tail(x, 0 , 1)
  }
  
  def main(args : Array[String])
  {
    var input = new Scanner (System.in)
    print("Input Your Number ")
    val num=input.nextInt()
    print("Sum Of All The Numbers Below The Number You Have Input : ")
    print(fib(num))
  }  
}