package objects;

public class Dog {

  public int weightInPounds;

  // 学名（或二名）
  public static String binomen = "Canis familiaris";

  public Dog() {
  }

  public Dog(int weightInPounds) {
    this.weightInPounds = weightInPounds;
  }

  public void makeNoise() {
    if (weightInPounds < 10) {
      System.out.println("yipyipyip!");
    } else if (weightInPounds < 30) {
      System.out.println("bark. bark.");
    } else {
      System.out.println("woof!");
    }
  }

  public static Dog maxDog(Dog d1, Dog d2) {
    if (d1.weightInPounds > d2.weightInPounds) {
      return d1;
    }
    return d2;
  }

  /*
   * 练习1.2.1：下面的方法会做什么？如果你不确定，试试看。
   * public static Dog maxDog(Dog d1, Dog d2) {
   * if (weightInPounds > d2.weightInPounds) {
   * return this;
   * }
   * return d2;
   * }
   */

  public static void main(String[] args) {
    Dog d = new Dog(15);
    Dog d2 = new Dog(100);
    System.out.println(Dog.maxDog(d, d2));
  }

}
