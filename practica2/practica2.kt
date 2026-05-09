/*La operacion de multiplicacion de a por b usando sumas */
fun main(){
    println("Introduzca un numero:")
    val num = readln().toInt()
    println("Introduzca por cuanto lo va a multiplicar:")
    val num2 = readln().toInt()
    var res = num
    for (i in 1..num2){
        res += num
    }
    println("El resultado de $num x $num2 es $res")
}
