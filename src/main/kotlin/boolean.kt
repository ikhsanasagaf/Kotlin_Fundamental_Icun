fun main() {
    val nilai = 61
    val hasil : String

    hasil = if (nilai > 90) {
        "A"
    } else if (nilai > 80) {
        "B"
    } else if (nilai > 70) {
        "C"
    } else if (nilai > 60) {
        "D"
    } else {
        "E"
    }

    print(hasil)
}
