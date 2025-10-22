import java.util.*

class Strings

fun main (args: Array<String>){
    var msg=" Welcome to NJ"
    for (index in 0..msg.length-1) {
        println("msg[$index]=" + msg[index])
    }
    var name:String = "Ali"

    var msgWelcome:String= msg+ ", " +name
    println(msgWelcome)
    println(msgWelcome.lowercase(Locale.getDefault()))
    println(msgWelcome.uppercase(Locale.getDefault()))
    println(msg.trim())
    println(msgWelcome.split(","))
}