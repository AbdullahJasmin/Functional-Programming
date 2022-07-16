
object Code {

    def main(args: Array[String]) = {
        
        var time: Int = easy(2)+tempo(3)+easy(2);
        println(time);
    }  

    def easy(x:Int):Int=x*8;
    def tempo(x:Int):Int=x*7;


}   