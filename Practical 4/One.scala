package Practical_4

object One extends App{
  var products = Array("Pen", "Pencil", "Book", "Eraser", "Marker Pen");
  var quantities = Array(10, 12, 14, 13, 17);

  def displayInventory(products:Array[String], quantities:Array[Int]): Unit = {
    var i = 0;
    println("Product\t\t\tQuantity")
    for (product <- products) {
      printf("%s\t\t\t%d\n", products(i), quantities(i));
      i = i + 1;
    }
  }

  def restockItem(name:String, quantity:Int): Unit = {
    var i = 0;
    var found = false;
    for (product <- products) {
      if (name == products(i)) {
        quantities(i) = quantities(i) + quantity;
        found = true;
      }
      i = i + 1
    }
    if (!found)
    {
      println("Restock Failed. Product not in list");
    }
  }

  def sellItem(name: String, quantity: Int): Unit = {
    var i = 0;
    var found = false;
    for (product <- products) {
      if (name == products(i)) {
        quantities(i) = quantities(i) - quantity;
        found = true;
      }
      i = i + 1
    }
    if (!found) {
      println("Sale failed. Product not in list.");
    }
  }



  restockItem("Pen", 5);
  restockItem("Apple", 8);
  sellItem("Book", 3);
  sellItem("Pear", 5)
  displayInventory(products, quantities);
}
