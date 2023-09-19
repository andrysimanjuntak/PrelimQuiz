/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */


fun main() {
    // Convert Phillipine Peso to Indonesian Rupiah
    println(convertPHPToIDR(200.00))
}

fun convertPHPToIDR(peso: Double): String {
    if (peso < 0.0){
        throw IllegalArgumentException("Your pesos must be a positive number")
    }
    
    val currency = 270.9
    
    var idr = String.format("%.2f", peso * currency)
   
    return "${peso} pesos is Rp ${idr} in Indonesian Rupiah"
    
}
