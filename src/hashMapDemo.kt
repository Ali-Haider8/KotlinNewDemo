/*class hashMapDemo {
}*/
fun main(args: Array<String>){
    var map=HashMap<Int, String>()
    map.put(1, "Ali")
    map.put(2, "Haider")
    map[3]="Hasan"
    map[4]="Jasim"
    println(map[2])
    map[2]="Haider Hassan"
    println(map[2])

    for (key in map.keys){
        println(map[key])
    }
}