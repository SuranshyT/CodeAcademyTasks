val scan = java.util.Scanner(System.`in`)

fun main() {
    println("What's your name?")
    val name = scan.nextLine()
    println("What's your friend's name?")
    val friend = scan.nextLine()
    println("What adjective would you like to use?")
    val adj = scan.nextLine()
    println("What city will you be driving to?")
    val city = scan.nextLine()
    println("What's your favorite band's name?")
    val band = scan.nextLine()
    println("What will you and $friend work as?")
    val work = scan.nextLine()
    println("Enter an amount of miles between 400 and 600")
    val miles = scan.nextInt()
    println("Enter an integer number")
    val money = scan.nextInt()
    println("Enter an integer number one more time")
    val num = scan.nextInt()
    println("A long time ago, $name and their friend $friend planned a(n) $adj road trip to see their favorite band: $band. \n" +
            "The venue was $miles miles away which meant they needed to save $money dollars to get there. \n" +
            "Both of them worked as $work for the whole summer and managed to save up a total of $num dollars! \n" +
            "To celebrate, they ended up driving to $city for the whole weekend; seeing their band and buying $adj t-shirts to remember their trip")
}
