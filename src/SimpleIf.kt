/*
class SimpleIf {
}*/
fun main(args: Array<String>) {

    print("Enter your grade: ")
    val grade: Int = readln().toInt()
    if (grade >= 50) {
        println("Congratulations, You have passed")

    } else {
        if (grade >= 45) {
            val newgrade = 50 - grade
            println("You Got $newgrade Curve, You Pass")
        } else {
            println("You Fail!\nWork Harder")
        }
    }

}
