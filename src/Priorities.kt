//class Priorities {
//}
/*
Operation rules | Priorities
1- ()
2- ∧
3- *,/
4- +,-
5- =

 */
fun main(args: Array<String>){
    val n1=20
    val n2=10
    val n3=2

    var sum:Int?=null

    sum=(n1+n2)*n3-3
    println(sum)

    sum=(n1+n2)/n3
    println("sum2: $sum")

}