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
   * 我们用双字母来称呼它们的原因是。xxPos 不是 xPos
   * 减少打字错误的机会。在过去的几个学期里，学生们在表示y的时候不小心按了x，这引起了很大的调试麻烦。
   */
  double xxPos;
  // 其当前y位置
  double yyPos;
  double xxVel;
  // 其在y方向上的当前速度
  double yyVel;
  // 其质量
  double mass;
  // 与描绘身体的图像对应的文件的名称（例如， jupiter.gif ）
  String imgFileName;

  private static final double G = 6.67e-11;

  // 在添加上面的6个实例变量之后，添加两个Body构造函数，它们可以初始化Body类的实例。稍后，Body类的实例可以表示行星、星星或宇宙中的各种对象。
  public NBody(double xP, double yP, double xV,
      double yV, double m, String img) {
    this.xxPos = xP;
    this.yyPos = yP;
    this.xxVel = xV;
    this.yyVel = yV;
    this.mass = m;
    this.imgFileName = img;
  }

  /*
   * 第二个构造函数应该接受一个Body对象，并初始化一个相同的Body对象（即副本）。第二个构造函数的签名应该是：
   * 你的Body类不应该有一个main方法，因为我们永远不会直接运行Body类（即我们永远不会跑 java Body ）。此外，所有方法都应该是非静态的。
   */
  public NBody(NBody b) {
    this(b.xxPos, b.yyPos, b.xxVel, b.yyVel, b.mass, b.imgFileName);
  }

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

  /*
   * 为了帮助您理解这个 In 类，我们在大纲中给出的文件夹中提供了一些示例 examples 。
   * 第一个被称为 BasicInDemo.java 。看看代码及其输入文件 BasicInDemo_input_file.txt 。
   * 此程序应输出： The file contained 5, 9.0, ketchup, brass, and 5.0 .
   * 
   * 还有一个稍微复杂一点的例子，叫做 InDemo.java ，你也可以在examples文件夹中找到它。
   * 虽然这个演示并不完全符合你在这个项目中要做的事情，但你需要的每个方法都在这个文件的某个地方。
   * 
   * 可以使用提供的TestReadRadius测试此方法。
   * 
   * javac NBody.java TestReadRadius.java
   * java TestReadRadius
   * 
   * Checking readRadius...
   * FAIL: readRadius(): Expected 2.5E11 and you gave 5.0
   */

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
  public static NBody[] readBodies(String fileName) {
    In in = new In(fileName);
    int count = in.readInt();
    /*
     * 一定要这行,因为第二个值是一个真实的 R ，表示全域的半径，用于确定绘图窗口的缩放比例。否则报错:
     * Exception in thread "main" java.util.InputMismatchException
     */
    double radius = in.readDouble();
    NBody[] allNBodys = new NBody[count];
    for (int i = 0; i < count; i++) {
      double xp = in.readDouble();
      double yp = in.readDouble();
      double vx = in.readDouble();
      double vy = in.readDouble();
      double m = in.readDouble();
      String img = in.readString();
      allNBodys[i] = new NBody(xp, yp, vx, vy, m, img);
    }
    return allNBodys;
  }

  public double calcDistance(NBody body) {
    // 请注意，在Java中，没有内置的运算符进行平方或取幂运算。
    // 平方和
    // double sqrtSum = (xxPos - body.xxPos) * (xxPos - body.xxPos) + (yyPos -
    // body.yyPos) * ((yyPos - body.yyPos));
    // // 开平方根得到距离
    // return Math.sqrt(sqrtSum);
    return Math.sqrt((xxPos - body.xxPos) * (xxPos - body.xxPos)
        + (yyPos - body.yyPos) * (yyPos - body.yyPos));
  }

  /**
   * 方法二:接受a Body ，并返回一个描述给定物体对该物体施加的力的双精度值。
   * 应该在 calcDistance 此方法内部调用该方法
   * 提示：在类中将任何常量声明为“static final”变量是一个很好的做法，并且在任何时候都可以使用该变量。
   * 提示2：Java支持科学记数法。例如，我可以写作 double someNumber = 1.03e-7; 。
   */
  public double calcForceExertedBy(NBody body) {
    double r = calcDistance(body);
    // F = G*m1*m2 / r^2
    return G * mass * body.mass / (r * r);
  }

  /**
   * 描述在X方向上施加的力
   */
  public double calcForceExertedByX(NBody body) {
    double dx = body.xxPos - xxPos;// x轴长度
    double r = calcDistance(body);// 两点的距离
    return calcForceExertedBy(body) * dx / r;// 施加的力 * x轴长度 / 两点的距离
  }

  /**
   * 描述在Y方向上施加的力
   */
  public double calcForceExertedByY(NBody body) {
    double dy = body.yyPos - yyPos;// y轴长度
    double r = calcDistance(body);// 两点的距离
    return calcForceExertedBy(body) * dy / r;// 施加的力 * y轴长度 / 两点的距离
  }

  /*
   * 编写方法 calcNetForceExertedByX 和 calcNetForceExertedByY ，每个方法接受一个s数组 Body
   * ，并计算该数组中所有物体对当前物体施加的净X力和净Y力。
   * 例如，考虑下面的代码片段：
   * Body[] allBodys = {samh, rocinante, aegir};
   * samh.calcNetForceExertedByX(allBodys);
   * samh.calcNetForceExertedByY(allBodys);
   * 
   */
  public double calcNetForceExertedByX(NBody[] allBodys) {
    double totalForce = 0;
    for (NBody body : allBodys) {
      // 要比较两个实体，请使用 .equals 方法而不是 == ： samh.equals(samh) （它将返回 true ）。
      if (this.equals(body)) {
        continue;// 跳过自己
      }
      totalForce += calcForceExertedByX(body);
    }
    return totalForce;
  }

  public double calcNetForceExertedByY(NBody[] allBodys) {
    double totalForce = 0;
    for (NBody body : allBodys) {
      if (this.equals(body)) {
        continue;// 跳过自己
      }
      totalForce += calcForceExertedByY(body);
    }
    return totalForce;
  }

  /*
   * 该方法确定施加在物体上的力将导致该物体加速的程度，以及在一小段时间内物体速度和位置的变化
   * 例如，samh.update(0.005, 10, 3) 如果施加的 x-力 10 Newtons和- y力 3
   * Newtons力，则将调整速度和位置0.005 seconds 。
   * 必须使用以下步骤计算Body的移动：
   * 1. 使用提供的x和y力来计算加速度。
   * 2. 通过使用加速度和当前速度来计算新的速度。请记住，加速度描述了单位时间内速度的变化，因此新的速度是:(vx+dt⋅ax,vy+dt⋅ay)
   * 3. 通过使用步骤2中计算出的速度和当前位置来计算新位置。新位置是:(px+dt⋅vx,py+dt⋅vy)
   */
  public void update(double dt, double fX, double fY) {
    // dt = 在一小段时间内物体速度和位置的变化
    // 加速度 = 当前速度/质量
    double ax = fX / mass;
    double ay = fY / mass;

    // 在x方向上的当前速度
    xxVel += dt * ax;
    yyVel += dt * ay;

    xxPos += xxVel * dt;
    // 其当前y位置
    yyPos += yyVel * dt;
  }

  // 使用StdDraw API在Body的位置绘制Body的图像。该 draw 方法不应返回任何内容，也不应接受任何参数
  public void draw() {
    StdDraw.picture(xxPos, yyPos, "images/" + imgFileName);
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
    // String fileName = "./data/planets.txt";
    // double readRadius = readRadius(fileName);
    // System.out.println(readRadius);

    // readBodies(fileName);
    // double T = Double.parseDouble(args[0]);
    double T = new Double(args[0]);

    // dt = 在一小段时间内物体速度和位置的变化
    double dt = new Double(args[1]);
    String filename = args[2];
    double radius = readRadius(filename);
    NBody[] planets = readBodies(filename);

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
      for (NBody planet : planets) {
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
