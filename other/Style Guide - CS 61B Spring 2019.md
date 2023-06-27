Style Guide

Author: Alan Yao作者：Alan Yao

A note on this style guide: It is probably easier to get to know these rules by running the automated style checker. (More instructions on how to run the automated style checker will be given in the future.)  
关于此样式指南的说明：通过运行自动样式检查器可能更容易了解这些规则。(More关于如何运行自动样式检查器的说明将在将来给出。

Whitespace空白
------------

1.  Each file must end with a newline sequence.  
    每个文件必须以换行符序列结束。
    
2.  Files may not contain horizontal tab characters. Use blanks only for indentation.  
    文件不能包含水平制表符。空格只用于缩进。
    
3.  No line may contain trailing blanks.  
    任何行都不能包含尾随空格。
    
4.  Do NOT put whitespace:  
    不要使用空格：
    1.  Around the “<” and “>” within a generic type designation (“List", not "List ", or "List< Integer >").  
        在泛型类型指定中的“&lt;”和“&gt;”周围（“List”，而不是“List”，或“List< Integer >”）。
    2.  After the prefix operators “!”, “–”, “++”, unary “-“, or unary “+”.  
        在前缀运算符“！“，“-”、“++”、一元“-”或一元“+”。
    3.  Before the tokens “;” or the suffix operators “–” and “++”.  
        代币之前”;或后缀运算符“-”和“++”。
    4.  After “(“ or before “)”.  
        在“（”之后或“）”之前。
    5.  After “.”在“”之后。
    6.  When you are lonely.  
        当你寂寞的时候。
5.  DO put whitespace: 输入空格：
    1.  After “;”, “,”, or type casts (e.g., “(String) x”, not “(String)x”).  
        在“;”、“”、“”或类型转换（例如“（String）x”，而不是“（String）x”）。
    2.  Around binary operators (e.g., “*”, “+”) and comparison operators.  
        围绕二进制运算符（例如，“*”、“+”）和比较运算符。
    3.  Around assignment operators (e.g., “=”, “+=”).  
        围绕赋值运算符（例如，“=”、“+=”）。
    4.  Around “?” and “:” in the ternary conditional operator (“x>0 ? x : -x”).  
        周围“？”和三元条件运算符中的“：”（“x>0？x：-x”）。
    5.  Around the keywords “assert”, “catch”, “do”, “else”, “finally”, “for”, “if”, “return”, “synchronized”, “try”, and “while”.  
        在关键字“assert”、“catch”、“do”、“else”、“finally”、“for”、“if”、“return”、“synchronized”、“try”和“while”周围。
6.  In general, break (insert newlines in) lines before an operator, as in  
    一般来说，在操作符前换行（插入换行符），如
    
7.  Do not separate a method name from the “(“ in a method call with blanks. However, you may separate them with a newline followed by blanks (for indentation) on long lines.  
    不要用空格将方法名与方法调用中的“（”分开。但是，您可以在较长的行中使用换行符后跟空格（用于缩进）来分隔它们。

Indentation压痕
-------------

1.  The basic indentation step is 4 spaces.  
    基本缩进步骤是4个空格。
    
2.  Indent code by the basic indentation step for each block level (blocks are generally enclosed in “{“ and “}”), as in  
    按每个块级别的基本缩进步骤缩进代码（块通常包含在“{”和“}”中），如
    
    ```
     if (x > 0) {
         r = -x;
     } else {
         r = x;
     } 
    ```
    
3.  Indent ‘case’ labels an indent past their enclosing ‘switch’, as in  
    缩进'case'标记了一个超过其封闭的'switch'的缩进，如
    
    ```
     switch (op) {
         case '+':
             addOpnds(x, y);
             break;
         default:
             ERROR();
     } 
    ```
    
4.  Indent continued lines by the basic indentation step.  
    按基本缩进步骤缩进连续行。
    

Braces牙套
--------

1.  Use { } braces around the statements of all ‘if’, ‘while’, ‘do’, and ‘for’ statements.  
    使用{ }大括号括住所有'if'、'while'、'do'和'for'语句。
    
2.  Place a “}” brace on the same line as a following “else”, “finally”, or “catch”, as in  
    将“}”花括号与后面的“else”、“finally”或“catch”放在同一行上，如
    
    ```
     if (x > 0) {
         y = -x;
     } else {
         y = x;
     } 
    ```
    
3.  Put the “{“ that opens a block at the end of a line. Generally, it goes at the end of the “if”, “for”, “while”, “switch”, “do”, method header, or class header that contains it. If line length forces it to the next line, do not indent it, and put it alone on the line.  
    将打开一个块的“{”放在一行的末尾。通常，它位于包含它的“if”、“for”、“while”、“switch”、“do”、方法头或类头的末尾。如果行长迫使它到下一行，不要缩进它，并把它单独放在一行。
    

1.  Methods should have javadoc comments explaining the behavior, parameters (using @param tags or otherwise), and return type.  
    方法应该有javadoc注释来解释行为、参数（使用@param标记或其他方式）和返回类型。
    
2.  Methods that return non-void values must describe them in their Javadoc comment either with a “@return” tag or in a phrase in running text that contains the word “return”, “returning”, or “returns”.  
    返回非空值的方法必须在其Javadoc注释中使用“@return”标记或包含单词“return”、“returning”或“returns”的运行文本中的短语来描述它们。
    
3.  Each Javadoc comment must start with a properly formed sentence, starting with a capital letter and ending with a period.  
    每个Javadoc注释必须以正确格式的句子开头，以大写字母开头，以句号结尾。
    

Names姓名
-------

1.  Names of static final constants must be in all capitals (e.g., RED, DEFAULT_NAME).  
    静态final常量的名称必须全部大写（例如，RED，DEFAULT_NAME）。
    
2.  Names of parameters, local variables, and methods must start with a lower-case letter, or consist of a single, upper-case letter.  
    参数、局部变量和方法的名称必须以小写字母开头，或由单个大写字母组成。
    
3.  Names of types (classes), including type parameters, must start with a capital letter.  
    类型（类）的名称，包括类型参数，必须以大写字母开头。
    
4.  Names of packages must start with a lower-case letter.  
    软件包的名称必须以小写字母开头。
    
5.  Names of instance variables and non-final class (static) variables must start with either a lower-case letter or “_”.  
    实例变量和非final类（静态）变量的名称必须以小写字母或“_”开头。
    

Imports进口
---------

1.  Do not use ‘import PACKAGE._’, unless the package is java.lang.Math, java.lang.Double, or org.junit.Assert. ‘import static CLASS._’ is OK.  
    不要使用“import PACKAGE”。除非包是java.lang.Math、java.lang.Double或org. junit. Assert。'import static CLASS.'就可以了。
    
2.  Do not import the same class or static member twice.  
    不要两次导入同一个类或静态成员。
    
3.  Do not import classes or members that you do not use.  
    不要导入不使用的类或成员。
    

Assorted Java Style Conventions  
各种Java样式约定
--------------------------------------------

1.  Write array types with the “\[\]” after the element-type name, not after the declarator. Write “String\[\] names”, not “String names\[\]”.  
    在元素类型名称之后而不是声明符之后写入带有“\[\]”的数组类型。写“String\[\] names”，而不是“String names\[\]”。
    
2.  Write any modifiers for methods, classes, or fields in the following order:  
    按以下顺序编写方法、类或字段的任何修饰符：
    1.  public, protected, or private.  
        公共的、受保护的或私有的。
    2.  abstract or static.抽象的或静态的。
    3.  final, transient, or volatile.  
        最终的、暂时的或易失的。
    4.  synchronized.
    5.  native.
    6.  strictfp.
3.  Do not explicitly modify methods, fields, or classes where the modification is redundant:  
    不要显式修改多余的方法、字段或类：
    1.  Do not label methods in interfaces or annotations as “public” or “abstract”.  
        不要将接口或注释中的方法标记为“public”或“abstract”。
    2.  Do not label fields in interfaces or annotations as “static”, “public”, or “final”.  
        不要将接口或注释中的字段标记为“static”、“public”或“final”。
    3.  Do not label methods in final classes as “final”.  
        不要将final类中的方法标记为“final”。
    4.  Do not label nested interfaces “static”.  
        不要将嵌套接口标记为“static”。
4.  Do not use empty blocks (‘{ }’ with only whitespace or comments inside) for control statements. There is one exception: a catch block may consist solely of comments having the form  
    不要对控制语句使用空块（“{}”中只有空格或注释）。但有一个例外：catch块可以仅由具有以下形式的注释组成
    
    ```
     /* Ignore EXCEPTIONNAME. */ 
    ```
    
5.  Avoid “magic numbers” in code by giving them symbolic names, as in  
    在代码中避免使用“幻数”，方法是给它们起符号名称，如
    
    ```
     public static final MAX_SIZE = 100; 
    ```
    
    Exceptions are the numerals -10 through 10, 0.5, -0.5, 0.25, -0.25.  
    例外是数字-10到10、0.5、-0.5、0.25、-0.25。
    
6.  Do not try to catch the exceptions Exception, RuntimeError, or Error.  
    不要尝试捕获异常Exception、RuntimeError或Error。
    
7.  Write “b” rather than “b == true” and “!b” rather than “b == false”.  
    写“B”而不是“b == true”和“！B不是“b == false”。
    
8.  Replace更换
    
    ```
     if (condition) {
         return true;
     } else {
         return false;
     } 
    ```
    
    with just就
    
9.  Only static final fields of classes may be public. Other fields must be private or protected.  
    只有类的静态final字段可以是公共的。其他字段必须是私有的或受保护的。
    
10.  Classes that have only static methods and fields must not have a public (or defaulted) constructor.  
    只有静态方法和字段的类不能有公共（或默认）构造函数。
    
11.  Classes that have only private constructors must be declared “final”.  
    只有私有构造函数的类必须声明为“final”。

Avoiding Error-Prone Constructs
-------------------------------

1.  If a class overrides “equals”, it must also override “hashCode”.  
    如果一个类覆盖了“equals”，它也必须覆盖“hashCode”。
    
2.  Local variables and parameters must not shadow field names. The preferred way to handle, e.g., getter/setter methods that simply control a field is to prefix the field name with “_”, as in  
    局部变量和参数不能隐藏字段名。处理例如，简单控制字段的getter/setter方法是在字段名前面加上“_”，如
    
    ```
     public double getWidth() {
         return _width;
     }
    
     public void setWidth(double width) {
         _width = width;
     } 
    ```
    
3.  Do not use nested assignments, such as “if ((x = next()) != null) …”. Although this can be useful in C, it is almost never necessary in Java.  
    不要使用嵌套赋值，例如“if（（x = next（））！= null）..."。虽然这在C中很有用，但在Java中几乎没有必要。
    
4.  Include a “default” case in every “switch” statement.  
    在每个“switch”语句中包含一个“default”case。
    
5.  End every arm of a “switch” statement either with a “break” statement or a comment of the form  
    以“break”语句或以下形式的注释结束“switch”语句的每个分支
    
6.  Do not compare String literals with “==”. Write  
    不要将字符串文字与“==”进行比较。写
    
    ```
     if (x.equals("something")) 
    ```
    
    and not而不是
    
    There are cases where you really want to use “==”, but you are unlikely to encounter them in this class.  
    有些情况下，您确实想使用“==”，但在本类中不太可能遇到它们。
    

Limits限制
--------

1.  No file may be longer than 2000 lines.  
    任何文件都不能超过2000行。
    
2.  No line may be longer than 100 characters.  
    每行不得超过100个字符。
    
3.  No method may be longer than 80 lines.  
    任何方法都不能超过80行。
    
4.  No method may have more than 8 parameters.  
    任何方法的参数都不能超过8个。
    
5.  Every file must contain exactly one outer class (nested classes are OK).  
    每个文件必须只包含一个外部类（嵌套类是可以的）。