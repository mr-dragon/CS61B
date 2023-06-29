/**
 * 将NBody大部分内容,迁移到此处隔离开
 */
public class Planet {
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
  public Planet(double xP, double yP, double xV,
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
  public Planet(Planet b) {
    this(b.xxPos, b.yyPos, b.xxVel, b.yyVel, b.mass, b.imgFileName);
  }

  public double calcDistance(Planet body) {
    // 请注意，在Java中，没有内置的运算符进行平方或取幂运算。
    // 平方和
    double sqrtSum = (xxPos - body.xxPos) * (xxPos - body.xxPos) + (yyPos - body.yyPos) * ((yyPos - body.yyPos));
    // 开平方根得到距离
    return Math.sqrt(sqrtSum);
  }

  /**
   * 方法二:接受a Body ，并返回一个描述给定物体对该物体施加的力的双精度值。
   * 应该在 calcDistance 此方法内部调用该方法
   * 提示：在类中将任何常量声明为“static final”变量是一个很好的做法，并且在任何时候都可以使用该变量。
   * 提示2：Java支持科学记数法。例如，我可以写作 double someNumber = 1.03e-7; 。
   */
  public double calcForceExertedBy(Planet body) {
    double r = calcDistance(body);
    // F = G*m1*m2 / r^2
    return G * mass * body.mass / (r * r);
  }

  /**
   * 描述在X方向上施加的力
   */
  public double calcForceExertedByX(Planet body) {
    double dx = body.xxPos - xxPos;// x轴长度
    double r = calcDistance(body);// 两点的距离
    return calcForceExertedBy(body) * dx / r;// 施加的力 * x轴长度 / 两点的距离
  }

  /**
   * 描述在Y方向上施加的力
   */
  public double calcForceExertedByY(Planet body) {
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
  public double calcNetForceExertedByX(Planet[] allBodys) {
    double totalForce = 0;
    for (Planet body : allBodys) {
      // 要比较两个实体，请使用 .equals 方法而不是 == ： samh.equals(samh) （它将返回 true ）。
      if (this.equals(body)) {
        continue;// 跳过自己
      }
      totalForce += calcForceExertedByX(body);
    }
    return totalForce;
  }

  public double calcNetForceExertedByY(Planet[] allBodys) {
    double totalForce = 0;
    for (Planet body : allBodys) {
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
    StdDraw.picture(this.xxPos, this.yyPos, "images/" + this.imgFileName);
  }

}
