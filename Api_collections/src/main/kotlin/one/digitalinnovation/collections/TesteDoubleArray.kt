package one.digitalinnovation.collections

fun main() {

    println("---------------- 1 - Forma Double Array  -----------")
    val salarios = DoubleArray(size = 3)
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0
    salarios.forEach { println(it) }

    println("---------------- 2 - Forma Double Array  -----------")
    salarios.forEachIndexed { index: Int, salario: Double ->

        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    println("---------------- 3 - Forma Double Array ordenado -----------")
    val salarios2 = doubleArrayOf(1500.0, 1200.0, 5000.0)
    salarios2.sort()
    salarios2.forEach { println(it) }

}

