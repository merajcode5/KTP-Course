import com.faangx.ktp.patterns.single.PatternMiniApp

fun printPattern(lines: Int, char1: Char, char2: Char) {
    for (i in 0 until lines / 2) {
        repeat(i) { print(" ") }
        print(char2)
        repeat(lines / 2 - i - 1) { print (" ")}
        print(char1)
        repeat(lines / 2 - i - 1) { print(" ")}
        print(char2)
        repeat(i) { print(" ")}
        println()
    }
    repeat(lines) { print(char1) }
    println()

    for (i in lines / 2 - 1 downTo 0) {
        repeat(i) { print(" ") }

        print(char2)
        repeat(lines / 2 - i -1) { print(" ")}
        print(char1)
        repeat(lines / 2 - i - 1) { print(" ") }
        print(char2)
        repeat(i) { print(" ") }
        println()
    }
}

fun main() {
    PatternMiniApp("P5", ::printPattern)
}