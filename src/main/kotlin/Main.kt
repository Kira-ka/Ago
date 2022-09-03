fun main() {
    val time = 1008000
    val range1 = 0..60
    val range2 = 61..60 * 60
    val range3 = 3601..24 * 3600
    val range4 = 24 * 3601..48 * 3600
    val range5 = 48 * 3601..72 * 3600
    println(agoToText(time, range1, range2, range3, range4, range5))
}

fun agoToText(
    time: Int,
    range1: IntRange,
    range2: IntRange,
    range3: IntRange,
    range4: IntRange,
    range5: IntRange
): String {
    return when (time) {
        numberOfSeconds(range1, time) -> "был(а) только что"
        numberOfSeconds(range2, time) -> textMin(time)
        numberOfSeconds(range3, time) -> textHour(time)
        numberOfSeconds(range4, time) -> "был(а) вчера"
        numberOfSeconds(range5, time) -> "был(а) позавчера"
        else -> {
            "был(а) давно"
        }
    }
}

fun numberOfSeconds(range: IntRange, time: Int): Int {
    var result  = 1
    for (i in range) {
        if (i == time) {
            result = time
        }
    }
    return result
}

fun textMin(time: Int): String {
    return when (time / 60) {
        1 -> "был(а)" + " " + (time / 60).toString() + " " + "минуту назад"
        forToMin(time / 60) -> "был(а)" + " " + (time / 60).toString() + " " + "минуты назад"
        forThreeMin(time / 60) -> "был(а)" + " " + (time / 60).toString() + " " + "минуты назад"
        forFourMin(time / 60) -> "был(а)" + " " + (time / 60).toString() + " " + "минуты назад"
        forTwentyOneMin(time / 60) -> "был(а)" + " " + (time / 60).toString() + " " + "минуту назад"
        else -> {
            "был(а)" + " " + (time / 60).toString() + " " + "минут назад"
        }
    }
}

fun forTwentyOneMin(min: Int): Int {
    val minRange = 21..51
    var result = 0
    for (i in minRange step 10) {
        if (i == min) {
            result = min
        }
    }
    return result
}

fun forToMin(min: Int): Int {
    val minRange = 2..52
    var result = 0
    for (i in minRange step 10) {
        if (i == min) {
            result = min
        }
    }
    return result
}

fun forThreeMin(min: Int): Int {
    val minRange = 3..53
    var result = 0
    for (i in minRange step 10) {
        if (i == min) {
            result = min
        }
    }
    return result
}

fun forFourMin(min: Int): Int {
    val minRange = 4..54
    var result = 0
    for (i in minRange step 10) {
        if (i == min) {
            result = min
        }
    }
    return result
}

fun textHour(time: Int): String {
    return when (time / 3600) {
        forOneHour(time / 3600) -> "был(а)" + " " + (time / 3600).toString() + " " + "час назад"
        forToHour(time / 3600) -> "был(а)" + " " + (time / 3600).toString() + " " + "часа назад"
        forThreeHour(time / 3600) -> "был(а)" + " " + (time / 3600).toString() + " " + "часа назад"
        forFourHour(time / 3600) -> "был(а)" + " " + (time / 3600).toString() + " " + "часа назад"
        else -> {
            "был(а)" + " " + (time / 3600).toString() + " " + "часов назад"
        }
    }
}

fun forOneHour(min: Int): Int {
    val minRange = 1..21
    var result = 0
    for (i in minRange step 20) {
        if (i == min) {
            result = min
        }
    }
    return result
}

fun forToHour(min: Int): Int {
    val minRange = 2..22
    var result = 0
    for (i in minRange step 20) {
        if (i == min) {
            result = min
        }
    }
    return result
}

fun forThreeHour(min: Int): Int {
    val minRange = 3..23
    var result = 0
    for (i in minRange step 20) {
        if (i == min) {
            result = min
        }
    }
    return result
}

fun forFourHour(min: Int): Int {
    val minRange = 4..24
    var result = 0
    for (i in minRange step 20) {
        if (i == min) {
            result = min
        }
    }
    return result
}