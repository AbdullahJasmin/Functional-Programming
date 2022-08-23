object Code {

    def main(args: Array[String]) = { 
        println(addEven(5)); 
    }  
  
    
    def isEven(a:Int):Boolean= a match{
        case 0 => true
        case _ => isOdd(a-1)
    }

    def isOdd(a:Int):Boolean = !(isEven(a))

    def addEven(a:Int): Int = {
        if(a>0) {
            if(isOdd(a)) { 
                return (a-1 +addEven(a-3))
            }
            else {
                return (a + addEven(a-2))
            }
        }
        else{
            return 0
        }
        
    

    }
}
    

   
