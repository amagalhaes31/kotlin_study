/**
 Type       Bit
 Double     64
 Float      32
 Long       64
 Int        32
 Short      16
 Byte       8
 Boolean    ?
 String     ?
 Char       ?
 */

fun main() {
    println("Hello World !!! \n")

    // Variáveis mutáveis
    // var -> Pode alterar o valor da variável durante o código
    var nome: String
    var idade: Byte = 33
    var peso: Float = 80.5f

    nome = "Alexandre"

    // Variáveis imutáveis
    // val -> Não pode alterar o valor da variável durante o código.
    val nomePai: String = "Jose B Magalhaes"


    // Size variables
    println("Double: Max: " + Double.MAX_VALUE + " -> Min: " + Double.MIN_VALUE)
    println("Float:  Max: " + Float.MAX_VALUE  + " -> Min: " + Float.MIN_VALUE)
    println("Int:    Max: " + Int.MAX_VALUE    + " -> Min: " + Int.MIN_VALUE)
    println("Byte:   Max: " + Byte.MAX_VALUE   + " -> Min: " + Byte.MIN_VALUE)


}