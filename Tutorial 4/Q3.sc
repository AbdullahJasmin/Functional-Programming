object Code {

    def main(args: Array[String]) = { 
        println(formatNames("Benny")()(toUpper));
        println(formatNames("Niroshan")(1)(toUpper));
        println(formatNames("Saman")()(toLower));
        println(formatNames("Kumara")(5)(toUpper));
    }  

    def toUpper(name:String):String = name.toUpperCase();
    def toLower(name:String):String = name.toLowerCase();
    
    def formatNames(name:String)( list: Int*)(function: String => String): String = {
        if (list.isEmpty){
            return function(name);
        }
 
        var temp = "";
        var i=0;
        while(i<name.length()){
            if(list.contains(i)) temp = temp+ function(name.charAt(i).toString);
            else temp=temp+name.charAt(i).toString;
            i=i+1;
        }
        return temp;
 
    }
}