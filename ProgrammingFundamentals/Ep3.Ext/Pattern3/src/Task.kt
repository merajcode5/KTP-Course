import com.faangx.ktp.patterns.single.PatternMiniApp

fun printPattern(lines: Int, char1: Char, char2: Char) {
    for (i in 0 until lines) {
        for(j in 0 until lines * 2 - 1) {
            if (j == lines - 1 - i || j == lines - 1 + i) {
                print(char1)
            } else {
                print(char2)
            }
        }
        println()
    }
}

fun main() {
    PatternMiniApp("P3", ::printPattern)
}