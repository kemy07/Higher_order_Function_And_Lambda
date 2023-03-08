
fun main()
{
    sum(5 , 4) { a, b -> a + b }
}
fun sum (a:Int , b:Int , myFun:(Int , Int) -> Int )
{
println("sum = " + myFun(a , b))
}
val myLambda4 : (Int , Int) -> Int = {a:Int , b:Int -> a + b }
