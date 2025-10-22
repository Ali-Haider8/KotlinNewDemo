class arrays

fun main (args: Array<String>){
    var arrayString =Array<String>(5){" "}
//    arrayInt[2]=40
    for (index in 0..4){


        print("$index- Enter element number: ")
        arrayString[index]= readln().toString()
    }
    println("List of elements")
    for (item in arrayString){
        println(item)
    }
}