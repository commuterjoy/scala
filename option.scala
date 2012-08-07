
// http://www.codecommit.com/blog/scala/the-option-pattern

// pattern for avoiding defensive coding, Eg. (if something != null)

val x = Some("foo")
val xx = x.map(_.toUpperCase).getOrElse("Not")

val y: Option[String] = None
val yy = y.map(_.toUpperCase).getOrElse { println("getOrElse takes a function"); }

println(xx.toString) // FOO
println(yy.toString) // getOrElse takes ...

val a = None
val b = Some("b")
val c = Some("c")

// on chaining :- http://daily-scala.blogspot.co.uk/2010/02/chaining-options-with-orelse.html

// chain the different options together in order of priority and get the value

val d = a.orElse(b).orElse(c).get

println(d) // 'b' 
