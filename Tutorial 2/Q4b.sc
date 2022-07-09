object Code {

    def main(args: Array[String]) = {
        println(profit(5));
        println(profit(10));
        println(profit(15));
        println(profit(20));
        println(profit(25)); //Profit is max when price is 25
        println(profit(30));
        println(profit(35));
    }  

def attendees(price:Int):Int=120+(15-price)/5*20;

def revenue(price:Int):Int = attendees(price)* price;

def cost(price:Int):Int=500+attendees(price);

def profit(price:Int):Int = revenue(price)- cost(price);
}