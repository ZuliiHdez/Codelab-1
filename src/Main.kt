fun main() {
        saludar("Alumno")
        val resultado = sumar(5, 3)
        println("La suma es: $resultado")
}

fun saludar(nombre: String) {
        println("¡Hola, $nombre! Bienvenido a Kotlin.")
}

fun sumar(a: Int, b: Int): Int {
        return a + b
}

