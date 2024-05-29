import com.faangx.ktp.ext.BinomialExpansionMiniApp

fun printBinomialExpansion(n: Int) {

    fun factorialOf(x: Int): Int {
        return if (x <= 1) 1 else x * factorialOf(x - 1)
    }
    // nPr
    fun permutationsOf(n: Int, r: Int): Int {
        return factorialOf(n) / factorialOf(n - r)
    }

    // nCr
    fun combinationsOf(n: Int, r: Int): Int {
        return permutationsOf(n, r) / factorialOf(r)
    }

    // Binomial expansio
    val result = StringBuilder()
    for (k in 0..n) {
        val coefficient = combinationsOf(n, k)
        val aExponent = n - k
        val bExponent = k

        if (coefficient != 1) {
            result.append("$coefficient")
        }

        if (aExponent > 0) {
            result.append("a")
            if (aExponent > 1) {
                result.append("^$aExponent")
            }
        }

        if (bExponent > 0) {
            if (aExponent > 0) {
                result.append(" * ")
            }
            result.append("b")
            if (bExponent > 1) {
                result.append("^$bExponent")
            }
        }

        if (k < n) {
            result.append(" + ")
        }
    }

    println(result.toString())
}

fun factorialOf(x: Int): Int {
    return if (x <= 1) 1 else x * factorialOf(x - 1)
}

fun permutationsOf(n: Int, r: Int): Int {
    return factorialOf(n) / factorialOf(n - r)
}

fun combinationsOf(n: Int, r: Int): Int {
    return permutationsOf(n, r) / factorialOf(r)
}

fun main() {
    BinomialExpansionMiniApp(::printBinomialExpansion)
}
