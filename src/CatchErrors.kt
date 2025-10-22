class CatchErrors

fun main(args: Array<String>) {

    val n1=60
    val n2=0
    val n3=40
    println(n1+n2-n3)
    try {
        println(n1/n2)
    } catch (ex: Exception) {
        println(ex.message)
    }
    println(n1*n3)
}