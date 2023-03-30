fun main () {
    print("Conversor de Unidades\nInsira o número correspondente à conversão de você deseja fazer:\n\n1 - Temperatura\n2 - Tempo\n3 - Distância\n\nResposta: ")
    val convertion:Int = readln().toInt()

    var convertionType:String = when (convertion) {
        1 -> "temperatura"
        2 -> "tempo"
        3 -> "distancia"
        else -> {"Inválido"}
    }

    if (convertionType == "temperatura") {
        print("Qual a unidade de origem?\n\n1 - Celsius\n2 - Fahrenheit\n3 - Kelvin\n\nResposta: ")
        val originUnityType:Int = readln().toInt()
        print("Insira o valor: ")
        val originUnityValue:Double = readln().toDouble()

        print("Qual a unidade de destino?\n\n1 - Celsius\n2 - Fahrenheit\n3 - Kelvin\n\nResposta: ")
        val destinyUnityType:Int = readln().toInt()

        val resultType:String = when (destinyUnityType) {
            1 -> "celsius"
            2 -> "fahrenheit"
            3 -> "kelvin"
            else -> "Inválido"
        }

        val result = when (originUnityType) {
            1 -> { // celsius para
                when (destinyUnityType) {
                    2 -> { // fahrenheit
                        (originUnityValue * 9/5) + 32
                    }
                    3 -> { // kelvin
                        originUnityValue + 273.15
                    }
                    else -> {"Inválido"}
                }
            }
            2 -> { // fahrenheit para
                when (destinyUnityType) {
                    1 -> { // celsius
                        (originUnityValue - 32) * 5/9
                    }
                    3 -> { // kelvin
                        (originUnityValue + 459.67) * 5/9
                    }
                    else -> {"Inválido"}
                }
            }
            3 -> { // kelvin para
                when (destinyUnityType) {
                    1 -> { // celsius
                        originUnityValue - 273.15
                    }
                    2 -> { // fahrenheit
                        (originUnityValue * 9/5) - 459.67
                    }
                    else -> {"Inválido"}
                }
            }
            else -> {"Inválido"}
        }
        if (result == "Inválido" || resultType == "Inválido") {
            println("Ocorreu um erro ao tentar realizar a conversão")
        } else {
            println("O resultado da conversão é: $result $resultType")
        }
    }
    else if (convertionType == "tempo") {
        print("Qual a unidade de origem?\n\n1 - Hora\n2 - Minuto\n3 - Segundo\n\nResposta: ")
        val originUnityType:Int = readln().toInt()
        print("Insira o valor: ")
        val originUnityValue:Double = readln().toDouble()

        print("Qual a unidade de destino?\n\n1 - Hora\n2 - Minuto\n3 - Segundo\n\nResposta: ")
        val destinyUnityType:Int = readln().toInt()

        val resultType:String = when (destinyUnityType) {
            1 -> "horas"
            2 -> "minutos"
            3 -> "segundos"
            else -> "Inválido"
        }

        val result = when (originUnityType) {
            1 -> { // hora para
                when (destinyUnityType) {
                    2 -> { // minuto
                        originUnityValue * 60
                    }
                    3 -> { // segundo
                        (originUnityValue * 60) * 60
                    }
                    else -> {"Inválido"}
                }
            }
            2 -> { // minuto para
                when (destinyUnityType) {
                    1 -> { // hora
                        originUnityValue / 60
                    }
                    3 -> { // segundo
                        originUnityValue * 60
                    }
                    else -> {"Inválido"}
                }
            }
            3 -> { // segundo para
                when (destinyUnityType) {
                    1 -> { // hora
                        (originUnityValue / 60) / 60
                    }
                    2 -> { // minuto
                        originUnityValue / 60
                    }
                    else -> {"Inválido"}
                }
            }
            else -> {"Inválido"}
        }
        if (result == "Inválido" || resultType == "Inválido") {
            println("Ocorreu um erro ao tentar realizar a conversão")
        } else {
            println("O resultado da conversão é: $result $resultType")
        }
    }
    else if (convertionType == "distancia") {
        print("Qual a unidade de origem?\n\n1 - Quilômetro\n2 - Metro\n3 - Centímetro\n\nResposta: ")
        val originUnityType:Int = readln().toInt()
        print("Insira o valor: ")
        val originUnityValue:Double = readln().toDouble()

        print("Qual a unidade de destino?\n\n1 - Quilômetro\n2 - Metro\n3 - Centímetro\n\nResposta: ")
        val destinyUnityType:Int = readln().toInt()

        val resultType:String = when (destinyUnityType) {
            1 -> "quilômetros"
            2 -> "metros"
            3 -> "centímetros"
            else -> "Inválido"
        }

        val result = when (originUnityType) {
            1 -> { // quilômetro para
                when (destinyUnityType) {
                    2 -> { // metro
                        originUnityValue * 1000
                    }
                    3 -> { // centímetro
                        (originUnityValue * 1000) * 100
                    }
                    else -> {"Inválido"}
                }
            }
            2 -> { // metro para
                when (destinyUnityType) {
                    1 -> { // quilômetro
                        originUnityValue / 1000
                    }
                    3 -> { // centímetro
                        originUnityValue * 100
                    }
                    else -> {"Inválido"}
                }
            }
            3 -> { // centímetro para
                when (destinyUnityType) {
                    1 -> { // quilômetro
                        (originUnityValue / 100) / 1000
                    }
                    2 -> { // metro
                        originUnityValue / 100
                    }
                    else -> {"Inválido"}
                }
            }
            else -> {"Inválido"}
        }
        if (result == "Inválido" || resultType == "Inválido") {
            println("Ocorreu um erro ao tentar realizar a conversão")
        } else {
            println("O resultado da conversão é: $result $resultType")
        }
    }
    else {
        println("Opção inválida")
    }
}