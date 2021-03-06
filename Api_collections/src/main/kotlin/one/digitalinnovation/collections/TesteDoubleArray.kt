package one.digitalinnovation.collections

fun main() {

    println("---------------- 1 - Forma Double Array  -----------")
    val salarios = DoubleArray(size = 3)
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0
    salarios.forEach { println(it) }

    println("---------------- 2 - Forma Double Array  -----------")
    salarios.forEachIndexed { index, salario ->
        salarios[index] = salarios * 1.1
    }
    salarios.forEach { println(it) }
}