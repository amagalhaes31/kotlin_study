/*
    Author: Alexandre Magalhães
    Date: August 18th, 2020
    Link: https://kotlinlang.org/docs/reference/lambdas.html
 */

/*
    Parametro de entrada: list: List<Int>
 */
fun filter (list: List<Int>, filtrate: (Int) -> (Boolean)) : List<Int> {
    val newList = mutableListOf<Int>()
    for (item in list) {
        if (filtrate(item)) {
            newList.add(item)
        }
    }
    return newList
}

// Se a divisão por 2 for igual 0, retorna true
fun numerosPares(numero: Int) = numero % 2 == 0

// Se o número for maior que 3, retorna true
fun numerosMaiorQueTres(numero: Int) = numero > 3


fun main(){

    val numerosInteiros = listOf<Int>(1,2,3,4,5)
    println(numerosInteiros)

    var list = filter(numerosInteiros, ::numerosPares)
    println(list)

    list = filter(numerosInteiros, ::numerosMaiorQueTres)
    println(list)
}
