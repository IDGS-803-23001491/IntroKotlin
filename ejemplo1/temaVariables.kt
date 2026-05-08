
fun main(){
    val saludo: String = "Hola" //inmutable
    var nombre: String = "Kotlin" //mutable
    println("$saludo $nombre")

    //Lectura de datos por consola
    println("Ingresa primer numero:")
    val num1 = readln().toInt()
    
    println("Ingresa segundo numero:")
    val num2 = readln().toInt()

    val res = num1 + num2
    println("La suma es: $res")
}