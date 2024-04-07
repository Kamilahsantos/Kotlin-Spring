class Carro(var cor: String, var anoFabricacao: Int, val dono: Dono) {

//val imutavel nao pode fazer set
//var pode alterar
//se nao coloca val ou var não consegue acessar a variavel


}

data class Dono(var nome: String, var idade: Int) {
//se coloca como dataclass ele imprime o valor e não a ref ao objeto
}

fun main() {
    var carro = Carro("vermelho", 2024, Dono("Kamila", 26))
    println(carro.cor)
    carro.cor = "violeta"
    println(carro.cor)
    println(carro.dono.nome)
}