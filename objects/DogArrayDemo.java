package objects;

/**
 * 注意new有两种不同的用法：一次用于创建可以容纳两个对象的数组 Dog ，两次用于创建每个实际对象 Dog 。
 */
public class DogArrayDemo {
  public static void main(String[] args) {
    /* Create an array of two dogs. */
    Dog[] dogs = new Dog[2];

    dogs[0] = new Dog(8);
    dogs[1] = new Dog(20);

    /* Yipping will result, since dogs[0] has weight 8. */
    dogs[0].makeNoise();
  }
}
