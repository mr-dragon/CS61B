HW 0: A Java Crash Course

HW Goals硬件目标
------------

In this assignment, we will go through basic Java syntax concepts. While this assignment is optional and you will not submit your answers, it is highly recommended for those with no prior Java experience.  
在本作业中，我们将学习基本的Java语法概念。虽然这个作业是可选的，你不会提交你的答案，但强烈建议那些没有Java经验的人。  
The lectures will NOT cover this material explicitly, though you are expected to understand it.  
本课程不会明确地涵盖这些内容，但希望你能理解。

This tutorial assumes that you have significant (one semester) experience with at least some programming language, and is intended only to highlight the Java way of doing some previously familiar things.  
本教程假设您至少对某些编程语言有重要的（一个学期）经验，并且仅旨在强调Java完成一些以前熟悉的事情的方式。

While I hope this document should stand alone for the curious and self-motivated student, you may find it helpful to read the suggested supplementary reading when provided.  
虽然我希望这份文件应该独立为好奇和自我激励的学生，你可能会发现阅读建议的补充阅读时提供的帮助。

**Feel free to skim and read at whatever pace you feel comfortable with.** It is OK to skip parts of this HW. Use your best judgment. The directions are a bit more verbose than is probably necessary.  
以你觉得舒服的速度随意浏览和阅读。可以跳过此硬件的某些部分。用你最好的判断。说明书比可能需要的要冗长一点。

A Basic Program一个基本程序
---------------------

_Supplementary Reading: N/A  
补充阅读：不适用_

In Lab 1, we’ll learn how to run Java code on your computer. Since lab 1 hasn’t happened yet, we’ll instead use an in-browser Java compiler for this HW only. Head to [this link](http://goo.gl/lKJP1Z), or try [this link](https://goo.gl/65eZ1B) if the link if that first one doesn’t work.  
在实验1中，我们将学习如何在计算机上运行Java代码。由于实验1还没有进行，我们将使用浏览器中的Java编译器仅用于此硬件。前往此链接，或尝试此链接，如果链接，如果第一个不工作。

You’ll find yourself looking at what is perhaps your first Java program. There sure is a lot of weird stuff here, like `public class` and `public static void main(String[] args)`. We’ll discuss these in more detail later, but for this HW, you should ignore all of this mysterious garbage.  
您将发现自己看到的可能是您的第一个Java程序。这里确实有很多奇怪的东西，比如 `public class` 和 `public static void main(String[] args)` 。我们将在后面更详细地讨论这些，但是对于这个硬件，您应该忽略所有这些神秘的垃圾。

**Click on the ‘Forward >’ link twice.** You’ll see an `x` appear in a blue box the right with the value `5` once the line `int x = 5 is executed`. Perhaps unsurprisingly, this statement assigns the value 5 to the variable x.  
点击“转发&gt;”链接两次。你会看到一个 `x` 出现在一个蓝色框的权利与价值一旦 `5` 行 `int x = 5 is executed` 。也许并不令人惊讶的是，该语句将值5赋给变量x。

Unlike other programming languages (like Python, Scheme, and MATLAB), Java variables have a static type. By this, I mean that `x` will only ever be able to store an integer. If you tried to put a number like `5.3` into it, the code would fail.  
与其他编程语言（如Python，Scheme和MATLAB）不同，Java变量具有静态类型。我的意思是，它 `x` 只能存储一个整数。如果你试图把一个像这样的数字放 `5.3` 进去，代码就会失败。

Also unlike these other languages, every statement in Java must be followed by a semicolon. The semicolon is very important, as it tells Java where one statement ends and another begins.  
与其他语言不同的是，Java中的每个语句后面都必须有一个分号。分号非常重要，因为它告诉Java一个语句在哪里结束，另一个语句在哪里开始。

**Click forward again**, and you’ll see that `x` has changed to `6`. **Click forward one more time**, and you’ll see that `x` is printed in the Program output box below using the rather verbose command name `System.out.println`. Yes, this is really how you print in Java. And, it’ll get more verbose, trust me.  
再次单击“前进”，您将看到 `x` 已更改为 `6` 。再次单击前进，您将看到 `x` 在下面的程序输出框中使用相当详细的命令名打印出来 `System.out.println` 。是的，这就是Java中的打印方式。而且，它会变得更冗长，相信我。

Ordinarily, when you write Java programs, you won’t be able to see into your program’s brain (i.e. there will be no blue box listing all the variables). However, this visualizer is a pedagogical tool that makes such brain scanning possible.  
通常，当你写Java程序时，你不能看到你程序的大脑（即大脑）。将没有列出所有变量的蓝框）。然而，这个可视化工具是一个教学工具，使这种大脑扫描成为可能。

**Click forward until the program completes execution.** Everything should behave more or less as you’d expect. If anything surprises you, post to the HW0 thread on the course Piazza page.  
单击“前进”直到程序完成执行。一切都应该或多或少地按照您的期望进行。如果有什么让你惊讶的，张贴到球场广场页面上的HW0线程。

**Optional: Try editing the code and running it again.** Experiment and see what happens as you tweak the program. If you have interesting observations or any questions arise, post them on Piazza. Maybe try assigning a real number (e.g. 3.3) and see what occurs (I promise your computer won’t explode).  
可选：尝试编辑代码并再次运行。试验一下，看看在调整程序时会发生什么。如果你有有趣的观察或任何问题出现，张贴在广场。也许可以尝试分配一个真实的（例如3.3），看看会发生什么（我保证你的电脑不会爆炸）。

Conditionals条件句
---------------

_Optional Supplementary Reading: [Shewchuk](/materials/hw/hw0/hw0_supplementary_conditionals.txt)  
可选补充阅读：休丘克_

### Basic Conditionals基本条件

Now open up [this program](http://goo.gl/q0wIQu) (or [this](https://goo.gl/BFTWZq)), shown below:  
现在打开这个程序（或这个），如下所示：

```
public class ClassNameHere {
    public static void main(String[] args) {
        int x = 5;

        if (x < 10)
            x = x + 10;

        if (x < 10)
            x = x + 10;

        System.out.println(x);
    }
} 
```

**Step forward until the program completes and observe the flow of the program.** The `if` statement in java checks the condition that you put inside parentheses, and if the result is true, it executes the next statement below.  
向前一步，直到程序完成，并观察程序的流程。java `if` 中的语句检查你放在括号内的条件，如果结果为真，它就执行下面的下一条语句。

### Curly Braces (and Conditionals)  
卷发牙套（和条件）

It is also possible to execute multiple statements in response to a single condition. We do this by wrapping the statements in curly braces, as in [this program](http://goo.gl/wzuPsZ) (or [this](https://goo.gl/JouKwc)), shown below:  
还可以执行多个语句来响应单个条件。我们通过将语句包装在花括号中来实现这一点，如下面的程序（或this）所示：

```
public class ConditionalsWithBlocks {
   public static void main(String[] args) {
      int x = 5;

      if (x < 10) {
         System.out.println("I shall increment x by 10.");
         x = x + 10;
      }

      if (x < 10) {
         System.out.println("I shall increment x by 10.");
         x = x + 10;
      }

      System.out.println(x);
   }
} 
```

Curly braces are very important in Java! Unlike Python, statements are grouped by braces, and NOT by indentation. For an example of how this can go terribly wrong, try running the [following program](http://goo.gl/GwhZXB) (or [use this link](https://goo.gl/Czywp3)), which is supposed to print the absolute value of X. **Then try changing the value of x to a positive number. Run it and make sure you understand why things go wrong.**  
大括号在Java中非常重要！与Python不同，语句是按大括号而不是缩进来分组的。举个例子，看看这是如何出错的，试着运行下面的程序（或使用这个链接），它应该打印X的绝对值。然后尝试将x的值更改为正数。运行它，并确保您了解为什么会出错。

```
public class PrintAbsoluteValue {
    public static void main(String[] args) {
        int x = -5;

        if (x < 0)
            System.out.println("I should negate X");
            x = -x;

        System.out.println(x);
    }
} 
```

Unlike Python, most whitespace including indentation does not matter with regards to the functionality of your program.  
与Python不同，大多数空格（包括缩进）与程序的功能无关。  
In fact, you can get away with replacing every whitespace in your entire program with a single space (given that semicolons are the separators between statements), though this is a horrible idea and we will be very sad if you write programs like the following valid Java program:  
事实上，你可以用一个空格替换整个程序中的每一个空格（分号是语句之间的分隔符），尽管这是一个可怕的想法，如果你写了像下面这样的有效Java程序，我们会非常难过：

```
public class ClassNameHere { public static void main(String[] args) { int x = 5; if (x < 10) { System.out.println("I shall increment x by 10."); x = x + 10; } if (x < 10) { System.out.println("I shall increment x by 10."); x = x + 10; } System.out.println(x); } } 
```

### Curly Brace Standards卷曲支撑标准

There are two common styles for curly braces:  
花括号有两种常见样式：

```
if (x > 5) {              if (x > 5)
    x = x + 5;            {
}                            x = x + 5;
                          } 
```

Which of these two styles is a bit of a holy war. Both are fine for use in 61B. Note that in this example, we’ve wrapped curly braces around a single statement, which isn’t required in Java. In 61B, we’ll ALWAYS use curly braces, even if we have only one statement to execute.  
这两种风格哪一种有点圣战的味道。这两种都适用于61B。注意，在这个例子中，我们用花括号括住了一个语句，这在Java中是不需要的。在61B中，我们将始终使用花括号，即使我们只有一个语句要执行。  
This is to avoid bugs. Don’t fret too much about these little details, the automated style checker will yell at you if you do something uncouth.  
这是为了避免bug。不要为这些小细节而烦恼，如果你做了一些不得体的事情，自动样式检查器会对你大喊大叫。

For more than you ever wanted to know about indentation styles, see [this wiki page](http://en.wikipedia.org/wiki/Indent_style).  
更多关于缩进样式的信息，请参阅此wiki页面。

Else埃尔瑟
-------

The `else` keyword allows you to specify behavior that should occur if a condition is false. For example, [this program](http://goo.gl/bzCra2) (or [this](https://goo.gl/ZbbFHx)), shown below:  
关键字允许您指定条件为false时应发生的行为。 `else` keyword allows you to specify behavior that should occur if a condition is false.例如，这个程序（或这个），如下所示：

```
int x = 9;
if (x - 3 > 8) {
    System.out.println("x - 3 is greater than 8");
} else {
    System.out.println("x - 3 is not greater than 8");
} 
```

We can also chain else statements, like in [this program](https://goo.gl/ggFo2c) (or [this](https://goo.gl/tAC9Pf)):  
我们也可以链接else语句，就像这个程序（或this）：

```
int dogSize = 20;
if (dogSize >= 50) {
    System.out.println("woof!");
} else if (dogSize >= 10) {
    System.out.println("bark!");
} else {
    System.out.println("yip!");
} 
```

Note that in the code above, I’ve used `>=`, which means greater than or equal.  
请注意，在上面的代码中，我使用了，这意味着大于或等于。 `>=` , which means greater than or equal.

While而
------

_Optional Supplementary Reading: [Shewchuk](/materials/hw/hw0/hw0_supplementary_loops.txt)  
可选补充阅读：休丘克_

The `while` keyword lets you repeat a block of code as long as some condition is true. For example, [this program](http://goo.gl/mB8DXi) (or [this](https://goo.gl/GQpkPx)), shown below:  
关键字允许您在某些条件为真时重复代码块。 `while` keyword lets you repeat a block of code as long as some condition is true.例如，这个程序（或这个），如下所示：

```
int bottles = 99;
while (bottles > 0) {
    System.out.println(bottles + " bottles of beer on the wall.");
    bottles = bottles - 1;
} 
```

**Try running this program, and watch what happens.** Note that as soon as the code inside curly braces is completed, we head straight back to the while condition. Optionally, experiment a bit: Try and see what happens if you start bottles off at -4. Also try and see what happens if you remove the line: `bottles = bottles - 1`;  
试着运行这个程序，看看会发生什么。请注意，一旦花括号内的代码完成，我们就直接返回while条件。可选地，进行一点实验：试着看看如果你从-4开始放瓶子会发生什么。也试着看看如果删除这行会发生什么：; `bottles = bottles - 1` ;

Important note: You should think of your program as running in order, line by line. If the condition becomes false in the middle of the loop, the code does not simply stop. So for example, the [code below](http://goo.gl/pBg2qf) (also [here](https://goo.gl/uXaKny)) will print “-312 bottles of beer on the wall.” even though -312 is not greater than 0.  
重要提示：你应该把你的程序看作是按顺序一行一行地运行的。如果条件在循环的中间变为false，代码不会简单地停止。例如，下面的代码（也在这里）将打印“-312瓶啤酒在墙上”。即使-312不大于0。

```
int bottles = 5;
while (bottles > 0) {
    bottles = -312;
    System.out.println(bottles + " bottles of beer on the wall.");
} 
```

Doubles and Strings双打和弦乐
------------------------

Above, all of our variables have been of type int. There are many other types that you can use in Java. Two examples of these are double and String. double stores approximations of real numbers, and String stores strings of characters. [The program below](http://goo.gl/25irIR) (also [here](https://goo.gl/PKTBgW)) simulates a race between Achilles and a Tortoise. Achilles is twice as fast, so should overtake the Tortoise (who has a head start of 100 distance units).  
上面，我们所有的变量都是int类型。在Java中还有许多其他类型可以使用。其中两个例子是double和String。double存储真实的的近似值，String存储字符串。下面的程序（也在这里）模拟了阿基里斯和乌龟之间的比赛。阿基里斯的速度是乌龟的两倍，所以应该超过乌龟（乌龟领先100个距离单位）。

```
String a = "Achilles";
String t = "Tortoise";
double aPos = 0;
double tPos = 100;
double aSpeed = 20;
double tSpeed = 10;
double totalTime = 0;
while (aPos < tPos) { 
    System.out.println("At time: " + totalTime);
    System.out.println("    " + a + " is at position " + aPos);
    System.out.println("    " + t + " is at position " + tPos);

    double timeToReach = (tPos - aPos) / aSpeed;
    totalTime = totalTime + timeToReach;
    aPos = aPos + timeToReach * aSpeed;
    tPos = tPos + timeToReach * tSpeed;
} 
```

Creative Exercise 1a: Drawing a Triangle  
创造性练习1a：画三角形
-------------------------------------------------------

Finally! A chance to do something on your own.  
终于来了一个靠自己做点事的机会。

Your goal is to create a program that prints the following figure. Your code should use loops (i.e. shouldn’t just be five print statements, that’s no fun).  
您的目标是创建一个打印下图的程序。你的代码应该使用循环（即不应该只有五个打印语句，这一点也不好玩）。

```
*
**
***
****
***** 
```

You can either write the program from scratch, or you can copy and paste lines of code from [this link](/materials/hw/hw0/hw0_copy_and_paste.html). You may find `System.out.print` to be a useful alternative to `System.out.println`. The difference is that `System.out.print` does not include an automatic newline.  
您可以从头开始编写程序，也可以从此链接复制并粘贴代码行。你可能会发现 `System.out.print` 是一个有用的替代品 `System.out.println` 。不同之处在于 `System.out.print` 不包括自动换行。

If you go the copy and paste route, note that lines may be used once, multiple times, or not at all.  
如果您使用复制和粘贴的方法，请注意行可能会使用一次、多次或根本不使用。

Run your code and verify that it works correctly by comparing it by eye to the program above. In next week’s lab and hw, we’ll discuss more sophisticated ways of verifying program correctness.  
运行您的代码，并通过将其与上面的程序进行比较来验证它是否正确工作。在下周的实验室和硬件中，我们将讨论验证程序正确性的更复杂的方法。

Save your code someplace (say by emailing it to yourself), as you’ll need it again soon.  
把你的代码保存在某个地方（比如通过电子邮件发送给你自己），因为你很快就会需要它。

Defining Functions (a.k.a. Methods)  
定义函数（也称为方法）
-------------------------------------------------

The following four pieces of code are all equivalent in Python, MATLAB, Scheme, and Java. Each defines a function that returns the maximum of two values and then prints the maximum of 5 and 15.  
以下四段代码在Python、MATLAB、Scheme和Java中都是等效的。每个函数都定义了一个函数，该函数返回两个值中的最大值，然后打印最大值5和15。

### PythonPython

```
def max(x, y):
    if (x > y):
        return x
    return y

print(max(5, 15)) 
```

### MATLABMATLAB

```
function m = max(x, y)
    if (x > y)
        m = x
    else
        m = y
    end
end

disp(max(5, 15)) 
```

### Scheme方案

```
(define max (lambda (x y) (if (> x y) x y)))
(display (max 5 15)) (newline) 
```

### Java爪哇

```
public static int max(int x, int y) {
    if (x > y) {
        return x;
    }
    return y;
}

public static void main(String[] args) {
    System.out.println(max(10, 15));
} 
```

(program link [1](http://goo.gl/LzWQD4), [2](https://goo.gl/8x5DYQ))（程序链接1、2）

Functions in Java, like variables, have a specific return type. The `max` function has a return type of `int` (indicated by the word int right before the function name). Also functions in Java are called methods, so I’m going to start calling them from this moment on forever.  
Java中的函数和变量一样，有一个特定的返回类型。该 `max` 函数的返回类型为 `int` （由函数名前的int一词表示）。Java中的函数也被称为方法，所以我将从现在开始永远调用它们。

We refer to the entire string `public static int max(int x, int y)` as the method’s **signature**, as it lists the parameters, return type, name, and any modifiers. Here our modifiers are `public` and `static`, though we won’t learn what these mean for a few days.  
我们将整个字符串 `public static int max(int x, int y)` 称为方法的签名，因为它列出了参数、返回类型、名称和任何修饰符。这里我们的修饰语是 `public` 和 `static` ，尽管我们几天内不会了解它们的含义。

For this homework, all methods are going to have “public static” at the front of their signature. Just accept this for now. We’ll talk more about this on Friday in lecture.  
对于本作业，所有方法都将在其签名的前面具有“公共静态”。先接受现实吧。我们会在周五的课上详细讨论。

Creative Exercise 1b: DrawTriangle  
创造性练习1b：DrawTriangle
---------------------------------------------------------

Starting from the default program at [our Java visualizer](http://cscircles.cemc.uwaterloo.ca/java_visualize/#) (also found [here](http://www.pythontutor.com/java.html#)), create a program with one additional method (in addition to the default main method that is there when you open the visualizer).  
从我们的Java可视化工具的默认程序（也可以在这里找到）开始，创建一个带有一个附加方法的程序（除了打开可视化工具时的默认main方法之外）。

Name this new method `drawTriangle` and give it a return type of `void` (this means that it doesn’t return anything at all).  
将这个新方法命名 `drawTriangle` 为并给予它一个返回类型 `void` （这意味着它根本不返回任何东西）。

The `drawTriangle` method should take one parameter named `N`, and it should print out a triangle exactly like your triangle from exercise 1a, but `N` asterisks tall instead of 5.  
该 `drawTriangle` 方法应该接受一个名为的参数 `N` ，并且它应该打印出一个与练习1a中的三角形完全相同的三角形，但是 `N` 星号高而不是5。

After writing `DrawTriangle`, modify the main function so that it calls `DrawTriangle` with `N = 10`.  
编写完成后 `DrawTriangle` ，修改main函数，使其 `DrawTriangle` 使用 `N = 10` 。

Depending on your programming background, you may find this task quite challenging. We encourage you to work with others or post to Piazza. If you’re just confused about where to start, [this program](http://goo.gl/bl22pF) (also found [here](https://goo.gl/g3vfM2)) starts with `DrawTriangle` already defined (but without the details implemented).  
根据您的编程背景，您可能会发现此任务非常具有挑战性。我们鼓励您与他人合作或发布到Piazza。如果你只是对从哪里开始感到困惑，这个程序（也可以在这里找到）从 `DrawTriangle` 已经定义的（但没有实现的细节）开始。

Arrays数组
--------

_Optional Supplementary Reading: [Shewchuk](/materials/hw/hw0/hw0_supplementary_arrays.txt)  
可选补充阅读：休丘克_

Our final new syntax item of this HW is the array. Arrays are like vectors in Scheme, lists in Python, and arrays in MATLAB.  
这个硬件的最后一个新语法项是数组。数组就像Scheme中的向量、Python中的列表和MATLAB中的数组。

The following four programs in Python, MATLAB, Scheme, and Java declare a new array of the integers 4, 7, and 10, and then prints the 7.  
下面的四个Python、MATLAB、Scheme和Java程序声明了一个新的整数数组4、7和10，然后输出7。

### PythonPython

```
numbers = [4, 7, 10]
print(numbers[1]) 
```

### MATLABMATLAB

```
numbers = [4 7 10]
disp(numbers(2)) 
```

### Scheme方案

```
(define numbers #(4 7 10))
(display (vector-ref numbers 1)) (newline) 
```

### Java爪哇

```
int[] numbers = new int[3];
numbers[0] = 4;
numbers[1] = 7;
numbers[2] = 10;
System.out.println(numbers[1]); 
```

Or in an alternate (but less general) shorthand:  
或者用另一种（但不那么通用的）速记法：

### Alternate Java备用Java

```
int[] numbers = new int[]{4, 7, 10};
System.out.println(numbers[1]); 
```

([program link](http://goo.gl/U6xLky))（节目链接）

You can get the length of an array by using `.length`, for example, the following code would print 3:  
你可以使用数组的长度， `.length` 例如，下面的代码将打印3：

```
int[] numbers = new int[]{4, 7, 10};
System.out.println(numbers.length); 
```

Exercise 2练习二
-------------

Using everything you’ve learned so far on this homework, you’ll now create a function with the signature `public static int max(int[] m)` that returns the maximum value of an int array. You may assume that all of the numbers are greater than or equal to zero.  
使用到目前为止在本作业中学到的所有内容，您现在将创建一个具有 `public static int max(int[] m)` 返回int数组的最大值的签名的函数。你可以假设所有的数字都大于或等于零。

Modify the [code below](http://goo.gl/engJ93) (also found [here](https://goo.gl/YhZLf3)) so that `max` works as described. Furthermore, modify `main` so that the `max` method is called on the given array and its max printed out (in this case, it should print 22).  
修改下面的代码（也可以在这里找到），使其 `max` 按照描述工作。此外，修改 `main` 该方法，以便 `max` 在给定数组上调用该方法并打印出其max（在本例中，它应该打印22）。

```
public class ClassNameHere {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        return 0;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};      
    }
} 
```

For Loops对于循环
-------------

Consider the function below, which sums the elements of an array.  
考虑下面的函数，它对数组的元素求和。

```
public class ClassNameHere {
    /** Uses a while loop to sum a. */
    public static int whileSum(int[] a) {
      int i = 0; //initialization
      int sum = 0;
      while (i < a.length) { //termination
            sum = sum + a[i];
            i = i + 1; //increment
      }
      return sum;
    }
} 
```

Programmers in the 1950s observed that it was very common to have code that featured **initialization** of a variable, followed by a loop that begins by checking for a **termination** condition and ends with an **increment** operation. Thus was born the [for loop](https://en.wikipedia.org/wiki/For_loop).  
20世纪50年代的程序员注意到，具有以初始化变量为特征的代码非常常见，然后是一个循环，该循环以检查终止条件开始，以递增操作结束。于是，for循环诞生了。

The `sum` function below uses a basic for loop to do the exact same job of the `whileSum` function above.  
下面的 `sum` 函数使用一个基本的for循环来完成与上面的函数完全相同的工作 `whileSum` 。

```
public class ClassNameHere {
    /** Uses a basic for loop to sum a. */
    public static int sum(int[] a) {
      int sum = 0;
      for (int i = 0; i < a.length; i = i + 1) {
        sum = sum + a[i];
      }
      return sum;
    }
} 
```

Try it out using [this link](https://goo.gl/5fvnE7).  
使用此链接试试。

In Java, the [`for` keyword](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/for.html) has the syntax below:  
在Java中， `for` 关键字的语法如下：

```
for (initialization; termination; increment) {
    statement(s)
} 
```

The initialization, termination, and increment must be semicolon separated. Each of these three can feature multiple comma-separated statements, e.g.  
初始化、终止和增量必须用分号分隔。这三个中的每一个都可以包含多个逗号分隔的语句，例如

```
for (int i = 0, j = 10; i < j; i += 1) {
    System.out.println(i + j);
} 
```

Comma separated for loops should be used sparingly.  
逗号分隔的循环应该谨慎使用。

Exercise 3练习3
-------------

Rewrite your solution to Exercise 2 so that it uses a for loop. Use your original solution as starter code, or if you’ve lost it, you can use [this](http://goo.gl/engJ93) or [this](https://goo.gl/YhZLf3)).  
重写练习2的解答，使其使用for循环。使用原始解决方案作为起始代码，或者如果丢失了，可以使用this或this）。

```
public class ClassNameHere {
    /** Returns the maximum value from m using a for loop. */
    public static int forMax(int[] m) {
        return 0;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};      
    }
} 
```

Break and Continue中断并继续
-----------------------

Occasionally, you may find it useful to use the `break` or `continue` keywords. The `continue` statement skips the current iteration of the loop, effectively jumping straight to the increment condition.  
有时，您可能会发现使用 `break` 或 `continue` 关键字很有用。该 `continue` 语句跳过循环的当前迭代，实际上直接跳到递增条件。

For example the code below prints each String from an array three times, but skips any strings that contain “horse”. You can try it out at [this link](https://goo.gl/SqX8oz).  
例如，下面的代码将数组中的每个字符串打印三次，但跳过任何包含“horse”的字符串。你可以在这个链接上试试。

```
public class ContinueDemo {
    public static void main(String[] args) {
        String[] a = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};

        for (int i = 0; i < a.length; i += 1) {
            if (a[i].contains("horse")) {
                continue;
            }
            for (int j = 0; j < 3; j += 1) {
                System.out.println(a[i]);
            }
        }
    }
} 
```

By contrast, the `break` keyword completely terminates the innermost loop when it is called. For example the code below prints each String from an array three times, except for strings that contain horse, which are only printed once. You can try it out at [this link](https://goo.gl/e7X3E9).  
相比之下， `break` 关键字在调用时完全终止最内层的循环。例如，下面的代码将数组中的每个String打印三次，但包含horse的字符串除外，它只打印一次。你可以在这个链接上试试。

```
public class BreakDemo {
    public static void main(String[] args) {
        String[] a = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};

        for (int i = 0; i < a.length; i += 1) {
            for (int j = 0; j < 3; j += 1) {
                System.out.println(a[i]);
                if (a[i].contains("horse")) {
                    break;
                }                
            }
        }
    }
} 
```

`break` and `continue` also work for `while` loops and `do-while` loops. If you’re curious about `do-while` loops, see the [official Java looping tutorial](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/while.html).  
`break` 并且 `continue` 也适用于 `while` 循环和 `do-while` 循环。如果您对循环感兴趣 `do-while` ，请参阅官方Java循环教程。

Optional: Exercise 4可选：练习4
--------------------------

This is a particularly challenging exercise, but strongly recommended.  
这是一个特别具有挑战性的练习，但强烈推荐。

Write a function `windowPosSum(int[] a, int n)` that replaces each element a\[i\] with the sum of a\[i\] through a\[i + n\], but only if a\[i\] is positive valued. If there are not enough values because we reach the end of the array, we sum only as many values as we have.  
写一个函数 `windowPosSum(int[] a, int n)` ，将每个元素a\[i\]替换为a\[i\]到a\[i + n\]的和，但仅当a\[i\]是正值时。如果由于到达数组末尾而没有足够的值，则仅对所有值求和。

For example, suppose we call `windowPosSum` with the array `a = {1, 2, -3, 4, 5, 4}`, and `n = 3`. In this case, we’d:  
例如，假设我们 `windowPosSum` 用数组 `a = {1, 2, -3, 4, 5, 4}` 调用 `n = 3` 。在这种情况下，我们将：

*   Replace a\[0\] with a\[0\] + a\[1\] + a\[2\] + a\[3\].  
    将a\[0\]替换为a\[0\] + a\[1\] + a\[2\] + a\[3\]。
*   Replace a\[1\] with a\[1\] + a\[2\] + a\[3\] + a\[4\].  
    将a\[1\]替换为a\[1\] + a\[2\] + a\[3\] + a\[4\]。
*   Not do anything to a\[2\] because it’s negative.  
    不要对a\[2\]做任何事情，因为它是负数。
*   Replace a\[3\] with a\[3\] + a\[4\] + a\[5\].  
    将a\[3\]替换为a\[3\] + a\[4\] + a\[5\]。
*   Replace a\[4\] with a\[4\] + a\[5\].  
    将a\[4\]替换为a\[4\] + a\[5\]。
*   Not do anything with a\[5\] because there are no values after a\[5\].  
    不要对a\[5\]做任何事情，因为a\[5\]之后没有值。

Thus, the result after calling `windowPosSum` would be `{4, 8, -3, 13, 9, 4}`.  
因此，调用后的结果 `windowPosSum` 为 `{4, 8, -3, 13, 9, 4}` 。

As another example, if we called `windowPosSum` with the array `a = {1, -1, -1, 10, 5, -1}`, and `n = 2`, we’d get `{-1, -1, -1, 14, 4, -1}`.  
再举一个例子，如果我们 `windowPosSum` 用数组 `a = {1, -1, -1, 10, 5, -1}` 和调用 `n = 2` ，我们会得到 `{-1, -1, -1, 14, 4, -1}` 。

```
public class BreakContinue {
  public static void windowPosSum(int[] a, int n) {
    /** your code here */ 
  }

  public static void main(String[] args) {
    int[] a = {1, 2, -3, 4, 5, 4};
    int n = 3;
    windowPosSum(a, n);

    // Should print 4, 8, -3, 13, 9, 4
    System.out.println(java.util.Arrays.toString(a));
  }
} 
```

Starter code is available at [this link](https://goo.gl/bh5zaZ).  
此链接提供入门代码。

Hint 1: Use two for loops.  
提示1：使用两个for循环。

Hint 2: Use `continue` to skip negative values.  
提示2： `continue` 用于跳过负值。

Hint 3: Use `break` to avoid going over the end of the array.  
提示3：用于 `break` 避免越过数组的末尾。

The Enhanced For Loop  
增强的For循环
--------------------------------

Java also supports iteration through an array using an “enhanced for loop”. The basic idea is that there are many circumstances where we don’t actually care about the index at all. In this case, we avoid creating an index variable using a special syntax involving a colon.  
Java还支持使用“增强的for循环”通过数组进行迭代。基本的想法是，在很多情况下，我们实际上根本不关心索引。在这种情况下，我们避免使用包含冒号的特殊语法创建索引变量。

For example, in the code below, we do the exact thing as in `BreakDemo` above. However, in this case, we do not create an index `i`. Instead, the String `s` takes on the identity of each String in `a` exactly once, starting from `a[0]`, all the way up to `a[a.length - 1]`. You can try out this code at [this link](https://goo.gl/wmhVPM).  
例如，在下面的代码中，我们做的是上面的完全相同的事情 `BreakDemo` 。但是，在这种情况下，我们不创建索引 `i` 。相反，String `s` 只接受每个String的 `a` 标识一次，从开始 `a[0]` ，一直到 `a[a.length - 1]` 。你可以在这个链接上试试这个代码。

```
public class EnhancedForBreakDemo {
    public static void main(String[] args) {
        String[] a = {"cat", "dog", "laser horse", "ketchup", "horse", "horbse"};

        for (String s : a) {
            for (int j = 0; j < 3; j += 1) {
                System.out.println(s);
                if (s.contains("horse")) {
                    break;
                }                
            }
        }
    }
} 
```