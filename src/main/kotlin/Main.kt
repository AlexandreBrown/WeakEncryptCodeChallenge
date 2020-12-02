fun main() {
    while (true){
        val input = readLine() ?: return

        val output = encrypt(input)

        println(output)
    }
}

fun encrypt(input: String): String {

    if(input.isEmpty){
        return input
    }

    val words = input.split(" ").asSequence()

    val passwordWithoutPadding = words.filterIndexed { index, _ -> isOdd(index + 1) }
        .map { word ->
            word.toCharArray()
                .filterIndexed { index, _ -> isEven(index + 1) }
        }
        .flatten()
        .joinToString(separator = "")

    val passwordWithPadding = passwordWithoutPadding.padEnd(length = words.count(), padChar = '*')

    return "'$passwordWithPadding'"
}

private fun isOdd(value: Int) = value % 2 != 0

private fun isEven(value: Int) = !isOdd(value)