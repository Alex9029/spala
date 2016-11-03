import scala.io.Source
def widthOfLength(s: String) : Int = s.length.toString.length
if (args.length > 0){
  val lines = Source.fromFile(args(0)).getLines().toList
  val lonegestLine = lines.reduceLeft{
    (a, b) => if(a.length > b.length) a else b
  }
  val maxWidth = widthOfLength(lonegestLine)

  for (line <- lines){
    val spaceNum = maxWidth - widthOfLength(line)
    val space = " " * spaceNum
    println(space + line.length + " | " + line)
  
}
}
else
  Console.err.println("Please enter filename")

