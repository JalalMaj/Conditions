package Loops
fun main(args: Array<String>) {
    // For loop is usually used when you the number of iterations that going to be use like in array and lists
    // While loop is usually used when you don't know the number of iterations like you are readingh from a file
   // Break and Continue in a loop
    for(c in "Python"){
        if(c =='o'){
            break // Stops the loop and go to next statement
        }
        print(c)
    }
    println()
    for(c in "Python"){
        if(c =='o'){
            continue // skip the letter o
        }
        print(c)
    }

    println()

    val list = listOf("Book","table","Laptop","Computer","Toilet","Furniture")
    for(str in list){
        if(!str.contains('u')){
            continue
        }
        println(str)
    }

    //Nest loop and loop name
    for (i in 1..10){
        for(j in 1..10){
            if(i-j ==5){
                break // It will break the inner loop & if you need to break the outer one then you should give name
            }
            println("$i - $j")
        }
    }
    //Break the outer loop
    println("break the outer loop")
   outer@ for (i in 1..10){
        for(j in 1..10){
            if(i-j ==5){
                break@outer // It will break the outer loop
            }
            println("$i - $j")
        }
    }
    var sum=0L
    for(i in 100..100000L){
        sum+=i
    }
    println(sum)
}