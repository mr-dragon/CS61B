package objects;

/**
 * Exercise 1.2.2
 * https://docs.google.com/presentation/d/10BFLHH8VaoYy7XaazwjaoTtLw3zvasX4HCssDruqw84/edit#slide=id.g6caa9a6fe_057
 * Question: Will this program compile? If so, what will it print?
 */
public class DogLoop {
  public static void main(String[] args) {
    Dog smallDog = new Dog(5);
    Dog mediumDog = new Dog(25);
    Dog hugeDog = new Dog(150);

    Dog[] manyDogs = new Dog[4];// 下标3 会有空指针
    manyDogs[0] = smallDog;
    manyDogs[1] = hugeDog;
    manyDogs[2] = new Dog(130);

    int i = 0;
    while (i < manyDogs.length) {

      // manyDogs[3] 空指针
      Dog.maxDog(manyDogs[i], mediumDog).makeNoise();
      i = i + 1;
    }
    /*
     * 结果:
     * bark. bark.
     * woof!
     * woof!
     * Q: Exception in thread "main" java.lang.NullPointerException: Cannot read
     * field "weightInPounds" because "d1" is null
     */
  }
}
