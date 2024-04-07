    fun main(){
        //Unit é a mesma coisa que void
        //se nao passar o default é void
//        var nome = retornaNome();
//        println(nome)
        dizOi(retornaNome())

    }

    fun retornaNome(): String{
        return "Kamila"
    }

    fun dizOi(nome: String ){
        println("Oi ${nome}")
    }
