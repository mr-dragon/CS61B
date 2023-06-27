package hw0;

/**
 * break并且continue也适用于while循环和do-while循环
 */
public class BreakDemo {
  public static void main(String[] args) {
    String[] a = { "cat", "dog", "laser horse", "ketchup", "horse", "horbse" };
    // fori方式
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.println(a[i]);
        // 包含 horse 的字符串除外，该字符串仅打印一次
        if (a[i].contains("horse")) {
          break;
        }
      }
    }

    // do-while方式
    for (int i = 0; i < a.length; i++) {
      int j = 0;
      do {
        System.out.println(a[i]);
        if (a[i].contains("horse")) {
          break;
        }
        j++;
      } while (j < 3);
    }

    // 增强的 For 循环
    for (String s : a) {
      for (int j = 0; j < 3; j += 1) {
        System.out.println(s);
        if (s.contains("horse")) {
          break;
        }
      }
    }

  }

}
