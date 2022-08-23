object Code {

    def main(args: Array[String]) = { 
        println(isOdd(5));
        println(isEven(5));
    }  
  
    
    def isEven(a:Int):Boolean= a match{
        case 0 => true
        case _ => isOdd(a-1)
    }

    def isOdd(a:Int):Boolean = !(isEven(a))
}
    

   
