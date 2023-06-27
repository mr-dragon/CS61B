package objects;

/**
 * 目标：创建一个名为ArgsSum的程序，假设命令行参数是数字，打印出它们的总和。
 */
public class ArgsSum {

  /**
   * launch.json
   * ArgsSum下的配置 添加: "args": "1 2 3"
   * 运行结果: 6
   */
  public static void main(String[] args) {
    int sum = 0;
    int index = 0;
    while (index < args.length) {
      // How’d we know to do this? We Googled “convert string integer java”.
      sum += Integer.parseInt(args[index]);
      index += 1;
    }
    System.out.println(sum);
  }
}
