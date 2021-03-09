package one.digitalinnovation.collections

fun main() {

    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)
    for (salario in salarios) {
        println(salario)
    }

    println("--------- 1 - Forma maior/menor/media ------------")
    println("Maior salario R$: ${ salarios.maxOrNull()}")
    println("Menor salario R$: ${ salarios.min()}")
    println("Media Salarial R$: ${ salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }

    println("--------- 2 - Forma salario maior que R$ 2500.0 ------------")
    salariosMaiorQue2500.forEach {println(it)}

    println("--------- 3 - Quantidade de salarios entre R$ 2000.0 e R$ 5000.0 ------------")
    println(salarios.count{it in 2000.0..5000.0})

    println("--------- 4A - Busca de um valor específico existente ------------")
    println(salarios.find{it == 2250.0})

    println("--------- 4B - Busca de um valor específico não existente ------------")
    println(salarios.find{it == 500.0})

    println("--------- 5 - Encontra um valor específico - retorno booleano ------------")
    println(salarios.any{it == 1000.0})

}