//class Inputs {
//}

fun main(args: Array<String>){
    print("Enter Your Name: ")
    var name:String= readln()
    println("Welcome, $name")
    //name="Ali"
    //println(name)

    print("\nEnter Your Age: ")
    val age:Int= readln().toInt()
    println("Your Age : $age")

    print("\nEnter Your Department: ")
    val department:String= readln().toString()
    println("Your Department: $department")

    print("\nEnter You avg: ")
    val avg:Double= readln().toDouble()
    println("Your Avg: $avg")


    var title:String?=null
    print("\nEnter Your Title:")
    title= readln()
    //println(title!!)
    println("Your Title: $title")

}