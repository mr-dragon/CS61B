package hw0;

public class ClassNameHere {

  /**
   * 最大值
   */
  public static int max(int[] arr) {
    int max = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > max) {
        max = arr[i];
      }
    }
    return max;
  }

  /**
   * 求和
   */
  public static int whileSum(int[] arr) {
    // 1. 简单for方式
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }

    // 2. while方式
    int i = 0;
    sum = 0;
    while (i < arr.length) {
      sum += arr[i];
      i += 1;
    }

    sum = 0;
    // 3. foreach
    for (int item : arr) {
      sum += item;
    }
    return sum;

  }

  public static void main(String[] args) {
    int[] numbers = new int[] { 9, 2, 15, 2, 22, 10, 6 };
    // System.out.println(max(numbers));
    System.out.println(whileSum(numbers));

    // 初始化、终止和增量必须以分号分隔。这三个中的每一个都可以包含多个逗号分隔的语句，例如
    for (int i = 0, j = 10; i < j; i += 1) {
      System.out.println(i + j);
    }
    // 应谨慎使用逗号分隔的 for 循环。
  }
}
