class MyThread : Thread {
    var processName: String? = null

    constructor(processName:String) : super() {
        this.processName = processName
    }

    override fun run() {
        var count = 0
        while (count < 10) {
            println("${this.processName} count: $count")
//            println(count)
            count++
            try {
                sleep(1000)
            } catch (ex: Exception) {
                println(ex.message)
            }
        }
    }

}
fun main(args: Array<String>){
    var t1=MyThread("t1")
    t1.start()
    var t2=MyThread("t2")
    t2.start()
    t2.join()
    var t3=MyThread("t3")
    t3.start()
//    var t4=MyThread("t4")
//    t4.start()
    println("Thread in running")

}