fun main(){
var idaya=Human(22, "Riri", 22.1)
    idaya.eat(10)
    idaya.speak("I love eating")
    idaya.birthday()
     var list=User("Rita", "Ora", "ritaora@gmail.com", "0734521422", "24fw7652f")
    list.detail()
}
class Human(var age:Int, var name:String, var weight:Double){
    fun eat(foodWeight:Int){
        var newWeight=weight+foodWeight
        println("I am eating $newWeight kgs of food.")
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        var newage=++age
        println(newage)
    }

}


class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:String , var password:String){
    fun detail(){
        println(firstName)
        println(phoneNumber)
    }

}














