package objects;

/**
 * Static vs. Non-Static Methods 静态与非静态方法
 * Instance Variables and Object Instantiation
 * 实例变量和对象实例化
 * 在 Java中，Object是任何类的实例。
 * Array Instantiation, Arrays of Objects 数组实例化，对象数组
 */
public class DogLauncher {
  public static void main(String[] args) {
    Dog d = new Dog();
    d.weightInPounds = 20;
    d.makeNoise();

    d = new Dog(30);
    d.makeNoise();
  }
}
