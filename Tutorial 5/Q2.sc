object Code {

    def main(args: Array[String]) = { 
        primeSeq(5);
    }  
 
    def prime(p:Int,n:Int=2):Boolean= n match {
        case x if(x==p) => true
        case x if GCD(p,x)>1 => false
        case x => prime(p,x+1)
    }


    def GCD(a:Int,b:Int):Int=b match{
        case 0 => a
        case b if b>a => GCD(b,a)
        case _ => GCD(b,a%b)
    }
    
    def primeSeq(a:Int) : Unit = {
        if(a > 1) {
            primeSeq(a-1)
        }  
        else {
            return
        } 
        if(prime(a)) println(a) 
    }
}
    

   
