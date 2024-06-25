package Practical_2

object one extends App{
  var i,j,k = 2;
  var m,n = 5;
  var f = 12.0f;
  var g = 4.0f;
  var c = 'X';

  val ans1 = k + 12 * m;
  val ans2 = m / j;
  val ans3 = n % 2;
  val ans4 = m / j * j
  val ans5 = f + 10 * 5 + g

  i += 1 //pre-increment
  val ans6 = i * n

  printf("k + 12 * m = %d\n", ans1);
  printf("m / j = %d\n", ans2)
  printf("n %% 2 = %d\n", ans3)
  printf("m / j * j = %d\n", ans4)
  printf("f + 10 * 5 + g = %.2f\n", ans5)
  printf("++i * n = %d\n", ans6)
}
