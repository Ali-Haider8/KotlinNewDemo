/*
class IFelseIF {
}
*/
fun main(args: Array<String>) {
    print("Enter Your Grade: ")
    val grade: Int = readln().toInt()
    if (grade >= 90) {
        println("You Got (+A) Mark")
    } else if (grade >= 80 && grade < 90) {
        println("You Got (B) Mark")
    } else if (grade >= 70 && grade < 80) {
        println("You Got (C) Mark")
    } else {
        println("You Fail!")

    }
}