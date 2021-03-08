package one.digitalinnovation.collections

fun main() {

    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)
    for (salario in salarios) {
        println(salario)
    }

    println("--------- 1 - Forma maior/menor/media ------------")
    println("Maior salario R$: ${ salarios.max()}")
    println("Menor salario R$: ${ salarios.min()}")
    println("Media Salarial R$: ${ salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    println("--------- 2 - Forma salario maior que R$ 2500.0 ------------")
    salariosMaiorQue2500.forEach {println(it)}

}