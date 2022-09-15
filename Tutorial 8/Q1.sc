object code {
  def main(args: Array[String]) = {
    val p1 = new Point(1, 2)
    val p2 = new Point(3, 4)
    val p3 = p1 + p2
    println(p3)

    val p4 = p1.move(10, 10)
    println(p4)

    println(p1.distance(p2))

    println(p1.invert())
  }
}

case class Point(x: Int, y: Int) {

  def +(p: Point) = Point(this.x + p.x, this.y + p.y)

  def move(xCord: Int, yCord: Int) = Point(this.x + xCord, this.y + yCord)

  def distance(p: Point) =
    math.sqrt(math.pow(p.x - this.x, 2) + math.pow(p.y - this.y, 2)) // {(x2 - x1)^2 + (y2 - y1)^2}^1/2

  def invert() = Point(this.y, this.x)

  override def toString() = "(" + x + ", " + y + ")"
}
