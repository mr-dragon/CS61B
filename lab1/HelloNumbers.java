package lab1;

public class HelloNumbers {
  public static void main(String[] args) {
    int x = 0;

    /*
     * Exercise 1.1.1. Create a file on your computer called HelloWorld.java and
     * copy and paste the exact program from above.
     * Try out the javac HelloWorld.java command. It'll look like nothing happened.
     */
    // int x = 0;
    // while (x < 10) {
    // System.out.print(x + " ");
    // x = x + 1;
    // }
    /*
     * Exercise 1.1.2. Modify HelloNumbers so that it prints out the cumulative sum
     * of the integers from 0 to 9.
     * 练习1.1.2.修改HelloNumbers，使其打印出从0到9的整数的累加和
     * For example, your output should start with 0 1 3 6 10... and should end with
     * 45.
     */
    // System.out.println();
    // x = "horse"; // HelloNumbers.java:24: error: incompatible types: String
    // cannot be converted to int

    // x = 0;
    int sum = 0;
    while (x < 10) {
      sum = x + sum;
      x = x + 1;
      System.out.print(sum + " ");
    }

    // String h = 5 + "horse";
    // int h = 5 + "horse";
    // System.out.println(h);// 5horse
    // System.out.println(5 + "10");// 510
    // System.out.println(5 + 10);// 15

  }
}
