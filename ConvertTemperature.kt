/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    val celsius = 30.0
    val fahrenheit = convertCelsiusToFahrenheit(celsius)
    val kelvin = convertCelsiusToKelvin(celsius)
    println("${celsius} degree celsius is ${fahrenheit} degree Fahrenheit")
    println("${celsius} degree celsius is ${kelvin} degree Kelvin")
}

fun convertCelsiusToFahrenheit(celsius: Double): String {
    val fahrenheit = String.format("%.2f", celsius * 9 / 5 + 32)
    return fahrenheit
}

fun convertCelsiusToKelvin(celsius: Double): String {
    val kelvin = String.format("%.2f", celsius + 273.15)
    return kelvin
}

