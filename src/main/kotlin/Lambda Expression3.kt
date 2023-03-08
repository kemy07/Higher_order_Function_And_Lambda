fun main() {
    println(myFun2())
    println(myLambda5())
    println(myLambda6())
}

fun myFun2() :String
{
return "Hello From my Fun"
}
val myLambda5 = { "Hello From myLambda5" }
val myLambda6 : () -> String = { "Hello From myLambda5" }
