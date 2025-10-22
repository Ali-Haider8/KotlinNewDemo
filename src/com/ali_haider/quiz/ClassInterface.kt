package com.ali_haider.quiz

class ClassInterface


interface op {
    fun sum(n1: Int, n2: Int) {

    }

    fun sub(n1: Int, n2: Int) {

    }

    class Userop : op {
        override fun sum(n1: Int, n2: Int) {
            print(n1 + n2)
        }

        override fun sub(n1: Int, n2: Int) {
            print(n1 - n2)
        }
    }

    class Adminop : op {
        override fun sum(n1: Int, n2: Int) {
            print(n1 + n2 + 10)
        }

        override fun sub(n1: Int, n2: Int) {
            print(n1 - n2 - 10)
        }
    }

}

/*
fun main(args: Array<String>) {
    val userOp= op.Userop()
    userOp.sum(10,40)
    userOp.sum(10,40)

    var adminOp= op.Adminop()
    adminOp.sub(10,340)
}
*/
