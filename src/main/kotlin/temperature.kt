import kotlin.math.abs

fun main() {
    var guess = 0
    val answer = 42
    var temperature: Int

    while (guess != answer){
        print("Enter the temperature: ")
        guess = readLine()!!.toInt()
        temperature = abs(guess - answer)
        if (temperature <= 97.5)
            println("The temperature is low")
        else if (temperature >= 97.5 && temperature <= 99.5)
            println("The temperature is normal")
        else
            println("The temperature is high")
    }

    println("That is correct, the number is $answer")

}


