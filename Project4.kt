val scan = java.util.Scanner(System.`in`)

fun main() {
    val a1 = "isosceles"
    val a2 = 15
    val a3 = 3
    val a4 = 47
    var score = 0

    println("What is the name of a triangle that has two equal sides:")
    val q1 = scan.nextLine()
    if (a1 == q1) score++

    println("What is 75/5:")
    val q2 = scan.nextInt()
    if (a2 == q2) score++

    println("What is the value of y: 6 * 2y = 36")
    val q3 = scan.nextInt()
    if (a3 == q3) score++

    println("What is the value of 8 * 6 - (3 - 2):")
    val q4 = scan.nextInt()
    if (a4 == q4) score++

    if (score == 4) {
        println("Your grade is A")
    }else if(score == 3) {
        println("Your grade is B")
    }else if(score == 2) {
        println("Your grade is C")
    }else if(score == 1) {
        println("Your grade is D")
    }else{
        println("Your grade is F")
    }
}
