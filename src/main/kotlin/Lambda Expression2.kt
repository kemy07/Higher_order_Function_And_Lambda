fun main() {
    myFun(10)
    myLambda(5)
    myLambda3 (7)
}

fun myFun (a:Int)
{
    println("a = $a")
}
val myLambda = {a:Int -> println("a = $a") }
val myLambda3 : (Int) -> Unit = {a:Int -> println("a = $a") }
