import java.lang.reflect.GenericDeclaration
import kotlin.math.pow

fun main(args: Array<String>) {
//    Задача 1
    println(3.toPowerOf(3))

//    Задача 2
    4.toPowerOfWithLambda(2) { input: Double -> println(input.toString()) }

//    Задача 3
    3.displayTypeInfo()
    "a".displayTypeInfo()
    true.displayTypeInfo()
    3.5.displayTypeInfo()
}

fun Int.toPowerOf(exponent: Int): Double {
    return this.toDouble().pow(exponent)
}

fun Int.toPowerOfWithLambda(exponent: Int, lambdaFunc: (input: Double) -> Unit) {
    val powerResult = this.toPowerOf(exponent)
    lambdaFunc(powerResult)
}

fun <T> T.displayTypeInfo() {
    println(
        when (this) {
            is Int -> "это Int"
            is String -> "это String"
            else -> "тип у $this неизвестен"
        }
    )
}