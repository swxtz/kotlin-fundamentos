package fundamentos

class Pessoa(var nome: String, var idade: Int) {
    override fun toString(): String {
        return "Classe: Pessoa, ${nome}, Idade, ${idade}"
    }
}

fun main() {
    val pessoa = Pessoa("Gustavo", 17)
    println(pessoa)
}
