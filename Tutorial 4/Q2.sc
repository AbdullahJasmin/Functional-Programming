object Code {

    def main(args: Array[String]) = { 
        val num = scala.io.StdIn.readInt();
        println(patternMatch(num));
    }  

    def patternMatch(number:Int)= number<=0 match{
        case true => "Negative/Zero"
        case false => number%2==0 match{
            case true => "Even Number"
            case false => "Odd Number"
        }
    }
    

   
}