/*
class LoopControl {
}*/
fun main (args : Array<String>){
    loop@ for(count in 1..10){
        /*if (count==5){
//            break
            continue
        }
        println(count)*/
        for (count2 in 1..3){
          println("$count- ($count2) Ali")
            if (count2==3){
                break@loop
            }
        }
    }

    print("End App")
}