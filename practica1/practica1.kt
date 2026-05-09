/* La distancia entro dos puntos */

import kotlin.math.pow
import kotlin.math.sqrt

fun main(){
    println("Introduzca la coordenada x1")
    val x1 = readln().toDouble()
    println("Introduzca la coordenada y1")
    val y1 = readln().toDouble()
    println("Introduzca la coordenada x2")
    val x2 = readln().toDouble()
    println("Introduzca la coordenada y2")
    val y2 = readln().toDouble()

    val distancia = sqrt((x2-x1).pow(2) + (y2-y1).pow(2))

    print("La distancia del la coordenada ($x1,$y1) a ($x2,$y2) es $distancia")
}