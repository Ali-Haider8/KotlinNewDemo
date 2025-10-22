import java.util.*

//class FindMyAGe {
//


fun main(args: Array<String>) {

    //input


    val year = Calendar.getInstance().get(Calendar.YEAR)
    val month = Calendar.getInstance().get(Calendar.MONTH)
//    val week = Calendar.getInstance().get(Calendar.WEEK_OF_YEAR)
//    val day = Calendar.getInstance().get(Calendar.DAY_OF_YEAR)

//    val weeksNumber = Calendar.getInstance().get(Calendar.)


    print("Enter Your Birth Year: ")
    val yearOfBirth: Int = readln().toInt()
    print("Enter Your Birth Month: ")
    val monthOfBirth: Int = readln().toInt()
//    print("Enter ")
//    val weekBirth: Int = read().toInt()
    print("Enter Your Birth Day: ")
//    val dayOfBirth: Int = read().toInt()




    //process

    val ageYear = year - yearOfBirth
    val ageMonth = month - monthOfBirth
//    val ageDay = day - dayOfBirth
//    val weeks = ageDay / 360




    //output

    println("Your Age is: ")
    print("$ageYear Years \n$ageMonth Months "
    /*    $weeks Weeks
    $ageDay Days*/)



}



