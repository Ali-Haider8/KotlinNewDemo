import Outer.Inner

class InnerClass
class Outer {
    val name:String = "Ali"

    inner class Inner {
        fun getMSG():String {
            return "Welcome, User"
        }
        fun getName():String{
            return name
        }
    }
}
fun main(args: Array<String>){
    val out=Outer()
//    val inner=Inner()
//    val getname=Outer.Inner().getMSG()
//    println(inner.getMSG())
}