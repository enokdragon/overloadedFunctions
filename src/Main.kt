fun customerData(n: String,p: String){
    var info = n + "\n" + p
    println("$info")
}

fun customerData(bn: String, n: String,p: String,){
    var info =bn + "\n" + n + "\n" + p
    println("$info")
}

fun main() {
    println("Welcome to The Store. Are you an residential or business customer? Enter the associated number.")
    println("1. Residential")
    println("2. Business")
    var choice = readln().toInt()
    if(choice == 1){
        println("Please enter your name")
        var name = readln().toString()
        println("Please enter your phone number")
        var number = readln().toString()
        customerData(name, number)
    }
    else if(choice == 2){
        println("Please enter your business contact name")
        var bname = readln().toString()
        println("Please enter your business's name")
        var name = readln().toString()
        println("Please enter your business's phone number")
        var number = readln().toString()
        customerData(bname, name, number)
    }
    else{
        println("Invalid input")
    }

}