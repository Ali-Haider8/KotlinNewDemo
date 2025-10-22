import java.util.Locale

class ArrayList

fun main(args: Array<String>) {
    var arrayList = ArrayList<String>()
    arrayList.add("Ali")
    arrayList.add("Haider")
    arrayList.add("Hasan")
    arrayList.add("Jasim")
    arrayList[1]="Haider Hasan"

    for (item in arrayList) {
        println(item)
    }

    for (index in 0.. arrayList.size-1){
        println(arrayList[index])
    }

    println("Search name")
    var search = readln().toString()
    if (arrayList.contains(search)){
        println("Name is found")
    } else {
        println("Name is not found")
    }

}