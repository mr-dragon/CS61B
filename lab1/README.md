# lab1

## FAQ

### lab1 下有HelloNumbers Clooatz等java类,但是编译报错

同等问题: 执行java HelloWorld,就是提醒没有类,因为 有 `package helloworld;` `package lab1;`, 导致识别不到,删掉就好了.

gradescope 自动评测结果:

```shell
Compiling tests for Lab...
=========== COMPILATION ERROR =============
/autograder/course-materials/lab/lab1/grader/submit/AGTestHelloNumbers.java:14: error: cannot access HelloNumbers
		HelloNumbers.main(null);
		^
  bad source file: /autograder/submission/lab1/./HelloNumbers.java
    file does not contain class HelloNumbers
    Please remove or make sure it appears in the correct subdirectory of the sourcepath.
/autograder/course-materials/lab/lab1/grader/submit/AGTestCollatz.java:14: error: cannot access Collatz
      Collatz.main(null);
      ^
  bad source file: /autograder/submission/lab1/./Collatz.java
    file does not contain class Collatz
    Please remove or make sure it appears in the correct subdirectory of the sourcepath.
2 errors

```

#### 解决方法

去掉:`package`, 将lab1单独打开,而不是 打开整个cs61b的项目文件夹,以后的作业也是同理.

### array lengths differed, expected.length=6 actual.length=10

数组长度不同，期望长度为6，实际长度为10。

System.out.print(n + " ");// 打印n,不打印会不能通过gradescope核验

放错位置了,放在 main主函数即可.
