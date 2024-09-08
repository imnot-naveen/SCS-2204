package Practical_10

object One extends App {
  val x = new RationalNumber(3, 4)
  println(x);
  println("Negative of x = " + x.neg)
}

class RationalNumber(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be zero")

  // Immutable values for numerator and denominator
  val numer: Int = if (d < 0) -n else n
  val denom: Int = if (d < 0) -d else d

  // Method to negate the rational number
  def neg: RationalNumber = new RationalNumber(-numer, denom)

  // Method to subtract another RationalNumber from the current one
  def sub(that: RationalNumber): RationalNumber = {
    val newNumer = this.numer * that.denom - that.numer * this.denom
    val newDenom = this.denom * that.denom
    new RationalNumber(newNumer, newDenom)
  }

  override def toString: String = s"$numer/$denom"
}
