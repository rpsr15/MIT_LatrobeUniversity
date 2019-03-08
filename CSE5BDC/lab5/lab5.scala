//Task A
// val is used  to create a constant
val my_string = "Hello"
print(my_string)
//<console>:25: error: reassignment to val. Not possible to a constant value

// var to create variables
var x = "hello" //x : String = Hello

var y = 1434L // this is long type
var y : long = 0
//<console>:25: error: type mismatch;
 //found   : Long(987654321L)
 //required: Int
 //      x = 987654321L


//TASK B
val numbers = List(2, 13, 7,22)
val doubled = numbers.map(x => x * 2) // or numbers.map(_ * 2)
print(doubled)
(1 to 10).reduce((x, y) => x + y) // sum of numbers or .reduce(_ + _)
val numbers = List(2, -1, 3, 2, 100, 13,7 ,22)
numbers.filter( _ > 5)
//res0: List[Int] = List(100, 13, 7, 22)

//EXercise 2
val numbers = List(2, 5, 7)
numbers.map( _ / 2.0).reduce( _ *  _)
//res3: Double = 8.75


// Exercise 3
val food = List("Potato", "Carrot", "Celery", "Black Apple", "Strawberry")
vegies = food.filter(_.length < 7).map(_ + "s")





//Exercise 4

print(List(1, 2, 3).zip(List(4, 5, 6)))
//List((1,4), (2,5), (3,6))

val u = List(2, 5 ,3)
val v = List(4, 3, 7)
u.zip(v).map((x)=> (x._1*x._2)).reduce(_+_)




//EXERCISE 5
val daysInMonth = Map("January" -> 31, "February" -> 28, "March" -> 31, "April" -> 30)
//daysInMonth: scala.collection.immutable.Map[String,Int] = Map(January -> 31, February -> 28, March -> 31, April -> 30)

 val months = Array("January", "March", "January", "April")
//months: Array[String] = Array(January, March, January, April)
 val days = months.map((x) => daysInMonth(x))
days: Array[Int] = Array(31, 31, 31, 30)

days.foreach(println)
31
31
31
30






// Exercise 6

def extract(word : String, n : Int ) : Char = {
  if( n >= word.length)
  {
    return '-'
  }
  else
  {
    return word(n)
  }
  }
List[String] = List(Peter, John, Mary, Henry)

scala> val result =  names.map(extract(_,4))
result: List[Char] = List(r, -, -, y)

// EXERCISE 7

 val numbers = ( 1 to 10)
numbers: scala.collection.immutable.Range.Inclusive = Range(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

scala> val result = numbers.map (_ match {
     | case 0 => 0
     | case x if x%2 == 0 => x/2
     | case x if x%2 != 0 => x*2
     | })
//result: scala.collection.immutable.IndexedSeq[Int] = Vector(2, 1, 6, 2, 10, 3, 14, 4, 18, 5)
//EXERCISE 8
def find_max(s : Seq[Int])
{
  
  print(s.reduce(Math.max(_,_)))
}
scala> find_max(numberList)
7
scala> val numberArray = Array(4, 7, 2, 1)
numberArray: Array[Int] = Array(4, 7, 2, 1)

scala> find_max(numberArray)
7



//EXERCISE 9

def matchedNumbers(list1 : Seq[Int], list2 : Seq[Int]) : Seq[Int] = 
{
  
}