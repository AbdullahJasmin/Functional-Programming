object Code {
  def main(args: Array[String]) = {
    val i1 = new Rational(20, 15)
    print(i1.neg())
  }
}

def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

class Rational(num: Int, den: Int) {

  val x = num / gcd(num, den)
  val y = den / gcd(num, den)

  def neg(): Rational = {
    val z = new Rational(-x, y)
    return z
  }

  override def toString: String = num.toString + "/" + den.toString

}
