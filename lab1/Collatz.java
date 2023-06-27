package lab1;

/**
 * 最大值编程练习
 * Collatz序列定义如下：
 * 如果n是偶数，下一个数是n/2。如果n是奇数，则下一个数是3 n + 1。如果n是1，则序列结束。
 * 例如，假设我们从5开始。
 * 因为5是奇数，所以下一个数字是3x5 + 1 =16。
 * 因为16是偶数，所以下一个数字是8。
 * 因为8是偶数，所以下一个数字是4。
 * 因为4是偶数，所以下一个数字是2。
 * 因为2是偶数，所以下一个数字是1。到那时我们就结束了。
 * 序列为5、16、8、4、2、1。
 *
 * Collatz sequence
 * https://zh.wikipedia.org/wiki/%E8%80%83%E6%8B%89%E5%85%B9%E7%8C%9C%E6%83%B3
 * 考拉兹猜想（英语：Collatz conjecture），又称为奇偶归一猜想、3n+1猜想、冰雹猜想、角谷猜想、哈塞猜想、乌拉姆猜想或叙拉古猜想，
 * 是指对于每一个正整数，如果它是奇数，则对它乘 3 再加 1，如果它是偶数 ，则对它除以 2，
 * 如此循环，最终都能够得到 1。
 */
public class Collatz {
  public static void main(String[] args) {
    int n = 5;
    System.out.println("n=" + n);
    nextNumber(n);
  }

  /**
   * 你的第一个任务是编写一个方法如下：返回 public static int nextNumber(int n) 下一个数字。
   * 例如 nextNumber(5) ，应该返回16。
   * 该方法将通过Gradescope自动平地机进行测试。
   * 一些Java技巧：
   * 运算 % 符实现余数。例如，的值 x % 4 将为 0 、 1 、 2 或 3 。
   * 运算 == 符比较两个值是否不等。代码片段 if (n % 4 == 1) 读作“如果n除以4时的余数等于1”
   * 写入后 nextNumber ，填写该 main 方法，以便它打印出Collatz序列从开始 n = 5 。
   * 例如，如果 n = 5 ，您的程序应该打印 5 16 8 4 2 1 。如果在1后面有一个额外的空格就可以了。
   * 有趣的事实：对于所有数字，Collatz序列似乎在1处终止。然而，到目前为止，还没有人能够证明这对所有可能的起始值都是正确的，但是直到大约2^68的所有值都被检查过了。
   */
  public static void nextNumber(int n) {
    // 每一个正整数，如果它是奇数，则对它乘 3 再加 1，如果它是偶数 ，则对它除以 2
    if (n > 0) {
      if (n % 2 == 0) {// 偶数
        n = n / 2;
      } else {
        n = n * 3 + 1;
      }
      System.out.print(n + " ");
      if (n != 1) {
        nextNumber(n);
      }
    }
  }
}