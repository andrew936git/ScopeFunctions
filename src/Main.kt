import kotlin.math.pow
import kotlin.random.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//1
    val text = "Scope Function"
    text.let { println("$it, длина строки - ${it.length}") }
    println("====================================================================")
//2
    val mgn = City("Магнитогорск", null)
    mgn.apply {
        if (population == null) population = 500000
        println("Город $name, численность населения = $population")
    }
    println("====================================================================")
//3
    val random = Random
    val array: Array<Int> = Array(5){random.nextInt(0, 10)}
    with(array){
        array.forEach { print("$it ") }
        println()
        println("Количество элементов массива = ${ array.size }")
        var res = 0
        array.forEach { res += it }
        println("Сумма элементов = $res")
    }
    println("====================================================================")
//4 - Переделанная функция sqrt из прошлого ДЗ
    val number = 24
    println(number.sqrtInt())

}
fun Int.sqrtInt(): Int{
    var res: Double
    if (this < 0) res = 0.0
    var left: Double = 0.0
    var right: Double = this.toDouble()
    for (i in 0..10){
        var middle = (left + right) / 2
        if (middle * middle < this.toDouble()) left = middle
        else right = middle
    }
    res = right
    return res.toInt()
}