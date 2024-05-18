import com.faangx.ktp.basics.MaxOfThreeNumsMiniApp

fun maxOf(x: Int, y: Int, z: Int): Int {
    return if (x >= y && x >= z) {
        x
    } else if (y >= x && y >= z) {
        y
    } else {
        z
    }
}

fun main() {
    MaxOfThreeNumsMiniApp(::maxOf)
}