/**
 * 创建名为的文件 NBody.java 。
 * NBody是一个将实际运行模拟的类。这个类没有构造函数。
 * 这个类的目标是模拟一个数据文件中指定的域。
 * 例如，如果我们查看data/planets.txt（使用命令行 more 命令），我们会看到以下内容：
 * 
 * 输入格式是一个文本文件，其中包含特定宇宙的信息（以SI为单位）。
 * 第一个值是 N 表示行星数量的整数。
 * 第二个值是一个真实的 R ，表示全域的半径，用于确定绘图窗口的缩放比例。
 * 最后，有 N 行，每行包含6个值。
 * 
 * 前两个值是初始位置的x和y坐标;
 * 下一对值是初始速度的x和y分量;
 * 第五个值是质量;
 * 最后一个值是一个字符串，它是用于显示行星的图像文件的名称。
 * 
 */
public class NBody {

  /**
   * 给定一个文件名a String ，它应该返回一个double
   * 返回:对应于该文件中的universe的半径
   */
  public static double readRadius(String fileName) {
    In in = new In(fileName);
    int num = in.readInt();// 必须 读,否则图片出来了,但是 不会动,切 只有一个行星,因为 这里算的值 很小引起的
    double radius = in.readDouble();
    return radius;
  }

  /**
   * 给定一个文件名，它应该返回一个 Body 对应于文件中主体的s数组，
   * 例如：应该 readBodies("./data/planets.txt") 返回五颗行星的阵列。
   * 您可以使用提供的TestReadBodies测试此方法。
   * javac Body.java NBody.java TestReadBodies.java
   * java TestReadBodies
   * 
   * Checking readBodies...
   * PASS: readBodies(); Congrats! This was the hardest test!
   */
  public static Planet[] readPlanets(String fileName) {
    In in = new In(fileName);
    int count = in.readInt();
    /*
     * 一定要这行,因为第二个值是一个真实的 R ，表示全域的半径，用于确定绘图窗口的缩放比例。否则报错:
     * Exception in thread "main" java.util.InputMismatchException
     */
    double radius = in.readDouble();
    Planet[] planets = new Planet[count];
    for (int i = 0; i < count; i++) {
      double xp = in.readDouble();
      double yp = in.readDouble();
      double vx = in.readDouble();
      double vy = in.readDouble();
      double m = in.readDouble();
      String img = in.readString();
      planets[i] = new Planet(xp, yp, vx, vy, m, img);
    }
    return planets;
  }

  /**
   * 绘制宇宙初始态（main）
   * 将第0个和第1个命令行参数存储为名为和的double T,dt
   * 将第二个命令行参数存储为名为的字符串 filename
   * 提示：参数以字符串形式出现。你将不得不谷歌，以了解如何转换字符串到double！
   * 
   * @param args "157788000.0 25000.0 data/planets.txt"
   */
  public static void main(String[] args) {
    double T = Double.parseDouble(args[0]);

    // dt = 在一小段时间内物体速度和位置的变化
    double dt = Double.parseDouble(args[1]);
    String filename = args[2];
    double radius = readRadius(filename);
    Planet[] planets = readPlanets(filename);

    /*
     * Drawing the Background 画背景
     * main方法从文件中读取完所有内容后，就可以开始绘图了。
     * 首先，设置比例，使其与宇宙的半径相匹配。然后绘制图像 starfield.jpg作为背景。
     * 要做到这一点，您需要弄清楚如何使用StdDraw库。
     * 有关 StdDrawDemo.java StdDraw的演示，请参见examples文件夹。这个例子，就像 InDemo.java
     * ，并不完全符合你正在做的。
     * 请务必查看本迷你教程的StdDraw部分 [the StdDraw section of this
     * mini-tutorial](http://introcs.cs.princeton.edu/java/15inout/)
     * 
     */

    // 返回NBody.java中的main方法，并使用您刚刚编写的draw方法来绘制您创建的Bodys数组中的每个物体。
    // 请确保在绘制starfield.jpg文件之后执行此操作，以免行星被背景遮挡。

    // set the universe scale
    StdDraw.setXscale(-radius, radius);
    StdDraw.setYscale(-radius, radius);
    StdDraw.enableDoubleBuffering();

    // 创建一个表示时间的变量。将其设置为0。设置一个循环，直到这个时间变量到达（并包含）上面 T 的。
    double t = 0;
    int num = planets.length;
    while (t <= T) {
      /*
       * 对于循环中的每一次，执行以下操作：
       * 创建 xForces 数组和 yForces 数组。
       * 计算每个实体的x和y净力，并分别将其存储在 xForces 和 yForces 数组中。
       */
      double[] xForces = new double[num];// X 力量
      double[] yForces = new double[num];

      // 计算每个实体的x和y净力
      for (int i = 0; i < num; i++) {
        xForces[i] = planets[i].calcNetForceExertedByX(planets);
        yForces[i] = planets[i].calcNetForceExertedByY(planets);
      }

      // 在计算出每个物体的净力后， update 调用每一个 Body s。这将更新每个物体的位置、速度和加速度。
      for (int i = 0; i < num; i++) {
        planets[i].update(dt, xForces[i], yForces[i]);
      }

      // draw the backgroud picture 绘制背景图像。
      // StdDraw.picture(x, y, filename) 以给定的文件名（JPEG、GIF或PNG格式）在画布上以（x，y）为中心绘制图像
      StdDraw.picture(0, 0, "images/starfield.jpg");

      // StdDraw 支持称为双缓冲的强大计算机图形功能。当通过调用启用双缓冲时 enableDoubleBuffering()
      // ，所有绘制都发生在屏幕外的画布上。屏幕外画布不显示;它只存在于计算机内存中。只有在调用时 show()
      // ，绘图才会从屏幕外的画布复制到屏幕上的画布，并显示在标准绘图窗口中。您可以将双缓冲想象成收集您告诉它绘制的所有线、点、形状和文本，然后根据请求同时绘制它们。
      // StdDraw.show();
      /**
       * 画出所有的 Body s 绘制传入文件中的所有行星到图上
       */
      for (Planet planet : planets) {
        planet.draw();
      }

      // 显示屏幕外缓冲区（参见StdDraw show 的方法）。
      StdDraw.show();
      // 暂停时间为t毫秒。这个方法是为了支持计算机动画。
      // 暂停动画10毫秒（参见StdDraw pause 的方法）。您可能需要在您的计算机上调整这一点。
      StdDraw.pause(10);
      // 将时间变量增加 dt 。
      t += dt;

      /*
       * 重要：对于每次通过主循环， update 在计算所有力并安全存储在和中之前 xForces ，不要调用 yForces 。
       * 例如， bodies[0].update() 在完成整个 xForces 和 yForces 数组之后不要调用！
       * 差别很小，但是如果你在计算和之前打电话，自动分级程序会很不高兴 bodies[0].update xForces[1] yForces[1]
       * 
       * 编译和测试你的程序：
       * javac NBody.java
       * java NBody 157788000.0 25000.0 data/planets.txt
       */
    }

    // 打印读到的数据到控制台
    StdOut.printf("%d\n", num);
    StdOut.printf("%.2e\n", radius);
    for (int i = 0; i < planets.length; i++) {
      StdOut.printf("%11.4e %11.4e %11.4e %11.4e %11.4e %12s\n",
          planets[i].xxPos, planets[i].yyPos, planets[i].xxVel,
          planets[i].yyVel, planets[i].mass, planets[i].imgFileName);
    }
  }

}
