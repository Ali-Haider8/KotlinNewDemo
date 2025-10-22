class Functions

fun main(args: Array<String>){
    /*show(10)
    show(31)
    show(314)*/

    var sumResults=sum(10.5,12.5)
    println("Sum: $sumResults")
    sumResults=sum(24.4,24.6)
    println("sum: $sumResults")

    showName("Ali")
}
/*

fun show(number:Int){
    println(" number is $number")
}*/
fun sum(n1:Double, n2:Double):Double{
    val sumVal=n1+n2
    return sumVal
}
fun showName(name:String){
    println(name)
}