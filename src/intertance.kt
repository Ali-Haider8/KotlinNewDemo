class intertance

open class Operations {

    protected var process: String = "A"
    open fun sum(n1: Double, n2: Double): Double {
        return n1 + n2
    }

    open fun sub(n1: Double, n2: Double): Double {
        return n1 - n2
    }

    fun myProcess() {
        println(process)
    }
}

class MulOperations : Operations() {
    fun multiply(n1: Double, n2: Double): Double {
        println(process)
//        val text:Double = "    AAAA".toDouble()
        return n1 * n2
    }

    override fun sum(n1: Double, n2: Double): Double {
        super.sub(10.0, 20.0)
        return n1 + n2
    }

    override fun sub(n1: Double, n2: Double): Double {
        return n1 - n2 + 15
    }

    fun div(n1: Double, n2: Double): Double {
        return n1 / n2
    }


}

fun main(args: Array<String>) {
    var op = Operations()
    println(op.sum(20.0, 20.0))
    println(op.sub(20.0, 5.0))
    var op3 = Operations()
//    println(op3.process+" <<<<")
    var getprocess = Operations()
//    println(getprocess.process)
    println("---\n")
    var mulop = MulOperations() as Operations
    println(mulop.sum(20.0, 20.0))
    println(mulop.sub(20.0, 5.0))
//    println(mulop.div(10.0,5.0))
//    println(mulop.multiply(10.0,5.0))

}

