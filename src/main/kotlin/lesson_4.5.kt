fun main() {
    println(decryptedString(encryptString))
}
var encryptString : String = "F2p)v\"y233{0->c}ttelciFc"

fun decryptedString (encryptString : String) : String {
    val twoHalf: Int = encryptString.length / 2
    val twoHalfString: String = encryptString.removeRange(0, twoHalf).reversed().map { char -> char - 4}.joinToString("").replace("_", " ")
    val oneHalfString: String = encryptString.removeRange(twoHalf, encryptString.length).map { char -> char + 1}.joinToString("").replace("5", "s").replace("4","u").map { char -> char - 3}.joinToString("").replace("0", "o")
    val finalString = oneHalfString + twoHalfString
    return finalString // Don't worry. Be happy :)
}