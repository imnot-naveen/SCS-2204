object four extends App {

  def wholesaleBooks(cover_price : Double, amount : Int): Double = {
    val price = cover_price * amount * 0.6 + 3: Double
    val shipping : Double = if (amount > 50) (amount - 50) * 0.75 else 0
    price + shipping
  }
    printf("Total wholesale cost = %.2f", wholesaleBooks(24.95,60))
}
