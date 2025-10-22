
//class Car(Type: String, Model: Int, Price: Double, MilesDrive: Int, Owner: String) {
class Car {
    var Type:String?=null
    var Model: Int?=null
    var Price: Double?=null
    var MilesDrive: Int?=null
    var Owner: String?=null
    constructor (Type:String, Model:Int, Price:Double, MilesDrive:Int, Owner:String) {
        println("Type: $Type")
        this.Type=Type
        println("Model: $Model")
        this.Model=Model
        println("Price: $Price")
        this.Price=Price
        println("MilesDrive: $MilesDrive")
        this.MilesDrive=MilesDrive
        println("Owner: $Owner")
        this.Owner=Owner
    }

    constructor(){
        this.Type="Rio"
        this.Model=2012
        this.Price=8000.450
        this.MilesDrive=0
        this.Owner="Jack"
    }

    fun GetPrice(): Double {
        return this.Price!! -(this.MilesDrive!!.toDouble()*10 )
    }

    fun GetOwner(): String?{
        return this.Owner!!
    }
}
fun main(args: Array<String>) {
    var kiaCar = Car("KIA", 2019, 10000.0, 13, "Unknown")
    println("\nCar Price: "+kiaCar.GetPrice())
    println("Car Owner: "+kiaCar.GetOwner()+"\n")
    var bmwCar = Car()
    println("Car Price: "+bmwCar.GetPrice())
    println("Car Owner: "+bmwCar.GetOwner())
}