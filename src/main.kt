
fun main(){
    oddNumbers()
    println(namesArray(arrayOf("Lucy","MichaelJordain","Rosemary","MaryAnne")))
    robot(4)
    robot(12)
    robot(20)
    numbers()
}
//Create a function that prints out all the odd numbers between 1 and 100
fun oddNumbers() {
    for (n in 1..100) {
        if (n%2!==0){
            println(n)

        }
    }
}
//Create a function that takes in an array of names and returns the number of
//names longer than 5 characters
fun namesArray(name: Array<String>):Int{
    var y =0
    name.forEach { k->
        if (k.length>5)
            y++
    }
    return  y
}
//You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age.
fun robot(age:Int){
    if ( age<=6){
        println("milk")
    }else if(age in 7..14){
        println("Fanta orange ")
    }else{
        println("coca cola")
    }
}
//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.
fun numbers(){
    for (num in 1..100){
        if( num%3==0 && num%5==0)
        {
            println("FizzBuzz")}
        else if(num%5==0){
            println("Buzz")
        }
           else if (num%3==0)
           {
            println("Fizz")
        }else if(num%5==0)
        {
            println("Buzz")
        }else{
            println(num)
        }
    }
}