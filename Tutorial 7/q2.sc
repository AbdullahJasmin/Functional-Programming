object Code {
  def main(args: Array[String]) = {
    val x = new Rational(3, 4)
    val y = new Rational(5, 8)
    val z = new Rational(2, 7)
    println(x - y - z)
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

  def -(r: Rational): Rational = {
    val z = new Rational(x * r.y - y * r.x, y * r.y)
    return z
  }

  override def toString: String = num.toString + "/" + den.toString

}
