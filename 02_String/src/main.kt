fun main() {

   val nome = "Alexandre"

    // Concatenação de strings
   println("Menu nome é $nome !!!")

   // Strings longas
   val str = """Eu tenho vivido
               |sobre fortes emoções
               |na trajetória de minha vida !!
               """.trimMargin()

   println(str)
   println("Tamanho da variável 'str' é de ${str.length} bytes")
}