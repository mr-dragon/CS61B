Lab 1: javac, java, git

Before You Begin开始之前
--------------------

* If you haven’t signed up to receive a GitHub repository, follow the instructions [here](https://piazza.com/class/j9j0udrxjjp758?cid=59).
如果您尚未注册接收GitHub存储库，请按照此处的说明操作。
* The vast majority of students use their own computer instead of the lab computers. If you want to use your own computer, complete [lab1setup](../lab1setup/lab1setup.html) before beginning this lab.
绝大多数学生使用自己的计算机而不是实验室的计算机。如果您想使用自己的计算机，请在开始本实验之前完成lab 1 setup。
* Since most students work on their own computers, your instructional account is not likely to be useful to you other than checking your grades. To see how to use your instructional account, see the [instructional accounts guide](../../guides/instructional-accounts.html).
由于大多数学生在自己的计算机上工作，因此您的教学帐户除了检查您的成绩外，对您可能没有什么用处。要了解如何使用您的教学帐户，请参阅教学帐户指南。
* Be aware that there are a large number of setup steps this first week. **Don’t be discouraged**, and make sure to ask for help if you’re stuck! If you’re an on-campus student, the best place to ask for help is in the actual lab. If you’re not, Piazza is your best bet.
请注意，第一周有大量的设置步骤。不要气馁，如果你被卡住了，一定要寻求帮助！如果你是一个在校学生，寻求帮助的最好地方是在实际的实验室。如果你不是，广场是你最好的选择。
* Project 0 will allow pair-partnerships subject to [these rules](../../guides/partnerships.html). Lab might be a good place to meet a partner – but make sure you both have the same Java background and are willing to work together in the same room (see partnership rules for details)!
项目0将允许符合这些规则的配对伙伴关系。实验室可能是一个很好的地方，以满足合作伙伴-但要确保你都有相同的Java背景，并愿意在同一个房间一起工作（见合作伙伴的规则，了解详情）！
* For those of you who have been working ahead, do not use IntelliJ (from lab 2) today. For today's lab, please work from the command line to compile and run your code.
对于那些已经在前面工作的人，今天不要使用IntelliJ（来自实验2）。在今天的实验中，请从命令行编译并运行您的代码。

* Warning: This lab runs a little long, and it’s normal if you do not finish during your lab period, especially if you end up having a tricky setup issue that requires a lot of assistance.
警告：本实验运行时间有点长，如果您在实验期间没有完成，这是正常的，特别是如果您最终遇到需要大量帮助的棘手设置问题。
* It’s OK to talk to other students while you work on this lab (or any other), but you should ultimately do all the typing/programming/entering-of-commands yourself. There’s a lot of important setup information in this lab that you need to have done independently of anyone else.
当你做这个实验（或任何其他实验）时，可以和其他学生交谈，但你最终应该自己完成所有的打字/编程/输入命令。本实验中有许多重要的设置信息需要您独立完成。

#### Find A Partner寻找合作伙伴

Introduce yourself to someone you don’t know who has the same OS to collaborate with you as you complete the setup steps for today’s lab. Try to find someone who has similar programming experience - you’re encouraged to partner up for project 0!
在您完成今天实验的设置步骤时，向您不认识的、使用相同操作系统的人员进行自我介绍，以便与您协作。试着找一个有类似编程经验的人--我们鼓励你与项目0合作！

A. Java Compilation & Development
答：Java编译与开发
-----------------------------------------------

Java 9 is currently installed on the instructional machines. You may need to install it on your personal computer. You can find instructions to do this above.
Java 9目前安装在教学机器上。您可能需要将其安装在您的个人计算机上。你可以在上面找到这样做的说明。

#### Introduction to JavaJava入门

Complete exercises 1.1.1 and 1.1.2 from the [H61B textbook](https://joshhug.gitbooks.io/hug61b/content/chap1/chap11.html). Also consider reading Chapter 1.1 as a review of what you’ve already seen in lecture (either on video or in person). Note that the videos embedded in the textbook are just the lecture videos, so there’s no need to watch them again.
完成H61B教材中的练习1.1.1和1.1.2。也可以考虑阅读第1.1章，作为你在课堂上已经看到的内容的回顾（无论是视频还是亲自）。请注意，嵌入在教科书中的视频只是讲座视频，所以没有必要再看一遍。

For this lab, you should use the command line, not an IDE like IntelliJ or Eclipse (see lab 2). Don’t worry about submitting your work yet, we’ll cover how to do that later in this lab.
对于本实验，您应该使用命令行，而不是像IntelliJ或Eclipse这样的IDE（请参见实验2）。先不要担心提交您的工作，我们将在本实验的后面介绍如何提交。

B. Git & Local Repos
B.最后一句Git和本地仓库
-------------------------------------

In 61B, you’ll be required to use the git version control tool, which is wildly popular out in the real world.
在61 B中，你需要使用git版本控制工具，这在真实的世界中非常流行。
Unfortunately, the abstractions behind it are fairly tricky to understand, so it is likely that you will encounter significant frustration at some point as you learn to use git.
不幸的是，它背后的抽象是相当棘手的理解，所以很可能在学习使用git的过程中遇到重大挫折。

Before you proceed, read sections A-C of Sarah Kim’s [Using Git Guide](../../guides/using-git.html)
在继续之前，请阅读Sarah Kim的Git使用指南的A-C部分

STOP! Do not proceed until you have read sections A through C of the Using Git Guide.
停下来！在阅读完使用Git指南的A到C部分之前，请不要继续。

You do not need to read section D or later.
您不需要阅读D部分或以后的部分。

C. Git ExerciseC.最大值Git练习
-------------------------

Now that you’ve read the first 3 sections of the Using Git Guide, you’re now ready to start using git! As part of your lab checkoff, you will be working through a small git workflow by setting up a git repository and making a couple commits to the repository.
现在你已经阅读了使用Git指南的前三部分，你已经准备好开始使用git了！作为实验检查的一部分，您将通过设置一个git存储库并向存储库提交几次来完成一个小型的git工作流。
An academic intern or TA will look at the git repository during checkoff to ensure that it is in a good state. Please do the following actions. If you’re stuck on a step at any point, don’t hesitate to ask a TA or an academic intern for help!
学术实习生或TA将在检查期间查看git存储库，以确保其处于良好状态。请执行以下操作。如果你在任何时候被困在一个台阶上，不要犹豫，向助教或学术实习生寻求帮助！

If you need help with creating directories, creating files, changing directories, etc., see section B of [lab1setup](../lab1setup/lab1setup.html).
如果您在创建目录、创建文件、更改目录等方面需要帮助，参见lab 1 setup的B部分。

1. Create a directory called lab1-checkoff. You can put this directory anywhere on your computer.
创建一个名为lab 1-checkoff的目录。您可以将此目录放在计算机上的任何位置。
2. Move into the lab1-checkoff directory, and initialize a git repository in this directory.
进入lab 1-checkoff目录，并在该目录下初始化一个git仓库。
3. Create a file called `61b.txt` in any way you’d like. In this .txt file, add the text “61b version 1” into it.
创建一个名为的文件，可以 `61b.txt` 使用任何方式。在此.txt文件中，添加文本“61 b version 1”。
4. Create another file called `61c.txt` in any way you’d like. In this .txt file, add the text “61c version 1” into it.
创建另一个文件， `61c.txt` 以您喜欢的任何方式调用。在此.txt文件中，添加文本“61c版本1”。
5. Begin tracking only `61b.txt`, and create a new commit containing just this file, with the following commit message: “Add 61b.txt”.
仅开始跟踪 `61b.txt` ，并创建一个仅包含此文件的新提交，并使用以下提交消息：“添加61b.txt”。
6. Make a modification in `61b.txt` by changing the text in the file to: “61b changed to version 2”.
在中进行修改 `61b.txt` ，将文件中的文本更改为：“61b变更为版本2”。
7. Make another commit, this time containing both `61b.txt` and `61c.txt`. The commit message should be: “Update 61b.txt and add 61c.txt”.
进行另一次提交，这次同时包含 `61b.txt` 和 `61c.txt` 。提交消息应为：“更新61b.txt并添加61c.txt”。
8. Finally, make one more modification to `61b.txt` by changing the text in the file to: “61b changed to version 3”. Don’t commit this version.
最后，通过 `61b.txt` 将文件中的文本更改为：“61b变更为版本3”。不要提交此版本。

Again, if there are any questions for any of these steps, please ask in lab or on Piazza.
同样，如果对这些步骤有任何疑问，请在实验室或Piazza上询问。

At this point, if you were to type in `git status`, something close to this should show:
在这一点上，如果你要输入 `git status` ，应该会显示类似于下面的内容：

![](https://sp18.datastructur.es/materials/lab/lab1/img/exercise-status.png)

Also, if you were to run `git log`, something close to this should show:
此外，如果你要运行 `git log` ，应该会显示以下内容：

![](https://sp18.datastructur.es/materials/lab/lab1/img/exercise-log.png)

Be sure to save this repository and directory until you get checked-off by an academic intern or TA. See section E for more information on getting credit for the lab checkoff. **Along with other short conceptual questions involving git, you will be asked to revert 61b.txt back to the version in the most recent commit, as well as back to the earliest version of the file, so make sure you know how to do this!** Hint: Look into the _checkout_ command.
请确保保存此存储库和目录，直到学术实习生或TA检查。有关获得实验室检查学分的更多信息，请参见第E节。沿着其他涉及git的简短概念性问题外，我们还会要求您将61b.txt还原到最近提交的版本，以及文件的最早版本，因此请确保您知道如何做到这一点！提示：查看checkout命令。

Note: Be careful when using the _checkout_ command, as your repo might end up in an unexpected state. Specifically, if you see something about your repository being in a detached HEAD state as a result of a checkout command, that is something we don’t want. Read [here](../../guides/git-wtfs.html#head-detached-at--) for more on what it is and how to fix it.
注意：使用checkout命令时要小心，因为您的存储库可能会处于意外状态。具体来说，如果您看到由于checkout命令而导致存储库处于分离HEAD状态，这是我们不希望看到的。阅读这里了解更多关于它是什么以及如何修复它。

D. Git & Remote Repos
D. Git & Remote Repos功能
-----------------------------------------------

We’re now ready to finish off the lab. But first…
我们现在准备结束实验室。但首先...

STOP! Before you proceed, read section D of the Using Git Guide
停下来！在继续之前，请阅读使用Git指南的D部分

[Here](../../guides/using-git.html) is the link to the guide. There is no need to read sections E or later. Those are for your later reference, and do not need to be read during this lab.
这里是指南的链接。不需要阅读E节或以后的章节。这些内容供您稍后参考，在本实验中不需要阅读。

In 61B, you’ll be required to submit your code to your personal GitHub repository. This is for several reasons:
在61 B中，您需要将代码提交到您的个人GitHub存储库。这有几个原因：

* To spare you the incredible agony of losing your files.
以免你遭受丢失文件的痛苦。
* To submit your work for grading and to get results back from the autograder.
提交作业进行评分并从自动评分机获取结果。
* To save you from the tremendous anguish of making unknown changes to your files that break everything.
将您从对文件进行未知更改从而破坏一切的巨大痛苦中解救出来。
* To ensure that we have easy access to your code so that we can help if you’re stuck.
确保我们可以轻松访问您的代码，以便在您遇到困难时提供帮助。
* **To dissuade you from posting your solutions on the web in a public GitHub repository**. This is a major violation of course policy!
劝阻您在公共GitHub存储库中的Web上发布解决方案。这严重违反了课程规定！
* To expose you to a realistic workflow that is common on every major project you’ll ever work on again.
让你接触到一个现实的工作流程，这在你以后要做的每一个主要项目中都很常见。
* To enable safer, more equitable partner collaborations.
实现更安全、更公平的合作伙伴协作。

Before beginning this section ensure that the name of your GitHub repository in the [Berkeley-CS61B-Student organization](https://github.com/Berkeley-CS61B-Student) matches your instructional account login. If this is not true, please let your TA know.
在开始本节之前，请确保Berkeley-CS61 B-Student组织中的GitHub存储库名称与您的教学帐户登录名匹配。如果这不是真的，请让你的TA知道。

**Note**: You’ll need to perform this series of steps to set up your Git repo on each computer you use (e.g. instructional computer, personal computer).
注意：您需要执行这一系列步骤来在您使用的每台计算机上设置Git存储库（例如：教学计算机、个人计算机）。
If you know that you’ll only be using your personal computer, feel free to do this only on your personal computer (and not your lab account).
如果您知道您将只使用您的个人计算机，请仅在您的个人计算机上（而不是您的实验室帐户）执行此操作。

1. Clone your [Berkeley-CS61B-Student organization](https://github.com/Berkeley-CS61B-Student) repository.
克隆您的Berkeley-CS61 B-Student组织存储库。

* Navigate to the spot in your folders on your computer that you’d like to start your repository. In the example below, I’m assuming you want all your stuff in a folder named cs61b, but you can pick a different name if you’d like.
导航到计算机上文件夹中要启动存储库的位置。在下面的例子中，我假设你想把所有的东西都放在一个名为cs61b的文件夹中，但是如果你愿意，你可以选择一个不同的名字。

```
 cd cs61b 
```

* Enter the following command to clone your GitHub repo. Make sure to replace the `**` with your own instructional account login/repo name.
输入以下命令克隆您的GitHub存储库。请确保将替换 `**` 为您自己的教学帐户登录/存储库名称。

```
 git clone https://github.com/Berkeley-CS61B-Student/sp18-**.git 
```

If you’d like to SSH instead of HTTPS (and [set up your own SSH key](https://help.github.com/articles/generating-ssh-keys/)), feel free to also do that instead. If you don’t know what any of this means, just use the command above. The advantage of SSH is that you won’t have to type in your GitHub password every time you use your repository.
如果您想使用SSH而不是HTTPS（并设置您自己的SSH密钥），请随意也这样做。如果你不知道这是什么意思，就使用上面的命令。SSH的优点是你不必每次使用仓库时都输入GitHub密码。

* Move into your newly created repo! (Make sure you do this part, or the rest of the steps below will not work correctly.)
移动到您的新创建的存储库！(Make请确保您完成了这一部分，否则下面的其余步骤将无法正常工作。）

```
 cd sp18-** 
```

2. Add the `skeleton` remote repository. You will pull from this remote repository to get starter code for assignments. (Make sure that you are within the newly created repository folder when the continue with these commands.)
添加 `skeleton` 远程存储库。您将从这个远程存储库中获取任务的启动代码。(Make请确保在继续执行这些命令时，您位于新创建的存储库文件夹中。）

* Enter the following command to add the `skeleton` remote.
输入以下命令以添加 `skeleton` 遥控器。

```
 git remote add skeleton https://github.com/Berkeley-CS61B/skeleton-sp18.git 
```

* Listing the remotes should now show both the `origin` and `skeleton` remotes.
列出远程设备现在应该同时显示 `origin` 和 `skeleton` 远程设备。

```
 git remote -v 
```

* If you get an error that says “Not a git repository”, make sure you’re in the `sp18-**` directory.
如果你得到一个错误提示“Not a git repository”，请确保你在目录中 `sp18-**` 。

#### Working on the Skeleton

处理骨架

1. You must now pull from the `skeleton` remote in order to get the starter code for lab 1. You will also do this when new projects and assignments are released. To do this, use the spookiest command in the whole git toolbox:
您现在必须从遥控器中拉出 `skeleton` ，以获取实验1的启动代码。当发布新项目和任务时，您也将执行此操作。为此，请使用整个git工具箱中的spookiest命令：

```
 git pull skeleton master 
```

What this does is grab all remote files from the repo named `skeleton` (which is located at `https://github.com/Berkeley-CS61B/skeleton-sp18.git`) and copies them into your current folder.
这是从名为（位于）的存储库中获取所有远程文件 `skeleton` `https://github.com/Berkeley-CS61B/skeleton-sp18.git` ，并将其复制到当前文件夹中。

If you get an error similar to “fatal: refusing to merge unrelated histories”, you probably ran GitHub’s suggested commands when you created your repository. To fix this, you can instead run:
如果出现类似于“fatal：拒绝合并不相关的历史”，您可能在创建存储库时运行了GitHub建议的命令。要解决此问题，您可以改为运行：

```
 git pull --rebase --allow-unrelated-histories skeleton master 
```

this time only.仅此一次

2. If you list the files in your current directory, you’ll see that there are now two folders: `lab1` and `library-sp18`. Look in the `library-sp18` folder, and you’ll see that it is currently empty and will receive some sweet stuff in the lab2 setup. Don’t delete it. Look in the `lab1` folder and you’ll see files called `LeapYear.java` and `magic_word.txt` that you’ll work with in later parts of this lab.
如果列出当前目录中的文件，您将看到现在有两个文件夹： `lab1` 和 `library-sp18` 。查看该 `library-sp18` 文件夹，您将看到它当前是空的，并将在lab2设置中接收一些甜蜜的东西。不要删除它。查看该 `lab1` 文件夹，您将看到名为的文件 `LeapYear.java` ， `magic_word.txt` 您将在本实验的后面部分使用这些文件。

3. Move the `HelloWorld.java` and `HelloNumbers.java` that you previously created into the `lab1` directory. If you didn’t create `HelloNumbers.java`, go back and do Exercise 1.1.2 (see part A of this lab).
将先前创建的和 `HelloWorld.java` `HelloNumbers.java` 移动到目录中 `lab1` 。如果您没有创建 `HelloNumbers.java` ，请返回并执行练习1.1.2（参见本实验的A部分）。

4. Stage and commit `HelloWorld.java` and `HelloNumbers.java`.
阶段和提交 `HelloWorld.java` 和 `HelloNumbers.java` 。

```
 git add lab1/*
 git commit -m "completed first part of lab1" 
```

5. Push these changes to the `master` branch on the `origin` remote repo.
将这些更改推送到 `master` `origin` 远程存储库上的分支。

```
 git push origin master 
```

You can verify that this has been successful by checking your repo on [github.com](https://github.com). For example, if your repo were `sp18-alf`, you’d go to [https://github.com/Berkeley-CS61B-Student/sp18-alf](https://github.com/Berkeley-CS61B-Student/sp18-alf).
您可以通过在github.com上检查您的repo来验证这是否成功。例如，如果您的repo是 `sp18-alf` ，您可以访问<https://github.com/Berkeley-CS61B-Student/sp18-alf。>

E. Git CheckoffE. Git Checkoff
------------------------------

Once you’ve verified that your code was pushed to github, put your name down on the lab whiteboard to get your git exercise (from part C) checked off.
一旦你验证了你的代码被推到了github上，把你的名字写在实验室白板上，让你的git练习（从C部分开始）打勾。
The TA or lab assistant, upon completion of the lab checkoff, will tell you what to put into the magic word file in order to pass the autograder. If there’s a wait, feel free to move on to part F until your name is called.
助教或实验助理在完成实验检查后，会告诉你为了通过自动评分器，应该把什么内容放进魔术词文件中。如果要等的话，请继续进行F部分，直到叫到你的名字。

F. Leap YearF的。闰年
-----------------

In the lab1 folder, you should see a file called `LeapYear.java`. This program is supposed to test whether or not a given year is a Leap Year. The user will give a year as a command line parameter (examples given below), and then print out whether or not that year is a leap year, e.g.
在lab1文件夹中，您应该看到一个名为的文件 `LeapYear.java` 。这个程序应该测试给定的一年是否是闰年。用户将给予一个年份作为命令行参数（下面给出的示例），然后打印出该年份是否是闰年，例如。

```
$ java LeapYear 2000
2000 is a leap year.
$ java LeapYear 1999
1999 is not a leap year.
$ java LeapYear 2004
2004 is a leap year.
$ java LeapYear 2100
2100 is not a leap year. 
```

A leap year is either:
闰年是：

* divisible by 400 or
可被400整除或
* divisible by 4 and not by 100.
能被4整除而不能被100整除。

For example, 2000 and 2004 are leap years. 1900, 2003, and 2100 are not leap years.
例如，2000年和2004年是闰年。1900年、2003年和2100年都不是闰年。

Your code must declare a method as follows: `public static boolean isLeapYear(int year)`. This method will be tested by the Gradescope autograder. Make sure to provide a description of the method as a comment. Your description should be contained by `/**` and `*/`. Comments contained by `/**` and `*/` are also called “Javadoc comments” or just “Javadocs”. These comments can span multiple lines if need the extra space, e.g. the `checkLeapYear` Javadocs.
你的代码必须声明一个方法如下： `public static boolean isLeapYear(int year)` .该方法将通过Gradescope自动平地机进行测试。请确保以注释的形式提供方法的描述。您的描述应包含在 `/**` 和中 `*/` 。和包含的注释 `/**` `*/` 也称为“Javadoc注释”或“Javadocs”。如果需要额外的空间，这些注释可以跨多行，例如： `checkLeapYear` Javadoc

Javdocs may contain optional tags, e.g. `@param`. We do not require you to use any tags like this in 61B except the `@source` tag. Use the `@source` tag any time you receive significant help on a project. The `@source` tag is not required for HW or lab, though we recommend it anyway, since it’s a good scholarly and professional habit to cite your sources.
Javdocs可以包含可选的标签，例如 `@param` .我们不要求您在61B中使用除标签之外的任何标签 `@source` 。每当 `@source` 您在项目上收到重要帮助时，请使用该标记。硬件 `@source` 或实验室不需要这个标签，尽管我们还是推荐它，因为引用你的来源是一个很好的学术和专业习惯。

Some Java tips:一些Java技巧：

* The `%` operator implements remainder. Thus, the value of `year % 4` will be `0`, `1`, `2`, or `3`.
运算 `%` 符实现余数。因此，的值 `year % 4` 将为 `0` 、 `1` 、 `2` 或 `3` 。
* The `!=` operator compares two values for inequality. The code fragment `if (year % 4 != 0)` reads as “if the remainder when dividing year by 4 is not equal to 0.”
运算 `!=` 符比较两个值是否不等。代码片段 `if (year % 4 != 0)` 读作“如果year除以4的余数不等于0”
* When one of the arguments of the `+` operator is a String, the arguments are concatenated as Strings. For example, `"horse"` \+ `"babies"` would return `"horsebabies"`
当运算符的其中一个参数 `+` 是String时，这些参数将连接为String。例如， `"horse"` \+ `"babies"` 将返回 `"horsebabies"`

G. Submitting Lab 1
G的。提交实验1
------------------------------

The last step is to submit your work with Gradescope. Gradescope is the site that you’ll use to submit homework, lab, and project assignments. To sign up for Gradescope, head to [gradescope.com](http://gradescope.com) and click on the “Sign up for free” link at the top right. Use the entry code posted in this [Piazza thread](https://piazza.com/class/j9j0udrxjjp758?cid=51). If you’re already registered somehow (e.g. a TA added you), there’s no need to enter the code again.
最后一步是使用Gradescope提交您的作品。Gradescope是一个你可以用来提交家庭作业、实验和项目作业的网站。要注册Gradescope，请访问gradescope.com，然后单击右上角的“免费注册”链接。请使用此Piazza帖子中发布的进入代码。如果您已经以某种方式注册（例如一个TA加了你），就不用再输入密码了。

To submit your code, do NOT use the Drag and Drop feature. Instead, click the little GitHub button in the bottom right (shown below).
要提交代码，请不要使用拖放功能。相反，单击右下角的小GitHub按钮（如下所示）。

![](https://sp18.datastructur.es/materials/lab/lab1/img/github_button.png)

After clicking this button, you’ll be taken to a screen where you select your repository and branch (shown below).
单击此按钮后，您将进入一个屏幕，在该屏幕中选择您的存储库和分支（如下所示）。
If your login is “sp18-ape”, you’ll select “sp18-ape” in the top box, and in the bottom box you’ll pick “master”. Later, you can create your own “branches” (as described in the advanced part of the Git Guide) if you want those graded instead, though that won’t be required in 61B.
如果你的登录名是“sp18-ape”，你将在顶部的框中选择“sp18-ape”，在底部的框中选择“master”。稍后，如果你想让这些分支被评分，你可以创建自己的“分支”（如Git指南的高级部分所述），尽管在61 B中不需要。

![](https://sp18.datastructur.es/materials/lab/lab1/img/github_repo_and_branch_selection.png)

Please report any issues you may have to Piazza. Entire error messages and/or screenshots are welcome.
请向Piazza报告任何问题。欢迎使用完整的错误消息和/或屏幕截图。

**Important:** We HIGHLY encourage you to make frequent commits! **Lack of proper version control will not be considered an excuse for lost work, particularly after the first few weeks.
重要提示：\*\* 我们强烈建议您频繁提交！\*\* 缺乏适当的版本控制不会被视为丢失工作的借口，特别是在最初的几周之后。**

Recap回顾
-------

1. Java is a compiled language. You can use `javac` and `java` to compile and run your code.
Java是一种编译语言。可以使用 `javac` 和 `java` 来编译和运行代码。

2. Java is an object-oriented language. Every Java file must contain either a class, interface, or enum.
Java是一种面向对象的语言。每个Java文件必须包含类、接口或枚举。

3. When running a Java program, the `main` method runs. This `main` method can call other methods/classes in the program.
当运行Java程序时，该 `main` 方法将运行。此 `main` 方法可以调用程序中的其他方法/类。

4. Git is a version control system that tracks the history of a set of files in the form of commits.
Git是一个版本控制系统，以提交的形式跟踪一组文件的历史。

5. Commit often and use informative commit messages.
经常提交并使用信息性的提交消息。

6. Pull from the `skeleton` remote repository to get or update starter code for assignments.
从 `skeleton` 远程存储库中获取或更新工作分配的启动代码。

7. Use Gradescope to submit homework, labs, and projects.
使用Gradescope提交作业、实验和项目。
