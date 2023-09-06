//TODO Function as Variable
fun add(value1:Int,value2:Int):Int{
    return value1+value2
}
fun  printResult(t:(Int,Int)-> Int, a:Int, b:Int){
    val repo=t(a,b)
   // println("RESULT -> $repo")
}
fun main(args: Array<String>) {
    val countR=10
    var sum=1

    val devs = arrayOf("Amit", "Ali", "Amit", "Summit", "Summit", "Himanshu")
    println("DISTINCT--> \n${devs.distinct()}")

    println("SET --> \n${devs.toSet()}")

    //FUNCTIONS
    val functionClassM=FunctionClass()
    functionClassM.welcome();
    functionClassM.gratingBirthday("Mustang","Malik")
    val age=functionClassM.calculateAge(10,25)

    //println("Your age is $age")
    val isCom=functionClassM.isComing();
    //println("$isCom");
    functionClassM.DisplayNumber(1)
    functionClassM.DisplayNumber("Six")
    functionClassM.DisplayNumber(10,20)
    //METHOD RERFRENCES OPERATOR
    val function= ::add
    function(5,8)
    printResult(function,5,8)



    //EX : 4 3D Point
    val (first,second,third)=Triple(1,10,10)
    when{
//        first==second&& second==third-> println("X=Y=Z")
//        third==0-> println("On the x/y plane")
//        second==0-> println("On the x/z plane")
//        first==0-> println("On the y/z plane")
//        else -> println("Ordinary  point")
    }


    //WHEN RETURN VALUE IN EXPRESSION
    val num1:Int=10;
    val utput=when (num1){
        10 -> "ZERO"
        else -> "NON ZERO"
    }
    //println("NUMBER $utput")

    //WHEN EXPRESSION MULTIPLE ELSE USE
    val num:Int=10;
    when (num){
//        0 -> println("ZERO")
//        else -> println("NON ZERO")
    }
    val later="A";
    when (later){
//        "A","G","H" -> println("Alphabet")
//        else -> println("No Alphabet")
    }

    /*Exercise 2*/
    for(row in 1..5){
        if(row%2==0){
            continue;
        }
        for(column in 1..5) {
          //  print("  ${column*row} ")
        }
        println(" ")
    }

    /*Exercise 1*/
    for (row in 0..3){
        for(colum in 1..4) {
            //print( " $colum ")
        }
       // println()
    }

    /*Repeat*/
    var lastSum=0



    /*Advance Control Flow*/
    /*Range*/ //TODO sequence of countable number
    //TODO 1 Close Range
    var c=0..5  //TODO  0 to 5 like (0,1,2,3,4,5)
    //TODO 2 Half-open range
    val hour=0 until 5  //TODO  from 0 to 4 inclusive (0,1,2,3,4,5)
    //TODO Decreasing range
    var dcereasingRange= 5 downTo 0 //TODO inclusinv

    /*For*/

    for(i in 1..countR){
        sum+=i
       // println(sum)
    }


    /*Exercise*/
    var ex=(((10/2)>2))&&((10%2)==0)
    var pop=( (true && 1!=2) || (4 > 3 && 100 < 1) )
    //println(pop)

    var count=1;
    do {
        count += 1
       // println("$count")
    }while(count<5)

    while (count<5){
        count += 1
       // println("$count")
    }




    /*Conditional Statement*/
    if(5>2){
        //println("five is big")
    }else{
        //println("five is less then ")
    }

    /*String Equality*/
    var name1="Kotlin"
    var name2="Java"
    // println(name1==name2)


    /*Logic Operator*/ //TODO AND like &&. OR like ||
    var orConstants=true||false
    //println(orConstants)
     orConstants=true||true
    //println(orConstants)
     orConstants=false||true
    //println(orConstants)
    orConstants=false||false
    //println(orConstants)

    var andConstants=true&&false
   // println(andConstants)
     andConstants=true&&true
    //println(andConstants)
    andConstants=false&&true
    //println(andConstants)
    andConstants=false&&false
    //println(andConstants)


    /*Control Flow*/
    //TODO 1 Comparison Operator ==, !=, >=, <=, >, <
    val yes:Boolean=true
    val no:Boolean=false
    val doesWentTwo=yes

    /*Any, Unit, Nothing*/
    /*Any every type in kotlin  expect null*/

    val anyNumber:Any=34;
    val anyString:Any=34;
    //anyNumber="dsad"//TODO get error
    //anyString=98// TODO get error

    //Unit: same as void in java
    //Nothing: never complete return nothing and do nothing


    /*Triples*/
    val triple:Triple<Int,Int,Int> = Triple(1,2,6)
    val triple1=Triple(1,2,6)
    //println("First Value ${triple.first}")
    //println("Second Value${triple.second}")
    //println("Third Value${triple.third}")
   //println("First Value ${triple1.first}")
   //println("Second Value${triple1.second}")
   //println("Third Value${triple1.third}")

    /*Pair*/
    val coordinates:Pair<Int,Int> = Pair(2,9)  //TOTO Type interface
    val coordinates1:Pair<Int,Int> = 2 to 9 //TOTO Type interface using to operator
    //println(coordinates)
    //println("X Value ${coordinates.first}") //TODO get first pair value
    //println("Y Value ${coordinates.second}")// TODO get second pair value

    //println(coordinates1)
    //println(coordinates1.first) //TODO get first pair value
    //println(coordinates1.second)// TODO get second pair value


    /*Concatenation*/
    val string1:String="Well Come back"
    val string2:String="User name"
    //println("$string1  $string2")

    /*Strings*/
    val name:String="MUSTAQ"
    //println(name)

    /*Boolean*/ //TODO two possible value if true or false
    var  isCome:Boolean=false
    //println(isCome)
    isCome=true
    //println(isCome)

    /*Char*/
    val latter:Char='m'// TODO define single later in var not double coute
    //println(latter)

    /*Numbers*/
    val b:Byte=120
    val s:Short=10;
    val i:Int=9
    val l:Long=333322444
    val f:Float=323.4343f
    val d:Double=847884.5544

    /*Variables*/
    var x:Int=7
    var y:Double=13.4
    //x=y// TODO Type mitch match
    x=y.toInt()//TODO Type converting

    val type:Int=25
    //type=45 //TODO we can not change val variable value after declared as val
    var total:Int=20 //TODO  declare variable using var keyword
    total=30 //TODO Change value after declared var keyword as last declare data type
    //total="Hello" //TODO Data Type not change after declared

    /*Constants*/
    val number:Int =10;
    val pi:Double=14.3
    val k:Float=6.34F

// single line comment
    /*
    add multiple line comment in kotlin
    multiple
    multiple
     */
}