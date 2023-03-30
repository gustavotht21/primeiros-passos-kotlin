fun main () {
    // ===x===x===x===x=== Questão 1 ===x===x===x===x===
    print("Insira um número de 1 a 7: ")
    var numberToDay:Int = readln().toInt()

    val day:String = when (numberToDay) {
        1 -> "Domingo"
        2 -> "Segunda"
        3 -> "Terça"
        4 -> "Quarta"
        5 -> "Quinta"
        6 -> "Sexta"
        7 -> "Sábado"
        else -> {
            "Não identificado"
        }
    }
    println("O dia da semana é: $day")

    // ===x===x===x===x=== Questão 2 ===x===x===x===x===

    print("Insira um animal: ")
    var animal:String = readln().lowercase()

    var classAnimal = when (animal) {
        "leão" -> "Mamífero"
        "cachorro" -> "Mamífero"
        "gato " -> "Mamífero"
        "coala" -> "Mamífero"
        "macaco" -> "Mamífero"
        "alpaca" -> "Mamífero"

        "águia" -> "Ave"
        "gavião" -> "Ave"
        "pombo" -> "Ave"
        "galinha" -> "Ave"
        "pato" -> "Ave"
        "pinguim" -> "Ave"

        "tartaruga" -> "Réptil"
        "jabuti" -> "Réptil"
        "cobra" -> "Réptil"
        "jacaré" -> "Réptil"
        "crocodilo" -> "Réptil"
        "lagarto" -> "Réptil"

        else -> {"Não identificado"}
    }
    println("O animal $animal é um $classAnimal")

    // ===x===x===x===x=== Questão 3 ===x===x===x===x===
    print("Insira uma letra: ")
    val letter:String = readln().lowercase()

    val type = when (letter) {
        "a" -> "é um vogal"
        "e" -> "é um vogal"
        "i" -> "é um vogal"
        "o" -> "é um vogal"
        "u" -> "é um vogal"
        else -> {
            "é uma consoante"
        }
    }
    println("A letra $type")

    // ===x===x===x===x=== Questão 4 ===x===x===x===x===
    print("Insira um número: ")
    val number:Int = readln().toInt()

    val month:String = when (number) {
        1 -> "Janeiro"
        2 -> "Fevereiro"
        3 -> "Março"
        4 -> "Abril"
        5 -> "Maio"
        6 -> "Junho"
        7 -> "Julho"
        8 -> "Agosto"
        9 -> "Setembro"
        10 -> "Outubro"
        11 -> "Novembro"
        12 -> "Dezembro"
        else -> {
            "Não identificado"
        }
    }
    println("O mês é: $month")

}
