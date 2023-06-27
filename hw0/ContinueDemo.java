package hw0;

public class ContinueDemo {
  public static void main(String[] args) {
    // 下面的代码将数组中的每个字符串打印三次，但跳过任何包含“horse”的字符串
    String[] a = { "cat", "dog", "laser horse", "ketchup", "horse", "horbse" };
    for (String string : a) {
      if (string.contains("horse")) {
        continue;
      }
      for (int j = 0; j < 3; j += 1) {
        System.out.println(string);
      }
    }

  }
}
