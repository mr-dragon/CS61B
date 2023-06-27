package objects;

public class ArgsDemo {
  /**
   * public ：到目前为止，我们所有的方法都是从这个关键字开始的。
   * static ：它是一个静态方法，不与任何特定实例关联。
   * void ：它没有返回类型。
   * main ：这是方法的名称。
   * 
   * @param args ：这是传递给main方法的参数。
   */
  public static void main(String[] args) {
    // 命令行/终端:java ArgsDemo these are command line arguments
    // 在上面的例子中， args 将是一个字符串数组，其中的条目是{“these”，“are”，“command”，“line”，“arguments”}
    System.out.println(args[0]);
    // 正常输出应该是: these
  }

  // 练习1.2.3：试着写一个程序来总结命令行参数，假设它们是数字。有关解决方案，请参阅GitHub上提供的网络广播或代码。

}
