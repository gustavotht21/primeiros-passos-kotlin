fun main() {
    // ===x===x===x===x=== Questão 1 ===x===x===x===x===
    print("Insira um número para realizar uma soma: ")
    var userNumberOne:Int = readln().toInt()
    print("Insira outro número para realizar uma soma: ")
    var userNumberTwo:Int = readln().toInt()
    print("O resultado dessa soma é ${userNumberOne+userNumberTwo}")

    // ===x===x===x===x=== Questão 2 ===x===x===x===x===
    print("Insira um número para ser elevado ao quadrado: ")
    var userNumberSquare:Int = readln().toInt()
    print("O número $userNumberSquare elevado ao quadrado é: ${userNumberSquare*userNumberSquare}")

    // ===x===x===x===x=== Questão 3 ===x===x===x===x===
    print("Insira o seu nome: ")
    var userName:String = readln()
    print("Insira a sua idade: ")
    var userAge:Int = readln().toInt()
    print("Bem-vindo $userName!! A idade que você inseriu é $userAge!")
}