package Collections

fun main(args: Array<String>) {
    val array = arrayOf("Jerusalem","Acre","Gaza")  // fixed length and you can't add any item
    //Mixed Array
    val mixed = arrayOf("kotlin",1,3.0,2f,false,'c')
    // To assign an enlement by index - >
    println(mixed[1])
    mixed[1] = 3.1415 // this is using get and set method
    println(mixed[1])
    mixed.get(1)
    mixed.set(1,4.111)
    println(mixed[1])
    // String of characters array
    val str = "Udemy"
    println(str[0])
    // To connect two arrays together then use + sign between them and the two arrays should be of the same type
    val states = arrayOf("Yafa","Haifa","nablus")
    val allStates = array + states
    val l = allStates.size
    println(l)
    for(i in 0..l-2){
        print("$i - ${allStates[i]}")
        print("/")
    }
   print("${l-1} - ${allStates[l-1]} ")
   print("\n")

    //Integer Array
    val numbers = intArrayOf(1,2,2,3,4,5)
    val numberIsempty:Boolean = numbers.isEmpty()
    println(numberIsempty)
    //Double Array
    val doubleNumber = doubleArrayOf(1.0,3.4,4.5)
   if(states.contains("Yafa")){
       println("it contains")
   }else {
       println("it does not contain")
   }

    // Array list
    val arraylist = arrayListOf("Jalal","Mahmoud","Kamal")
    val list = arrayListOf("Hassan")
    println(arraylist[0])
    println(arraylist + list)
    println(arraylist.size)
    println(arraylist.isEmpty())
    println(arraylist.contains("Jalal"))

    arraylist.add("Hassan")
    println(arraylist)
    val added = arraylist.add(4 , "Jack") // It returns Boolean value
    //println(added)
    println(" this is the result if the name is added or not")
    println(arraylist)
    val removed = arraylist.remove("Jack") // It returns Boolean value
    println("$removed & this is the result if the name is removed or not")
    println(arraylist)
    arraylist.sort()
    println(arraylist)
 // Sublist -> you need to specify the first index and the last index
    val sublist =arraylist.subList(1,2) // returns 1 element which is the second one - index 1
    println(sublist)

    val sublist1 =arraylist.subList(1,4)
    println(sublist1)
}