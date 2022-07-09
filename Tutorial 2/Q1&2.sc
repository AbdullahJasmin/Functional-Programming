object Code {
    def main(args: Array[String]) = {
        
        var j : Int = 2;
        var i : Int = j;
        var k : Int = i;
        
        var n : Int = 5;
        var m : Int = n;

        var f : Float = 12.0f;
        var g : Float = 4.0f;
        var c : Char= 'X';
        
        println(k + 12 * m); //a)
        println(m / j); //b)
        println(n % j); //c)
        println(m / j * j); //d)
        println(f + 10*5 +g); //e)
        println( (i+1) * n); //f)
        // println( (++i) * n); //++i is not valid in scala
    }
}