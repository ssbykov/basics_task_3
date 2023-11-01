fun main() {
    calcDiscount(1000, true)
    calcDiscount(1001, false)
    calcDiscount(100_000, true)

}

fun calcDiscount(sum: Int, extraDiscount: Boolean) {
    var finalSum = sum.toFloat()
    println("____________________________________")
    println("покупка — $finalSum рублей →")
    if (sum <= 1000) {
        println("Скидок на данную сумму покупки нет.")
    } else if (sum in (1001..10_000)) {
        finalSum -= 100
        println("после применения скидки 100 руб. — $finalSum руб.")
    } else {
        finalSum *= 0.95F
        println("после применения 5% скидки — $finalSum руб.")
    }
    if (extraDiscount) {
        finalSum *= 0.99F
        println("после применения 1% скидки — $finalSum руб.")
    }
}