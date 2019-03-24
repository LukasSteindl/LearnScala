

object Lab0 {
  
// EXERCISE
// Create a list of the numbers 1-20; your job is to print out numbers that are evenly divisible by three. (Scala's
// modula operator, like other languages, is %, which gives you the remainder after division. For example, 9 % 3 = 0
// because 9 is evenly divisible by 3.) Do this first by iterating through all the items in the list and testing each
// one as you go. Then, do it again by using a filter function on the list instead.
var numbers = List(0)                             //> numbers  : List[Int] = List(0)
for (x <- 1 to 20) {
	numbers = numbers ++ List(x)
}
numbers                                           //> res0: List[Int] = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
                                                  //|  16, 17, 18, 19, 20)


for (y <-0 to numbers.length-1){
 	var n = numbers(y);
 	if (n % 3 ==0)
        println(n)
}                                                 //> 0
                                                  //| 3
                                                  //| 6
                                                  //| 9
                                                  //| 12
                                                  //| 15
                                                  //| 18
                                                  
numbers.filter(x => x%3 ==0).map(println)         //> 0
                                                  //| 3
                                                  //| 6
                                                  //| 9
                                                  //| 12
                                                  //| 15
                                                  //| 18
                                                  //| res1: List[Unit] = List((), (), (), (), (), (), ())
numbers.filter(_ %3 ==0).map(println)             //> 0
                                                  //| 3
                                                  //| 6
                                                  //| 9
                                                  //| 12
                                                  //| 15
                                                  //| 18
                                                  //| res2: List[Unit] = List((), (), (), (), (), (), ())

// That's enough for now!
// There is MUCH more to learn about Scala. We didn't cover many other collection types, including mutable collections.
// And we didn't even touch on object-oriented Scala. The book "Learning Scala" from O'Reilly is great if you want to
// go into more depth - but you've got enough to get through this course for now.
  }