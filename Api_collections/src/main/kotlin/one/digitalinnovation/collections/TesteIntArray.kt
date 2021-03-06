package one.digitalinnovation.collections

fun main () {
    val values = IntArray(size=5)
    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2
    println("------- 1 - Forma --------")
    for (valor in values) {
        println(valor)
    }

    println("------- 2 - Forma --------")
    values.forEach {
        println(it)

    }
    println("------- 3 - Forma --------")
    for (index in values.indices) {
        println(values[index])
    }
    println("------- 4A - Forma sort asc--------")
    values.sort()
    for (valor in values) {
        println(valor)
    }
    println("------- 4B - Forma sort desc--------")
    values.sortDescending()
    for (valor in values) {
        println(valor)
    }

//    println("------- 5 - Forma IntArrayOf --------")
//    val values = intArrayOf(2, 3, 6, 1, 10, 8)
//     values.forEach {
//        println(it)
//    }

}
