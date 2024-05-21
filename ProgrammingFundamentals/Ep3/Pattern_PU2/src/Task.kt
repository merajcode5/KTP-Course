import com.faangx.ktp.patterns.single.PatternMiniApp

fun printPattern(lines: Int, char1: Char, char2: Char) {
    repeat(lines) { i ->
        // Print leading spaces
        repeat(lines - 1 - i) { print(' ') }

        // Print the first char1
        print(char1)

        // Print the middle part with char2 if not the first or last line
        if (i != 0 && i != lines - 1) {
            repeat(2 * i - 1) { print(char2) }
            print(char1)  // Print the last char1 for the current line
        }

        // If it's the last line, fill with char1
        if (i == lines - 1) {
            repeat(2 * i) { print(char1) }
        }

        println()
    }
}

fun main() {
    PatternMiniApp("PU2", ::printPattern)
}