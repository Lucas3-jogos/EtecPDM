// Aula 1: Primeiro contato

fun main() {
    println("1. Olá, mundo!")

    print("2. Lucas")
    print(" ")
    print("Sousa")

    println()

    var nome = "3. Lucas\nda\nSilva\nSousa"
    println(nome)

    // var nome = "Não posso redeclarar uma variável"
    nome = "Lucas" // mas posso reatribuir um novo valor
    print("4. Olá, " + nome + "\n")

    var sobrenome = "Sousa"
    println("5. Como vai, $nome $sobrenome?")

    val variavelEstatica = "Bom dia"
    // variavelEstatica = "Não posso reatribuir um novo valor!"

    val nomeCompleto = "6. " + nome + " da Silva " + sobrenome
    println(nomeCompleto)
    println("7. $variavelEstatica, ${nomeCompleto}!")
}
