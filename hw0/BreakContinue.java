package hw0;

/**
 * 编写一个函数windowPosSum(int[] a, int n)，将每个元素 a[i] 替换为 a[i] 到 a[i + n] 的总和，但前提是
 * a[i] 为正值。如果由于到达数组末尾而没有足够的值，我们将仅对已有的值进行求和。
 * 例如，假设我们windowPosSum使用数组a = {1, 2, -3, 4, 5, 4}, 和进行调用n = 3。在这种情况下，我们会：
 *
 * 将 a[0] 替换为 a[0] + a[1] + a[2] + a[3]。
 * 将 a[1] 替换为 a[1] + a[2] + a[3] + a[4]。
 * 不要对 a[2] 做任何事情，因为它是负数。
 * 将 a[3] 替换为 a[3] + a[4] + a[5]。
 * 将 a[4] 替换为 a[4] + a[5]。
 * 不要对 a[5] 执行任何操作，因为 a[5] 之后没有任何值。
 * 因此，调用后的结果windowPosSum将是{4, 8, -3, 13, 9, 4}。
 *
 * 另一个例子，如果我们用windowPosSum数组a = {1, -1, -1, 10, 5, -1}, and调用n = 2，我们会得到{-1, -1,
 * -1, 14, 4, -1}。
 */
public class BreakContinue {

  /**
   * 提示 1：使用两个 for 循环。
   * 提示 2：用于continue跳过负值。
   * 提示 3：用于break避免越过数组末尾。
   */
  public static void windowPosSum(int[] a, int n) {
    // 将每个元素 a[i] 替换为 a[i] 到 a[i + n] 的总和，但前提是a[i] 为正值。
    // 如果由于到达数组末尾而没有足够的值，我们将仅对已有的值进行求和
    // 1
    for (int i = 0; i < a.length; i++) {
      int sum = 0;
      if (a[i] < 0) {// a[i] 为正值
        // 2
        continue;
      }
      // a[i] 替换为 a[i] 到 a[i + n] 的总和
      for (int j = i; j <= (i + n); j++) {
        // 3
        if (j >= a.length) {
          break;
        }
        System.out.println("i=" + i + ",a[" + i + "] = " + a[i] + ",a[" + j + "]=" + a[j]);
        sum += a[j];
      }
      a[i] = sum;
      System.out.println("=========sum=" + sum);
      // a[i] = a[i] + a[i + 1] + a[i + 2];
    }
    // return sum;
  }

  public static void main(String[] args) {
    int[] a = new int[] { 1, 2, -3, 4, 5, 4 };
    windowPosSum(a, 3);
    // Should print 4, 8, -3, 13, 9, 4
    System.out.println(java.util.Arrays.toString(a));
  }

}
