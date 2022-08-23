object Code {

    def main(args: Array[String]) = { 
        println(sum(5));
    }  
  
    
    def sum(a:Int):Int= a==1 match{
        case true => 1
        case false => a+ sum(a-1)
    }
}
    

   
