object Code {

    def main(args: Array[String]) = { 
        val text = scala.io.StdIn.readLine("Code: ");
        print("Encrypt (1) Decrypt (0): ");
        val encryptOrDecrypt = scala.io.StdIn.readInt();
        cipher(text,encryptOrDecrypt);  
    }  

    def cipher(inputText: String, encryptDecrypt: Int) = encryptDecrypt match {
        case 1 => encrypt(inputText)
        case 0 => decrypt(inputText) 
    }


    def encrypt(inputText: String) = {
		val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
		val shift = 3
		val outputText = inputText.map(c => (c.toUpper + shift).toChar)
		println(outputText)
	}
 
    def decrypt(inputText: String) = {
        val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        val shift = 3
        val outputText = inputText.map(c => (c.toUpper - shift).toChar)
        println(outputText)
    }

}