 class Pessoa (var nome:String, var idade: Int) {
     override fun toString(): String {
         return "Classe: Pessoa. Nome: ${nome}, Idade: ${idade}"
     }
}

fun main(){
    var kamila = Pessoa("kamila", 26)
    println(kamila)
}