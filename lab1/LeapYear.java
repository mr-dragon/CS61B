package lab1;

/**
 * $ java LeapYear 2000
 * 2000 is a leap year.
 * $ java LeapYear 1999
 * 1999 is not a leap year.
 * $ java LeapYear 2004
 * 2004 is a leap year.
 * $ java LeapYear 2100
 * 2100 is not a leap year.
 * 
 * 闰年是：可被400整除 或 能被4整除而不能被100整除。
 * 例如，2000年和2004年是闰年。1900年、2003年和2100年都不是闰年。
 *
 * 运算 % 符实现余数。因此，的值 year % 4 将为 0 、 1 、 2 或 3 。
 * 运算 != 符比较两个值是否不等。代码片段 if (year % 4 != 0) 读作“如果year除以4的余数不等于0”
 * 当运算符的其中一个参数 + 是String时，这些参数将连接为String。例如， "horse" + "babies" 将返回"horsebabies"
 */
public class LeapYear {

  public static void main(String[] args) {
    int year = Integer.parseInt(args[0]);
    boolean leapYear = isLeapYear(year);
    System.out.println(year + " is " + (leapYear ? "" : "not ") + "a leap year.");
  }

  /**
   * 检查是不是闰年
   * 
   * @param year
   * @return
   */
  public static boolean isLeapYear(int year) {
    boolean isLeap = false;
    if ((year % 4 == 0) && (year % 100 != 0)) {
      isLeap = true;
    } else if (year % 400 == 0) {
      isLeap = true;
    }
    return isLeap;
  }

}