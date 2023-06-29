/**
 * sp18/19:Getting Started with the Simulator (NBody.java) | 模拟器入门（NBody.java）
 * https://sp19.datastructur.es/materials/proj/proj0/proj0#the-body-class-and-its-constructor
 * sp21-2048游戏:
 * https://sp21.datastructur.es/materials/proj/proj0/proj0
 */
public class Body {

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

  // 在添加上面的6个实例变量之后，添加两个Body构造函数，它们可以初始化Body类的实例。稍后，Body类的实例可以表示行星、星星或宇宙中的各种对象。
  public Body(double xP, double yP, double xV,
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
  public Body(Body b) {
    this(b.xxPos, b.yyPos, b.xxVel, b.yyVel, b.mass, b.imgFileName);
  }

  /*
   * 这个项目中的所有数字都将是双精度浮点数。我们稍后会在课程中详细介绍双精度浮点数，但目前可以将其视为实数，例如双精度浮点数 x = 3.5。
   * 此外，所有实例变量和方法都将使用public关键字声明。
   */

  /*
   * 一旦你填写了构造函数，你可以通过编译你的 Body.java 文件和 TestBodyConstructor.java 我们提供的文件来测试它。
   * 你可以使用以下命令进行编译：javac Body.java TestBodyConstructor.java
   * 您可以使用以下命令运行我们提供的测试 java TestBodyConstructor
   * 如果你通过了这个测试，你就准备好进入下一步了。在通过此测试之前，请不要继续。
   */

  /*
   * Understanding the Physics 理解物理学
   * Body 的物体将遵循牛顿物理定律
   * 成对力：牛顿的万有引力定律断言两个粒子之间的引力强度是由它们的质量除以它们之间距离的平方的乘积给出的
   * 注意力是矢量（即，有方向）。特别是，要注意dx和dy是有符号的（正或负）。
   * 净力：叠加原理说，在x或y方向上作用在粒子上的净力是在该方向上作用在粒子上的成对力的总和。
   * 加速度：牛顿第二运动定律说，x和y方向的加速度由下式给出：ax=Fxm
   */

  /**
   * 方法一:计算两个s之间的距离
   * 接受单个Body，并应返回一个double，该double等于所提供的Body与正在进行计算的Body之间的距离
   * 
   * 假设空间中有三个物体：
   * Samh: x=1,y=0,mass=10
   * Aegir: x=3,y=3,mass=5
   * Rocinante: x=5,y=−3,mass=50
   * <p>
   * (6.67 * 10^-11 * 10 * 5) / 13 * 2 / sqrt(13) + (6.67 * 10^-11 * 10 * 50) /25
   * * 4 / sqrt(25)
   * </p>
   * <p>
   * (10 * 5 * 6.67 * 10^-11) /13 * 3 / sqrt(13) - (50 * 10 * 6.67 * 10^-11) /
   * 25*3 / sqrt(25)
   * </p>
   */
  public double calcDistance(Body body) {
    // 请注意，在Java中，没有内置的运算符进行平方或取幂运算。
    // 平方和
    double sqrtSum = (xxPos - body.xxPos) * (yyPos - body.xxPos) + (yyPos - body.yyPos) * ((yyPos - body.yyPos));
    // 开平方根得到距离
    return Math.sqrt(sqrtSum);
  }

  /**
   * 验证结果
   * javac Body.java TestCalcDistance.java
   * java TestCalcDistance.java
   * Checking calcDistance...
   * PASS: calcDistance(): Expected 1.0 and you gave 1.0
   * PASS: calcDistance(): Expected 5.0 and you gave 5.0
   */

  /*
   * 牛顿物理定律 6.67e-11 * Nm^2/kg^2
   * F = G*m1*m2 / r^2
   * 引力常数 G
   */
  private static final double G = 6.67e-11;

  /**
   * 给定一个文件名a String ，它应该返回一个double
   * 返回:对应于该文件中的universe的半径
   */
  public static double readRadius(String fileName) {
    In in = new In(fileName);
    double radius = in.readDouble();
    return radius;
  }

  /**
   * 给定一个文件名，它应该返回一个 Body 对应于文件中主体的s数组，
   * 例如：应该 readBodies("./data/planets.txt") 返回五颗行星的阵列。
   * 您可以使用提供的TestReadBodies测试此方法。
   * javac Body.java Planet.java TestReadBodies.java
   * java TestReadBodies
   * 
   * Checking readBodies...
   * PASS: readBodies(); Congrats! This was the hardest test!
   */
  public static Planet[] readBodies(String fileName) {
    In in = new In(fileName);
    int count = in.readInt();
    /*
     * 一定要这行,因为第二个值是一个真实的 R ，表示全域的半径，用于确定绘图窗口的缩放比例。否则报错:
     * Exception in thread "main" java.util.InputMismatchException
     */
    double radius = in.readDouble();
    Planet[] allPlanets = new Planet[count];
    for (int i = 0; i < count; i++) {
      double xp = in.readDouble();
      double yp = in.readDouble();
      double vx = in.readDouble();
      double vy = in.readDouble();
      double m = in.readDouble();
      String img = in.readString();
      allPlanets[i] = new Planet(xp, yp, vx, vy, m, img);
    }
    return allPlanets;
  }

  /**
   * 方法二:接受a Body ，并返回一个描述给定物体对该物体施加的力的双精度值。
   * 应该在 calcDistance 此方法内部调用该方法
   * 提示：在类中将任何常量声明为“static final”变量是一个很好的做法，并且在任何时候都可以使用该变量。
   * 提示2：Java支持科学记数法。例如，我可以写作 double someNumber = 1.03e-7; 。
   */
  public double calcForceExertedBy(Body body) {
    double r = calcDistance(body);
    // F = G*m1*m2 / r^2
    return G * mass * body.mass / (r * r);
  }

  /*
   * 牛顿的万有引力定律
   * 净力：叠加原理说，在x或y方向上作用在粒子上的净力是在该方向上作用在粒子上的成对力的总和。
   */

  /**
   * 描述在X方向上施加的力
   */
  public double calcForceExertedByX(Body body) {
    double dx = body.xxPos - xxPos;// x轴长度
    double r = calcDistance(body);// 两点的距离
    return calcForceExertedBy(body) * dx / r;// 施加的力 * x轴长度 / 两点的距离
  }

  /**
   * 描述在Y方向上施加的力
   */
  public double calcForceExertedByY(Body body) {
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
  public double calcNetForceExertedByX(Body[] allBodys) {
    double totalForce = 0;
    for (Body body : allBodys) {
      // 要比较两个实体，请使用 .equals 方法而不是 == ： samh.equals(samh) （它将返回 true ）。
      if (this.equals(body)) {
        continue;// 跳过自己
      }
      totalForce += calcForceExertedByX(body);
    }
    return totalForce;
  }

  public double calcNetForceExertedByY(Body[] allBodys) {
    double totalForce = 0;
    for (Body body : allBodys) {
      if (this.equals(body)) {
        continue;// 跳过自己
      }
      totalForce += calcForceExertedByY(body);
    }
    return totalForce;
  }

  /*
   * 完成后，继续运行：
   * javac Body.java TestCalcNetForceExertedByXY.java
   * java TestCalcNetForceExertedByXY
   * result:
   * Checking calcNetForceExertedByXY...
   * PASS: calcNetForceExertedByX(): Expected 133.4 and you gave 133.4
   * PASS: calcNetForceExertedByY(): Expected 0.0 and you gave 0.0
   * Running test again, but with array that contains the target planet.
   * PASS: calcNetForceExertedByX(): Expected 133.4 and you gave 133.4
   * PASS: calcNetForceExertedByY(): Expected 0.0 and you gave 0.0
   */

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

  /*
   * 重新编译并测试你的方法：
   * javac Body.java TestUpdate.java
   * java TestUpdate
   * result:
   * Checking update...
   * PASS: xxVel update(): Expected 3.4 and you gave 3.4
   * PASS: yyVel update(): Expected 3.8 and you gave 3.8
   * PASS: xxPos update(): Expected 7.8 and you gave 7.8
   * PASS: yyPos update(): Expected 8.6 and you gave 8.6
   */

  // 使用StdDraw API在Body的位置绘制Body的图像。该 draw 方法不应返回任何内容，也不应接受任何参数
  public void draw() {
    StdDraw.enableDoubleBuffering();

    /**
     * Sets up the universe so it goes from
     * -100, -100 up to 100, 100
     */
    StdDraw.setScale(-100, 100);// 这样设置 就会充满屏幕

    /* Clears the drawing window. */
    // StdDraw.clear();

    StdDraw.picture(this.xxPos, this.yyPos, this.imgFileName);
    // 一定要有,不然显示是空白的, 感觉是老师故意留的
    StdDraw.show();
  }

  public static void main(String[] args) {
    double xxPos = 0.0,
        yyPos = 0.0,
        xxVel = 3.0,
        yyVel = 4.0,
        mass = 5.0;
    Body body = new Body(xxPos, yyPos, xxVel, yyVel, mass, "images/starfield.jpg");
    body.draw();// 测试画图方法
  }

}
