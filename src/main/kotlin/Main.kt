import java.util.*

fun main(args: Array<String>) {

    val mode:Int = 3
    when(mode){
        1-> println("It's bad")
        2-> {
            println("mode 2")
            println("It's OK")
        }
        3-> println("wonderful")
        else-> println("No Idea")
    }

   val mode1:Int =3
    val result = when(mode1){
        1-> "It's bad"
        2-> {
            "mode 2"
            "It's OK"
        }
        3-> "wonderful"
        else-> "No Idea"
    }
    println(result)

    val x = if(mode1<2){
        println("the mode is <2")
        7
    }else{
        42
    }
    println(x)

    val y =10
    when(y){
        5 -> println("The value is 5")
        //2*5 -> println("The value is 2*5")
        "Hello World!".length -> println("The length of 'Hello World!'")
        in 1..10 -> println("The value is between 1 and 10")
        in 11.. 20 -> println("The value is between 11 and 20")
        !in 5..10 -> println("")
        else -> println("It's not long")

    }

    /**
     *
     * Solution for the coding challenge on conditionals inside the Udemy course.
     * Generate a random number between 0 and 49 and checks in which range it is.
     */
    val random = Random().nextInt(50) + 1
    when(random){
        in 1..10 -> println("In 1 to 10: $random")
        in 11..20 -> println("In 11 to 20: $random")
        in 21..30 -> println("In 21 to 30: $random")
        in 31..40 -> println("In 31 to 40: $random")
        else -> println("Over 40: $random")
    }
    println(random)
}