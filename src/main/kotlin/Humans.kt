fun main(){
   var likes: Int = 111
    var Str: String = ""
   Str = if(likes % 10 == 1 && likes % 100 != 11) "человеку" else  "людям"
    println("Понравилось " + likes + " " + Str )

}

