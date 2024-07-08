package Practical_4

object Three extends App {
  def toUpper(name: String): String = {
    name.toUpperCase();
  }

  def toLower(name: String): String = {
    name.toLowerCase();
  }

  def formatNames(name: String)(function: String => String)(indexlist: Array[Int]): Unit = {
    var a = function(name)
    var index: Int = 0;
    while (index < indexlist.length) {
      var x = a.charAt(indexlist(index));
      a = a.substring(0, indexlist(index)) + x.toUpper + a.substring(
        indexlist(index) + 1
      )
      index = index + 1
    }

    println(a)

  }

  formatNames("Benny")(toUpper(_))(Array());
  formatNames("Niroshan")(toLower(_))(Array(0, 1));
  formatNames("Saman")(toLower(_))(Array());
  formatNames("Kumara")(toLower(_))(Array(0, 5));

}
