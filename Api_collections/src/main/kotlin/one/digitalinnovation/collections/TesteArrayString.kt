package one.digitalinnovation.collections

fun main() {
    println("---------------- 1 - Forma Array String -----------")
    val nomes = Array( size = 3){""}
        nomes[0] = "Maria"
        nomes[1] = "Zazá"
        nomes[2] = "José"

    for (nome in nomes) {
        println(nome)
    }

    println("---------------- 2 - Forma Array String ordem alfabetica -----------")
    nomes.sort()
    nomes.forEach { println(it) }

    println("---------------- 3 - Forma Array String ordem alfabetica -----------")
    val nomes2 = arrayOf("Maria", "Zazá", "Pedro")
    nomes2.sort()
    nomes2.forEach { println(it) }

}
