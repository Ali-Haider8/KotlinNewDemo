//class whenConditiondsddssd  {
//}

fun main (args: Array<String>){
//    print
    print("Enter Number: ")
    val number: Int = readln().toInt()
    when (number) {
        1->{
            println("You have enterd one")
        }
        2->{
//            println("You have entered Two")
            println("You have entered Two")

        }
        3,4->{
            println("You entered Three or Four")
        }
        in 15..30->{
            println("You entered between 15 and 30")
        }
        !in 15..30->{
            println("You did not enter number between 15 and 300")
        } else-> {
            println("out of range")
        }
    }
}