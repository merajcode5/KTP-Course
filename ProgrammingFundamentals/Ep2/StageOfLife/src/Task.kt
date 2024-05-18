import com.faangx.ktp.basics.StageOfLifeMiniApp

fun stageOfLife(age: Int): String {
    return if (age < 3)
        "Infancy"
    else if (age < 12)
            "Childhood"
    else if (age < 18)
                "Teenage"
    else if (age < 60)
                    "Adulthood"
    else
        "Old age"
}

fun main() {
    StageOfLifeMiniApp(::stageOfLife)
}