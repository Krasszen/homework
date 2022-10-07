
fun main() {
    var firstName: String = "Сергей"
    var lastName: String = "Красавин"
    var height: Double = 1.82
    var weight: Float = 98.3f
    var isChild: Boolean = (height <= 1.50) && (weight <= 40)
    var info: String = "Я $firstName $lastName. Мой рост $height м. и мой вес $weight кг. Если спросить ребенок ли я, отвечу \"$isChild\""
    println(info)
    height = 1.72
    println(info)
}