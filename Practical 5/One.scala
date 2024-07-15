package Practical_5
import com.sun.source.tree.ReturnTree

import scala.io.StdIn.readLine // for readLine()

object One extends App{

  def getProductList():List[String] = {
    var productList = List[String]();
    while (true) {
      print("What is the name of the product: ");
      val newProduct = readLine();
      if (newProduct == "done") {
        return productList;
      }
      else {
        productList = productList :+ newProduct;
      }
    }
    productList;
  }

    def printProductList(products:List[String]):Unit = {
      var i = 0;
      for (product <- products) {
        println((i + 1) + " " + products(i))
          i = i + 1;
      }
    }

    def getTotalProducts(products:List[String]):Int  = {
      products.size;
    }

    //test
    var products = getProductList();
    printProductList(products);
    println("Total number of products : " + getTotalProducts(products));
}
