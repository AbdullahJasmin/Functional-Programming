object Code {

    def main(args: Array[String]) = { 
         fibSeq(5); 
    }  
  
    def fib(a:Int): Int = a match {
        case 0 => 0
        case x if x==1 =>1
        case _ => fib(a-1) +fib(a-2)
    }

    def fibSeq(a:Int):Unit = {
        if (a>0) fibSeq(a-1)
            println(fib(a))
    }
}
    

   
