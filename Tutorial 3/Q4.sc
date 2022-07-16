
object Code {

    def main(args: Array[String]) = {
        var qty:Double = 60;
        var totalWholesaleCost: Double = bookPrice(qty)-discount(bookPrice(qty))+shippingCost(qty);
        println(totalWholesaleCost);
    }  

    def bookPrice(price:Double):Double=price*24.95;
    def discount(value:Double):Double=value*.4;
    def shippingCost(cost:Double)= if(cost<=50) 3 else 3+(cost-50)*.75;

 
}