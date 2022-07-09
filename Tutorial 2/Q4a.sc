object Code {

    def main(args: Array[String]) = {
        println(takeHome(40,30));
    }  

    def wage(hours:Double):Double=hours*250;

    def ot(hours:Double):Double=hours*85;

    def income(h1:Double,h2:Double):Double=wage(h1)+ot(h2);

    def tax(income:Double):Double=income*.12;

    def takeHome(h1:Double,h2:Double):Double= income(h1,h2)-tax(income(h1,h2));

   
}