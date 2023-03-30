fun main() {
    // ===x===x===x===x=== Questão 1 ===x===x===x===x===
    print("Insira a primeira nota do aluno: ")
    val scoreOne:Double = readln().toDouble()
    print("Insira a segunda nota do aluno: ")
    val scoreTwo:Double = readln().toDouble()


    val studentAverage:Double = (scoreOne+scoreTwo)/2
    if (studentAverage >= 7) {
        println("O aluno está aprovado com nota $studentAverage")
    } else {
        println("O aluno está reprovado com nota $studentAverage")
    }

    // ===x===x===x===x=== Questão 2 ===x===x===x===x===
    print("Insira um número inteiro: ")
    var numberOne:Int = readln().toInt()


    if (numberOne%2 == 0) {
        println("O número é par")
    } else {
        println("O número é ímpar")
    }

    // ===x===x===x===x=== Questão 3 ===x===x===x===x===
    print("Insira um número inteiro: ")
    var numberTwo:Int = readln().toInt()


    if (numberTwo == 0) {
        println("O número é igual a zero")
    } else {
        if (numberTwo > 0) {
            println("O número é positivo")
        } else {
            println("O número é negativo")
        }
    }

    // ===x===x===x===x=== Questão 4 ===x===x===x===x===
    print("Insira a idade de uma pessoa: ")
    var numberThree:Int = readln().toInt()


    if (numberThree >= 18) {
        println("Essa pessoa é maior de idade")
    } else {
        println("Essa pessoa é menor de idade")
    }
}