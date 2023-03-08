

fun main() {
    myFun()
    myLambda1()
    myLambda2 ()
}
fun myFun  ()
{
    println("Hello from my function")
}
val myLambda1 = { -> println("Lambda1") }
val myLambda2 : () -> Unit = { -> println("Lambda2") }
// Shape of Lambda Exepression
// { here paramerter -> here body of function }