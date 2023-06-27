# Lab 1: IntelliJ, Java, git

## Before You Begin开始之前


* Before beginning this lab, complete [lab1setup](../lab1setup/lab1setup) to install software required for 61B. If you get stuck at any point, feel free to post on Ed or attend lab, or come to Office Hours.
在开始本实验之前，请完成lab 1 setup以安装61 B所需的软件。如果你在任何时候卡住了，请随时在艾德上发帖或参加实验室，或者来办公时间。
* Be aware that there are a large number of setup steps this first week. **Don’t be discouraged**, and make sure to ask for help if you’re stuck!
请注意，第一周有大量的设置步骤。不要气馁，如果你被卡住了，一定要寻求帮助！

* Warning: This lab runs a little long, and it’s normal if you do not finish during your lab period, especially if you end up having a tricky setup issue that requires a lot of assistance.
警告：本实验运行时间有点长，如果您在实验期间没有完成，这是正常的，特别是如果您最终遇到需要大量帮助的棘手设置问题。
* It’s OK to talk to other students while you work on this lab (or any other), but you should ultimately do all the typing/programming/entering-of-commands yourself. There’s a lot of important setup information in this lab that you need to have done independently of anyone else.
当你做这个实验（或任何其他实验）时，可以和其他学生交谈，但你最终应该自己完成所有的打字/编程/输入命令。本实验中有许多重要的设置信息需要您独立完成。

## GitHub and BeaconGitHub和Beacon


Instead of bCourses, CS61B uses an in-house system for centralizing your grades and student information called Beacon.[🔄  ❓](javascript:void(0))

In this section, we’ll set up your Beacon account as well as your CS 61B GitHub repository (“repo”), which you will need to submit all coding assignments.[🔄  ❓](javascript:void(0))

1. Create an account at [GitHub.com](https://github.com/). If you already have an account, you do not need to create a new one.[🔄  ❓](javascript:void(0))
2. Go to [the Beacon website](https://sp21.beacon.datastructur.es/register/) and you’ll be guided through a few steps to complete your GitHub repository registration. Please follow them carefully! You must be logged in to your Berkeley account to complete the Google Form quiz. [🔄  ❓](javascript:void(0))
If any errors occur while you’re working through the steps, please let your TA know immediately.[🔄  ❓](javascript:void(0))
1. After completing all of the steps, you should receive an email inviting you to collaborate on your course GitHub repository, accept the email invitation from **both** emails and you should be good to go. This email will be sent to the **email that you used to create your GitHub account, which may not necessarily be your Berkeley email**. Hooray! **Don’t follow the instructions that GitHub says you might want to do** – instead, follow the instructions given later in this lab.
完成所有步骤后，您应该会收到一封电子邮件，邀请您在课程GitHub存储库上进行协作，接受来自两封电子邮件的电子邮件邀请，您应该可以开始了。此电子邮件将发送到您用于创建GitHub帐户的电子邮件，该电子邮件不一定是您的Berkeley电子邮件。万岁！不要按照GitHub上的说明操作，而是按照本实验后面给出的说明操作。

### More details about your repository

有关存储库的更多详细信息

Your repository will have a name containing a number that is unique to you!
您的存储库将有一个名称，其中包含一个对您唯一的编号！
For instance, if your repo is called “sp21-s42”, you’ll be able to visit your private repository at <https://github.com/Berkeley-CS61B-Student/sp21-s42> (when logged into GitHub) If your repo number is not “42” this link will not work for you.
例如，如果你的仓库名为“sp21-s42”，你将能够访问你的私有仓库<https://github.com/Berkeley-CS61B-Student/sp21-s42（当登录到GitHub时）如果你的仓库号不是“42”，这个链接将不适用于你。>
Replace “42” with your own to see your repo on Github.
将“42”替换为您自己的代码，在Github上查看您的代码库。

Additionally, the instructors, TAs, and tutors will be able to view your repository. This means you can (and should!) link to your code when asking private debugging questions on Ed. No other students will be able to view your repository.
此外，教师、助教和辅导员将能够查看您的存储库。这意味着你可以（而且应该）！）当在Ed上询问私有调试问题时，链接到您的代码。其他学生将无法查看您的存储库。
As a reminder, you may not post code from this course publicly, even after completing the course. Doing so is a violation of our course policies and you might be subject to disciplinary action.
作为提醒，您不得公开发布本课程的代码，即使在完成课程后也是如此。这样做违反了我们的课程政策，您可能会受到纪律处分。

If you’re working with a lab partner, you’ll also receive a separate shared repository that you should use for labs. More details are provided on our Parterships Guide, which you can find on our Course Info page.
如果您与实验合作伙伴一起工作，您还将收到一个单独的共享存储库，您应该将其用于实验。更多详情请参阅我们的合作伙伴指南，您可以在我们的课程信息页面上找到。

Additionally, after registering with Beacon, you will be invited to collaborate on another repo of the form “snaps-sp21-sXXX” - don’t worry about what this repo is for now, just accept the invitation so you have access to it.
此外，在Beacon注册后，您将被邀请在另一个形式为“snaps-sp21-sXXX”的存储库上进行协作-现在不要担心这个存储库是什么，只需接受邀请，这样您就可以访问它。
We will have more information about this repo in a later section of this lab!
我们将在本实验的后面部分了解有关此存储库的更多信息！

A. Getting the Starter Files
答：获取Starter文件
--------------------------------------------

For most of the assignments in this class (including this lab), we’ll provide a set of starter files.
对于本课程的大部分作业（包括本实验），我们将提供一组入门文件。

To get the starter files, we’ll be using the git version control system, which you’ll learn more about later in this lab and throughout the course. For now, let’s simply use git to get the files for this lab.
为了获取启动文件，我们将使用git版本控制系统，您将在本实验的后面部分和整个课程中了解更多信息。现在，让我们简单地使用git来获取本实验的文件。

If you need help with creating directories, creating files, changing directories, etc., see section C of [lab1setup](../lab1setup/lab1setup.html).
如果您在创建目录、创建文件、更改目录等方面需要帮助，参见lab 1 setup的C部分。

1. First, tell Git your name and email address so that your commits are correctly attributed to you. Run the following commands:
首先，告诉Git你的名字和电子邮件地址，这样你的提交就会被正确地归属到你的名下。运行以下命令：

Replace “Your Name” with your name, and “<you@berkeley.edu>” with your email address. You should use the email address that you used to sign up for GitHub. If that’s not your “@berkeley.edu” email address, that’s okay.
用您的姓名替换“您的姓名”，<you@berkeley.edu>用您的电子邮件地址替换“www.example.com”。你应该使用你用来注册GitHub的电子邮件地址。如果这不是您的“@ berkeley.edu”电子邮件地址，也没关系。

```
 git config --global user.email "you@berkeley.edu"
 git config --global user.name "Your Name" 
```

2. Clone your [Berkeley-CS61B-Student organization](https://github.com/Berkeley-CS61B-Student) repository.
克隆您的Berkeley-CS61 B-Student组织存储库。

* Navigate to the spot in your folders on your computer where you’d like to start your repository. In the example below, I’m assuming you want all your stuff in a folder named cs61b, but you can pick a different name if you’d like.
导航到计算机上文件夹中要启动存储库的位置。在下面的例子中，我假设你想把所有的东西都放在一个名为cs61 b的文件夹中，但是如果你愿意，你可以选择一个不同的名字。

```
 cd cs61b 
```

* Enter the following command to clone your GitHub repo. Make sure to replace the `s**` with the class id you were given when you registered for your repo.
输入以下命令克隆您的GitHub存储库。请确保将替换 `s**` 为注册存储库时提供的类ID。

```
 git clone https://github.com/Berkeley-CS61B-Student/sp21-s**.git 
```

If you’d like to use SSH instead of HTTPS (and [set up your own SSH key](https://help.github.com/articles/generating-ssh-keys/)), feel free to also do that instead. If you don’t know what any of this means, just use the command above. The advantage of SSH is that you won’t have to type in your GitHub password every time you use your repository.
如果您想使用SSH而不是HTTPS（并设置您自己的SSH密钥），请随意也这样做。如果你不知道这是什么意思，就使用上面的命令。SSH的优点是你不必每次使用仓库时都输入GitHub密码。

* Move into your newly created repo! (Make sure you do this part, or the rest of the steps below will not work correctly.)
移动到您的新创建的存储库！(Make请确保您完成了这一部分，否则下面的其余步骤将无法正常工作。）

```
 cd sp21-s** 
```

3. Add the `skeleton` remote repository. You will “pull” code from this remote repository to get starter code for assignments. Make sure that you are within the newly created repository folder before you continue with these commands.
添加 `skeleton` 远程存储库。您将从这个远程存储库中“拉”出代码，以获得分配的启动代码。在继续执行这些命令之前，请确保您位于新创建的存储库文件夹中。
* Enter the following command to add the `skeleton` remote.
输入以下命令以添加 `skeleton` 遥控器。

```
 git remote add skeleton https://github.com/Berkeley-CS61B/skeleton-sp21.git 
```

* Listing the remotes should now show both the `origin` and `skeleton` remotes.
列出远程设备现在应该同时显示 `origin` 和 `skeleton` 远程设备。

```
 git remote -v 
```

* If you get an error that says “Not a git repository”, make sure you’re in the `sp21-s**` directory.
如果你得到一个错误提示“Not a git repository”，请确保你在目录中 `sp21-s**` 。
4. You must now “pull” from the `skeleton` remote in order to get the starter code for Lab 1. You will also do this when new projects and assignments are released. To do this, use the spookiest command in the whole git toolbox:
现在，您必须从远程“拉取” `skeleton` 以获取实验1的启动代码。当发布新项目和任务时，您也将执行此操作。为此，请使用整个git工具箱中的spookiest命令：

```
 git pull skeleton master 
```

What this does is grab all remote files from the repo named `skeleton` (which is located at `https://github.com/Berkeley-CS61B/skeleton-sp21.git`) and copies them into your current folder.
这是从名为（位于）的存储库中获取所有远程文件 `skeleton` `https://github.com/Berkeley-CS61B/skeleton-sp21.git` ，并将其复制到当前文件夹中。

If you get an error similar to “fatal: refusing to merge unrelated histories”, you probably ran GitHub’s suggested commands when you created your repository. To fix this, you can instead run:
如果出现类似于“fatal：拒绝合并不相关的历史”，您可能在创建存储库时运行了GitHub建议的命令。要解决此问题，您可以改为运行：

```
 git pull --rebase --allow-unrelated-histories skeleton master 
```

this time only.仅此一次

5. If you list the files in your current directory, you’ll see that there is now a folder named `lab1` Look in the `lab1` folder and you’ll see files called `HelloWorld.java`, `HelloNumbers.java`, `Collatz.java`, and others, that you’ll work with in later parts of this lab.
如果列出当前目录中的文件，您将看到该文件夹中现在有一个名为Look的文件夹 `lab1` `lab1` ，并且您将看到名为、 `HelloWorld.java` `HelloNumbers.java` 、 `Collatz.java` 和其他的文件，您将在本实验的后面部分使用这些文件。

B. Running Code in IntelliJ
B.最后一句在IntelliJ中运行代码
--------------------------------------------------

IntelliJ is an IDE (Integrated Development Environment). It includes a text editor as well as a whole lot of extra features to make writing code easier. Let’s try it out first on our lab1 folder.
IntelliJ是一个IDE（集成开发环境）。它包括一个文本编辑器以及大量额外的功能，使编写代码更容易。让我们先在lab1文件夹上尝试一下。

1. Upon opening IntelliJ, click on the “Open” option.打开IntelliJ后，单击“打开”选项。 ![](https://sp21.datastructur.es/materials/lab/lab1/img/intellij_start_menu.png)

2. Find and choose your lab1 directory, then press the OK button. Once you’ve pressed finish, you should see something really similar to the following image. You may need to click the little triangle next to `lab1` in the top left to get the source files (`HelloWorld`, `HelloNumbers`, `Collatz`, `GetEnvironmentVariables`, and `CheckLabConfig`) to show up. If you don’t see the sidebar, go to **View → Tool Windows → Project**, or select **“Project”** on the left toolbar.找到并选择lab1目录，然后按OK按钮。一旦你按下完成，你应该看到一些非常类似于下面的图像。您可能需要单击左上角的旁边的小三角形 `lab1` ，以显示源文件（ `HelloWorld` 、 `HelloNumbers` 、 `Collatz` 、 `GetEnvironmentVariables` 和 `CheckLabConfig` ）。如果您没有看到侧边栏，请转到“视图”→“工具窗口”→“项目”，或选择左侧工具栏上的“项目”。 ![](https://sp21.datastructur.es/materials/lab/lab1/img/main_screen_when_done_lab1.png)

Note: The first time you start up IntelliJ it might take some time indexing files. This may take a few minutes. There should be a little progress bar in the bottom right. Some steps might not work until this is done.
注意：第一次启动IntelliJ时，可能需要一些时间来索引文件。这可能需要几分钟。在右下角应该有一个小进度条。某些步骤可能无法工作，直到完成此操作。

1. Double click on HelloNumbers and you’ll see your HelloNumbers code appear. Your color scheme won’t look like what is shown in the picture below (which is the official Josh Hug approved color scheme, called Sunburst).
双击HelloNumbers，您将看到您的HelloNumbers代码出现。你的配色方案看起来不会像下图所示（这是官方Josh Hug批准的配色方案，称为朝阳）。
If you think you’d like to use Sunburst instead, see the very end of this lab for an optional setup. There should be no errors (code highlighted in red). If you see any errors, please post to Ed or ask your lab TA.如果您想使用朝阳，请参阅本实验的最后部分，了解可选设置。应该没有错误（代码以红色突出显示）。如果您看到任何错误，请发布到艾德或询问您的实验室助教。 ![](https://sp21.datastructur.es/materials/lab/lab1/img/main_screen_when_done_lab1_HelloNumbers_open.png)

2. Next, let’s run your HelloNumbers. To do this, click “Run”, then click the “Run…” option.
接下来，让我们运行您的HelloNumbers。要执行此操作，请单击“运行”，然后单击“运行...”选项。![](https://sp21.datastructur.es/materials/lab/lab1/img/main_screen_when_done_lab1_HelloNumbers_run_run.png)

3. This will bring up two choices, one called “Edit Configuration”, and one called “HelloNumbers”. You may see other options for files we will interact with later this lab.
这将显示两个选项，一个称为“编辑配置”，另一个称为“HelloNumbers”。您可能会看到本实验稍后将与之交互的文件的其他选项。
IntelliJ supports all sorts of complicated configuration options for running Java programs, but we’re happy with the default here, so let’s just click on the one that says “HelloNumbers”.
IntelliJ支持运行Java程序的各种复杂的配置选项，但我们对这里的默认值很满意，所以让我们点击一个写着“HelloNumbers”的选项。![](https://sp21.datastructur.es/materials/lab/lab1/img/main_screen_when_done_lab1_HelloNumbers_run_run_after_click.png)

Look at the output the program generated! You should see some nice numbers printed out! Hello Numbers!
看看程序生成的输出!你应该看到一些漂亮的数字打印出来!你好号码!

C. Setting up Snaps[🔄  ❓](javascript:void(0))
----------------------------------------------

You have two course repositories, one standard repository (e.g. sp21-s33) and one Snaps repository (snaps-sp21-s33). Commits to your standard repository are made manually. Commits to the snaps repository are made automatically.
您有两个课程存储库，一个标准存储库（例如sp21-s33）和一个快照存储库（snaps-sp21-s33）。对标准存储库的提交是手动进行的。将自动提交到快照存储库。

The Snaps repository will act as a safe backup of your work in case you forget to actually make manual commits with git.
Snaps仓库将作为你工作的安全备份，以防你忘记使用git进行手动提交。
You’ll push your Snaps repository after every project, which will allow us to release stats like the average time it took for students to complete each project (or each part of each project).
您将在每个项目之后推送您的Snaps存储库，这将允许我们发布统计数据，例如学生完成每个项目（或每个项目的每个部分）所花费的平均时间。
It will also allow us to identify parts of projects that are much more confusing or time consuming that we anticipated. And it will also allow us to understand if the workload we’ve assigned is too high, so that we can tune down the course difficulty if we’ve overburdened you.
它还将使我们能够确定项目中比我们预期的更令人困惑或更耗时的部分。它还能让我们了解我们分配的工作量是否太大，这样我们就可以在给你们造成负担的时候降低课程难度。
If you are strongly opposed to pushing your Snaps repository, please contact your mentor GSI at that time. There will be more information about mentor GSIs during the second week of class
如果您强烈反对推送您的Snaps存储库，请在那时联系您的导师GSI。在第二周的课程中会有更多关于导师GSI的信息

We don’t want you to feel like we’re looking over your shoulder! Thus, we will not be manually analyzing Snaps repositories, nor will we use any of the Snaps repository information for plagiarism detection.
我们不想让你觉得我们在监视你！因此，我们不会手动分析Snaps存储库，也不会使用任何Snaps存储库信息进行剽窃检测。
That is, all analysis will be conducted via bulk analytical tools that are unaware of your identity, and nothing in your Snaps repository will be used against you in any way.
也就是说，所有分析都将通过批量分析工具进行，这些工具不知道您的身份，并且您的快照存储库中的任何内容都不会以任何方式针对您。

At the very end of the semester, you will also have the opportunity to opt-in to a research project. Details will be provided at that time.
在学期结束时，您还将有机会选择参加一个研究项目。届时将提供详情。

In this section of lab you will set up your computer to allow the creation of the Snaps backups.
在实验的此部分中，您将设置计算机以允许创建快照备份。

### Getting the Snaps Repo

获取快照存储库

You should have gotten and accepted an invitation to collaborate on a `snaps-sp21-s***` repo. If you have not accepted it, please do not proceed until you do.
你应该已经收到并接受了一个邀请，在回购上进行合作 `snaps-sp21-s***` 。如果您尚未接受，请在接受之前不要继续。
If you can’t find the invitation in your email inbox (remember, the email account attached to your GitHub account, which may not necessarily be your Berkeley email), please post on Ed or come to lab or Office Hours, so we can help you.
如果您在电子邮件收件箱中找不到邀请函（请记住，电子邮件帐户附加到您的GitHub帐户，这可能不一定是您的Berkeley电子邮件），请在Ed上发布或来到实验室或办公时间，以便我们可以帮助您。

First, we will clone the snaps repo to your computer. In your terminal (Git Bash on Windows), navigate to your home directory: `cd ~`. Then, run the following command, replacing *** with your repo number:
首先，我们将快照存储库克隆到您的计算机。在终端（Windows上的Git Bash）中，导航到主目录： `cd ~` .然后，运行以下命令，将 \*\*\* 替换为您的repo编号：

```
git clone https://github.com/Berkeley-CS61B-Student/snaps-sp21-s*** 
```

If you run `ls`, you should now see the `snaps-sp21-s***` folder.
如果您运行 `ls` ，现在应该会看到该 `snaps-sp21-s***` 文件夹。

**IMPORTANT:** Never complete assignments in this folder. Gradescope tests will always fail if you submit code from the snaps folder. You should only interact with your sp21-s***folder.
重要提示：切勿在此文件夹中完成作业。如果从snaps文件夹提交代码，则Gradescope测试将始终失败。您应该只与sp21-s*** 文件夹交互。

### Setting Up Environment Variables

设置环境变量

Next you’ll need to set up some environment variables. The precise steps to take depend on your operating system.
接下来，您需要设置一些环境变量。具体步骤取决于您的操作系统。

* [Windows instructions](lab1SnapsSetupWindows.html)
* [macOS and Linux instructions
macOS和Linux说明](lab1SnapsSetupMacAndLinux.html)

#### Installing the Snaps Plugin

安装Snaps插件

##### Mac OS and Linux

Mac OS和Linux

1. After setting up the environment variables above, restart IntelliJ, and all terminal windows (close them and open a new one), so the variables can take effect.
设置好上述环境变量后，重新启动IntelliJ和所有终端窗口（关闭它们并打开一个新窗口），以便变量生效。
2. Go to the IntelliJ welcome window (you may have to click “File → Close Project” to get back to the welcome window)
转到IntelliJ欢迎窗口（您可能需要单击“文件→关闭项目”以返回欢迎窗口）
3. Choose “Plugins” (left panel) → “Marketplace” (top middle) → search “CS 61B Snaps”, and install.
选择“插件”（左侧面板）→“市场”（中上部）→搜索“CS 61B Snaps”，然后安装。
4. IntelliJ may ask you to restart the IDE (a green “Restart IDEA” button will appear). If it does, restart it.
IntelliJ可能会要求您重新启动IDE（将出现绿色的“重新启动IDEA”按钮）。如果是，重新启动它。
5. Do not ignore the next step.
不要忽视下一步。
6. **Quit intelliJ** (regardless of whether it restarted or not in step 4). Yes, even though you may have just restarted it, quit it completely again.
退出intelliJ（不管它是否在步骤4中重新启动）。是的，即使你可能刚刚重新启动它，再次完全退出它。
7. Open a terminal window, and launch intelliJ by running `idea`. Do not run IntelliJ using the OS Gui (e.g. Finder in Mac OS).
打开一个终端窗口，运行 `idea` 。不要使用OS GUI运行IntelliJ（例如Mac OS中的Finder）。
8. Continue to the next section to test your environment variables.
继续下一节测试环境变量。

##### Windows视窗

1. After setting up the environment variables above, restart IntelliJ, and all terminal windows (close them and open a new one), so the variables can take effect.
设置好上述环境变量后，重新启动IntelliJ和所有终端窗口（关闭它们并打开一个新窗口），以便变量生效。
2. Go to the IntelliJ welcome window (you may have to click “File → Close Project” to get back to the welcome window)
转到IntelliJ欢迎窗口（您可能需要单击“文件→关闭项目”以返回欢迎窗口）
3. Choose “Plugins” (left panel) → “Marketplace” (top middle) → search “CS 61B Snaps”, and install.
选择“插件”（左侧面板）→“市场”（中上部）→搜索“CS 61B Snaps”，然后安装。
4. IntelliJ may ask you to restart the IDE (a green “Restart IDEA” button will appear). If it does, restart it.
IntelliJ可能会要求您重新启动IDE（将出现绿色的“重新启动IDEA”按钮）。如果是，重新启动它。
5. Do not ignore the next step.
不要忽视下一步。
6. **Restart IntelliJ again**. Yes, even though you may have just restarted it, quit it completely and open it again.
重新启动IntelliJ。是的，即使你可能刚刚重新启动它，完全退出它，然后再次打开它。

#### Test Your Environment Variables

测试环境变量

After reopening IntelliJ, make sure the lab1 folder is open in IntelliJ. Verify that you set the environment variables correctly by opening `CheckLabConfig`. Then click Run and go down to the option that says “Run…”.
重新打开IntelliJ后，确保在IntelliJ中打开了lab1文件夹。打开以验证是否正确设置了环境变量 `CheckLabConfig` 。然后单击“Run（运行）”，然后转到“Run...（运行...）”选项。

![](https://sp21.datastructur.es/materials/lab/lab1/img4/windows_about_to_run_checklabconfig.png)

Now click on the option that contains `CheckLabConfig`:
现在单击包含以下内容的选项 `CheckLabConfig` ：

![](https://sp21.datastructur.es/materials/lab/lab1/img4/windows_check_lab_config_option.png)

This should run the main method of our `CheckLabConfig` class. If everything is working, you should see a message confirming that you are done with lab 1 set up!
这应该运行我们类的main方法。 `CheckLabConfig` class.如果一切正常，您应该会看到一条消息，确认您已完成实验1的设置!

D. Programming ExerciseD.最大值编程练习
--------------------------------

Open the file called `Collatz.java`. Try running it and you’ll see the number 5 get printed.
打开名为的文件。 `Collatz.java` .试着运行它，你会看到数字5被打印出来。

This program is supposed to print the [Collatz sequence](https://en.wikipedia.org/wiki/Collatz_conjecture) starting from a given number. The Collatz sequence is defined as follows:
这个程序应该打印从给定数字开始的Collatz序列。Collatz序列定义如下：

If n is even, the next number is n/2. If n is odd, the next number is 3n + 1. If n is 1, the sequence is over.
如果n是偶数，下一个数是n/2。如果n是奇数，则下一个数是3 n + 1。如果n是1，则序列结束。

For example, suppose we start with 5. Since 5 is odd, the next number is 3x5 + 1 = 16. Since 16 is even, the next number is 8. Since 8 is even, the next number is 4. Since 4 is even the next number is 2. Since 2 is even, the next number is 1. At that point we’re done.
例如，假设我们从5开始。因为5是奇数，所以下一个数字是3x5 + 1 = 16。因为16是偶数，所以下一个数字是8。因为8是偶数，所以下一个数字是4。因为4是偶数，所以下一个数字是2。因为2是偶数，所以下一个数字是1。到那时我们就结束了。
The sequence was 5, 16, 8, 4, 2, 1.
序列为5、16、8、4、2、1。

Your first task is to write a method as follows: `public static int nextNumber(int n)` that returns the next number. For example `nextNumber(5)` should return 16. This method will be tested by the Gradescope autograder. Make sure to provide a description of the method as a comment. Your description should be contained by `/**` and `*/`. Comments contained by `/**` and `*/` are also called “Javadoc comments” or just “Javadocs”. These comments can span multiple lines if they need the extra space, e.g. the `nextNumber` Javadocs.
你的第一个任务是编写一个方法如下：返回 `public static int nextNumber(int n)` 下一个数字。例如 `nextNumber(5)` ，应该返回16。该方法将通过Gradescope自动平地机进行测试。请确保以注释的形式提供方法的描述。您的描述应包含在 `/**` 和中 `*/` 。和包含的注释 `/**` `*/` 也称为“Javadoc注释”或“Javadocs”。如果需要额外的空间，这些注释可以跨多行，例如： `nextNumber` Javadoc

Javadocs may contain optional tags, e.g. `@param`. We do not require you to use any tags like this in 61B except the `@source` tag. Use the `@source` tag any time you receive significant help on a project. The `@source` tag is not required for HW or lab, though we recommend it anyway, since it’s a good scholarly and professional habit to cite your sources.
Javadoc可以包含可选的标签，例如 `@param` .我们不要求您在61B中使用除标签之外的任何标签 `@source` 。每当 `@source` 您在项目上收到重要帮助时，请使用该标记。硬件 `@source` 或实验室不需要这个标签，尽管我们还是推荐它，因为引用你的来源是一个很好的学术和专业习惯。

Some Java tips:一些Java技巧：

* The `%` operator implements remainder. For example, the value of `x % 4` will be `0`, `1`, `2`, or `3`.
运算 `%` 符实现余数。例如，的值 `x % 4` 将为 `0` 、 `1` 、 `2` 或 `3` 。
* The `==` operator compares two values for inequality. The code fragment `if (n % 4 == 1)` reads as “if the remainder when dividing n by 4 is equal to 1.”
运算 `==` 符比较两个值是否不等。代码片段 `if (n % 4 == 1)` 读作“如果n除以4时的余数等于1”

After writing `nextNumber`, fill in the `main` method so that it prints out the Collatz sequence starting from `n = 5`. For example, if `n = 5`, your program should print `5 16 8 4 2 1`. It’s fine if there’s an extra space after the 1.
写入后 `nextNumber` ，填写该 `main` 方法，以便它打印出Collatz序列从开始 `n = 5` 。例如，如果 `n = 5` ，您的程序应该打印 `5 16 8 4 2 1` 。如果在1后面有一个额外的空格就可以了。

Fun fact: For all numbers, the Collatz sequence appears to terminate at 1. So far, however, nobody has been able to prove that this is true for all possible starting values, but all values up to approximately 2^68 have been checked.
有趣的事实：对于所有数字，Collatz序列似乎在1处终止。然而，到目前为止，还没有人能够证明这对所有可能的起始值都是正确的，但是直到大约2^68的所有值都被检查过了。
As noted in the wikipedia article, mathematician Jeffrey Lagarias noted that the Collatz conjecture “is an extraordinarily difficult problem, completely out of reach of present day mathematics.”
正如维基百科的文章所指出的，数学家杰弗里·拉加里亚斯指出，Collatz猜想“是一个非常困难的问题，完全超出了当今数学的范围。

E. Pushing Your Work to GitHub
E.把你的工作推到GitHub
------------------------------------------------

We’ll use the Git tool in this class to store a copy of your work in what is known as a “repository”. As we’ll see in a later lab, you’ll also be able to retrieve old versions of your work from your repository using Git.
我们将在这个类中使用Git工具来存储您的工作的副本，称为“存储库”。正如我们将在后面的实验中看到的，您还可以使用Git从存储库中检索您的工作的旧版本。
In fact, Git is the most popular code version control software used in the real world, and if you go into software engineering, it is almost guaranteed you’ll use this tool every day.
事实上，Git是真实的世界中最流行的代码版本控制软件，如果你进入软件工程领域，几乎可以保证你每天都会使用这个工具。

The private company GitHub has servers that are able to store git repositories, and their website github.com provides a convenient web interface to view repositories.
私人公司GitHub拥有能够存储git仓库的服务器，他们的网站github.com提供了一个方便的Web界面来查看仓库。

In this section, we’ll see how to “push” your repository to GitHub.
在本节中，我们将看到如何将您的存储库“推送”到GitHub。

First start by going to the GitHub URL corresponding to your repository. For example, if your repository number is 343, you’d go to [https://github.com/Berkeley-CS61B-Student/sp21-s343](https://github.com/Berkeley-CS61B-Student/sp21-s343). Go to the URL corresponding to your repository. You’ll see there’s nothing there. If you try other repository numbers, you’ll see that you do not have access. That is, only you (and the course staff) can view your respository.
首先转到与您的存储库对应的GitHub URL。例如，如果您的存储库编号是343，则可以访问<https://github.com/Berkeley-CS61B-Student/sp21-s343。转到与您的存储库对应的URL。你会发现那里什么都没有如果您尝试其他存储库编号，您将看到您没有访问权限。也就是说，只有您（和课程工作人员）可以查看您的存储库。>

To push your code, we’ll be using the following three commands: `add`, `push`, and `commit`. Don’t worry about the details yet, and simply follow the steps below:
要推送代码，我们将使用以下三个命令： `add` 、 `push` 和 `commit` 。不要担心细节，只需按照以下步骤操作即可：

1. Open a terminal window and navigate to the folder containing your `sp21-s***` repository, **NOT** your `snaps-sp21-s***` repo. If you type the “ls” command, you should see your lab1 folder sitting there.
打开一个终端窗口，导航到包含存储库的文件夹，而不是存储库。 `sp21-s***` repository, NOT your `snaps-sp21-s***` repo.如果您键入"ls"命令，您应该看到您的lab1文件夹位于那里。
2. Enter the following command to confirm that you’re in the right directory.
输入以下命令以确认您在正确的目录中。

```
 git status 
```

If everything is working correctly you should see something like:
如果一切正常，您应该会看到如下内容：

```
 On branch master
 Changes not staged for commit:
 (use "git add <file>..." to update what will be committed)
 (use "git restore <file>..." to discard changes in working directory)
 modified: lab1/Collatz.java 
```

What Git is telling you is that you’ve changed something about your lab1/Collatz.java folder that GitHub has not recorded. **Make sure that it says lab1/Collatz.java, not just Collatz.java**. If it says just Collatz.java, you should use `cd..` to go up one directory.
Git告诉你的是，你改变了你的lab1/www.example.com文件夹的一些东西，而GitHub没有记录。Collatz.java folder that GitHub has not recorded.确保它显示为lab1/www.example.com，而不仅仅是Collatz.java。Collatz.java, not just Collatz.java.如果它只显示www.example.com，则应使用向上移动一个目录。Collatz.java, you should use `cd..` to go up one directory.

3. Enter the command 输入命令

```
 git add lab1/* 
```

4. Enter the following command to confirm that add worked properly.
输入以下命令以确认添加工作正常。

```
 git status 
```

If everything is working correctly, you should see something like:
如果一切正常，您应该会看到如下内容：

```
 On branch master
 Changes to be committed:
 (use "git restore --staged <file>..." to unstage)
 modified: lab1/Collatz.java 
```

Now Git is telling you that it is acknowledging that you want to record the changes you made to Collatz.java.
现在Git告诉你，它承认你想记录你对Collatz.java所做的更改。

5. Enter the command 输入命令

```
 git commit -m "done with Collatz" 
```

When you do this, Git will make a recording of the changes you made to Collatz.java. It will also record the message “done with Collatz” along with the recording. These messages can be helpful if you’re looking to find a specific change at some point in the past.
当你这样做时，Git会记录你对Collatz.java所做的更改。它还将记录消息“与Collatz完成”沿着录音。如果您希望查找过去某个时间点的特定更改，这些消息可能会有所帮助。
We’ll discuss further in a later lab. It will also print some output the terminal, and you’ll see something like below, though the number of insertions and deletions may be different.
我们将在稍后的实验中进一步讨论。它还将在终端上打印一些输出，您将看到如下所示的内容，尽管插入和删除的数量可能不同。

```
 [master e2c138b] done with Collatz
 1 file changed, 15 insertions(+), 1 deletion(-) 
```

6. As before, enter the git status command.
和前面一样，输入git status命令。

```
 git status 
```

If commit worked correctly, you should see something like:
如果commit工作正常，您应该看到如下内容：

```
 On branch master
 nothing to commit, working tree clean 
```

The fact that the “working tree” is “clean” means that all of your work is backed up.
“工作树”是“干净的”这一事实意味着您的所有工作都得到了备份。

7. Refresh the URL for your repo on GitHub.com. You’ll see that your changes STILL aren’t showing up. This is because we have one last step.
在GitHub.com上刷新您的存储库的URL。你会发现你的变化仍然没有出现。因为我们还有最后一步。
8. Enter the command: 输入命令：

```
 git push origin master 
```

9. Refresh the URL for your repo on GitHub.com. You should see that your changes to Collatz.java are now visible, along with the message you entered.
在GitHub.com上刷新您的存储库的URL。您应该会看到您对www.example.com所做的更改Collatz.java沿着您输入的消息现在都是可见的。

Note that normally you won’t enter `git status` after every single command. We were only doing this to make sure that you entered the commands correctly. The three commands that we entered that were actually necessary to get your code on GitHub are summarized below:
请注意，通常您不会 `git status` 在每个命令后输入。我们这样做只是为了确保您正确地输入了命令。我们输入的三个命令实际上是在GitHub上获取代码所必需的，总结如下：

```
git add lab1/*
git commit -m "done with Collatz"
git push origin master 
```

A lot of questions probably come to mind:
很多问题可能会浮现在脑海中：

* Why is it useful to have to manually track my changes rather than just using a tool like Dropbox that automatically makes backups?
为什么必须手动跟踪我的更改而不是使用Dropbox等自动备份的工具很有用？
* What do these individual commands do? If commit made a recording of my work, but it wasn’t visible until I entered push, then where was the backup made?
这些单独的命令是做什么的？如果commit记录了我的工作，但直到我进入push才能看到，那么备份在哪里？
* Why does it take 3 commands instead of just one? Why not just a single command like ‘git upload -m “done with Collatz”’ or whatever?
为什么它需要3个命令而不是一个？为什么不直接使用一个命令，比如'git upload -m“done with Collatz”'或者其他什么？

Let’s address them in turn:
让我们依次解决它们：

**Q: Why wouldn’t people just use Dropbox (or similar)?** Dropbox is backing up everything at sporadic intervals. When writing programs, we often want to make backups at specific times and only of specific files.
问：为什么人们不直接使用Dropbox（或类似产品）？Dropbox以零星的间隔备份所有内容。在编写程序时，我们通常希望在特定的时间只对特定的文件进行备份。
For example, when you finally get a program working, you might want to back it up at that point so you can come back to it if you break it later. Also the ability to add a message makes it easy to organize the backups so you can find the ones you want.
例如，当你最终让一个程序工作时，你可能想在那个时候备份它，这样如果你以后中断它，你就可以回到它。此外，添加消息的功能可以轻松组织备份，以便您可以找到您想要的备份。

**What does add do?** Add marks a file (or set of files) as something you want to backup.
add是做什么的？“添加”将一个文件（或一组文件）标记为要备份的内容。

**What does commit do?** Commit creates a backup with the given message.
commit是做什么的？Commit使用给定的消息创建备份。

**If commit makes a backup but not to GitHub, where did it back up my files?** On your own computer!
如果commit进行了备份，但没有备份到GitHub，那么它在哪里备份了我的文件？在你自己的电脑上！

**What good is a backup on your own computer?** If you want to go back to an old version, you can do that using git using other commands. By storing the backup locally, restoring old backups is very fast and doesn’t require an internet connection.
在自己的计算机上备份有什么好处？如果你想回到旧版本，你可以使用git和其他命令。通过将备份存储在本地，恢复旧备份非常快，并且不需要互联网连接。

**What if my computer dies, isn’t the backup made by commit lost?** Yes. That’s why there’s a push command.
如果我的电脑死机了，提交的备份不会丢失吗？是的这就是为什么有一个push命令。

**Why not do add, commit, and push in one command?** Sometimes you only want to add a small number of files, so you might call add on only those files before finally doing a commit.
为什么不在一个命令中执行add、commit和push？有时候你只想添加少量的文件，所以你可以在最终提交之前只对这些文件调用add。
And sometimes you want to make commits but don’t want to push, for example because you don’t have internet access or because you’re working on code that is too sensitive to be placed on any internet site.
有时候你想提交但不想推送，例如因为你没有互联网接入，或者因为你正在处理的代码太敏感而不能放在任何互联网网站上。

**How do I see the history of old backups and how do I restore them?** If you want to see old commits, you can use `git log`, and you can use `git checkout` to restore old copies of your code. We’ll cover these later. Alternately you can also use the web interface at GitHub.com to explore and even download old copies.
如何查看旧备份的历史记录以及如何还原它们？如果你想看到旧的提交，你可以使用 `git log` ，你可以使用 `git checkout` 来恢复你的代码的旧副本。我们稍后再讨论这些。或者，您也可以使用www.example.com上的Web界面GitHub.com来浏览甚至下载旧版本。

We will come to understand git better throughout the semester.
我们将在整个学期中更好地理解git。

Bonus: As an analogy for those of you have seen the 1984 film Ghostbusters (which I watched literally every day as a small kid), the `add` command is somewhat like using your proton accelerator on a ghost (or ghosts), the `commit` command is a somewhat like pulling the ghost (or ghosts) into the trap, and the `push` command is somewhat like unloading the trap into the Containment Unit.
奖励：对于那些看过1984年电影《捉鬼敢死队》的人来说（我小时候每天都看），这个 `add` 命令有点像对鬼魂使用质子加速器，这个 `commit` 命令有点像把鬼魂（或鬼魂）拉进陷阱，这个 `push` 命令有点像把陷阱卸载到遏制单元。

F. Submitting Lab 1
F的。提交实验1
------------------------------

The last step is to submit your work with Gradescope. Gradescope is the site that you’ll use to submit homework, lab, and project assignments. To sign up for Gradescope (if you haven’t already), head to [gradescope.com](http://gradescope.com) and click on the white “Sign up for free” button in the middle. You should use your Berkeley email. You should have already been enrolled in our Gradescope page with your Berkeley email.
最后一步是使用Gradescope提交您的作品。Gradescope是一个你可以用来提交家庭作业、实验和项目作业的网站。要注册Gradescope（如果您还没有），请前往gradescope.com并单击中间的白色“免费注册”按钮。你应该用你的伯克利邮箱。你应该已经在我们的成绩表页面与您的伯克利电子邮件注册。
If you have not been added to Gradescope yet, you can refer to our welcome post on Ed for an enrollment code.
如果你还没有被添加到Gradescope，你可以参考我们在Ed上的欢迎帖子，以获得注册代码。

Once you’re enrolled in the class on Gradescope, click on “Lab 1: Welcome to Java” to submit your code.
一旦您注册了Gradescope上的课程，请单击“实验1：欢迎使用Java”提交代码。

After clicking this button, you’ll be taken to a screen where you select your repository and branch (shown below).
单击此按钮后，您将进入一个屏幕，在该屏幕中选择您的存储库和分支（如下所示）。
The first time you do this, you’ll have to link your GitHub account to Gradescope (similar to what you did on the registration website). Click the “Connect to GitHub” button and follow the instructions.
第一次这样做时，你必须将你的GitHub帐户链接到Gradescope（类似于你在注册网站上所做的）。点击“连接到GitHub”按钮并按照说明操作。

Now select your repository and branch. If your repository is “sp21-s57”, you’ll select “sp21-s57” in the top box, and in the bottom box you’ll pick “master”.
现在选择您的存储库和分支。如果你的仓库是“sp21-s57”，你将在顶部的框中选择“sp21-s57”，在底部的框中选择“master”。

Later, you can create your own “branches” (as described in a later optional part of a 61Blab) if you want those graded instead, though that won’t be required in 61B.
之后，如果你想让那些分数来代替，你可以创建你自己的“分支”（如61 Blab后面的可选部分所述），尽管61 B中不需要。

![](https://sp21.datastructur.es/materials/lab/lab1/img/github_repo_and_branch_selection.png)

Now press “Upload” to submit!
现在按“上传”提交！

Please report any issues you may have to Ed. Entire error messages and/or screenshots are welcome.
请向Ed报告您可能遇到的任何问题。欢迎使用完整的错误消息和/或屏幕截图。

**_Important:_** _We HIGHLY encourage you to make frequent commits!_ **Lack of proper version control will not be considered an excuse for lost work, particularly after the first few weeks.**
重要提示：我们强烈建议您频繁提交！缺乏适当的版本控制不会被认为是丢失工作的借口，特别是在最初的几周之后。

G. Verifying Snaps Installation
G的。验证快照安装
-------------------------------------------

In your terminal, run the following commands, one by one:
在您的终端中，逐个运行以下命令：

```
cd $SNAPS_DIR
git push 
```

Now, in Gradescope, you will see that Lab 1 has another grader called “Lab 1A: Snaps Checkoff”. Click on this button, and choose “Github” under “Submission Method”.
现在，在Gradescope中，您将看到Lab 1有另一个名为“Lab 1A：捕捉复选框”。点击这个按钮，然后选择“提交方法”下的“Github”。

This time, choose your `snaps-sp21-s***` repo and **NOT** your `sp21-s***` repo, and hit “Submit”.
这一次，选择你的 `snaps-sp21-s***` 仓库，而不是你 `sp21-s***` 的仓库，然后点击“提交”。

If you pass these grader tests, you have set up your computer correctly. Yay! If you didn’t pass this grader, try to repeat the steps in part C of this lab and/or this section more carefully, or **come to Office Hours**. Passing this grader is required for getting full credit on Lab 1.
如果您通过了这些评分员测试，则表明您已正确设置了计算机。耶！如果您没有通过此评分，请尝试更仔细地重复本实验C部分和/或本节中的步骤，或到办公时间。通过此评分者要求获得实验1的全部学分。

Note that this is one of the few times you will make a submission using your Snaps repo, and we will always explicitely tell you to do so when necessary. Otherwise, always work on and submit assignments from your `sp21-s***` repo.
请注意，这是您使用快照存储库进行提交的少数几次之一，我们将在必要时明确告诉您这样做。否则，请始终从您的存储库中处理并提交任务 `sp21-s***` 。

Recap回顾
-------

1. The IntelliJ IDE is what we’ll be using to run Java code this semester.
IntelliJ IDE是我们这学期用来运行Java代码的工具。

2. Git is a version control system that tracks the history of a set of files in the form of commits.
Git是一个版本控制系统，以提交的形式跟踪一组文件的历史。

3. Commit often and use informative commit messages.
经常提交并使用信息性的提交消息。

4. Pull from the `skeleton` remote repository to get or update starter code for assignments.
从 `skeleton` 远程存储库中获取或更新工作分配的启动代码。

5. Use Gradescope to submit homework, labs, and projects.
使用Gradescope提交作业、实验和项目。

Josh Hug’s Color Scheme (Optional)
Josh Hug的配色方案（可选）
------------------------------------------------------

I’m not a big fan of the default IntelliJ colors, so I made my own color scheme, which is a very close imitation of the extremely good Sunburst theme for Sublime. To use my theme, download [hug_sunburst](/materials/lab/lab1/hug_sunburst.jar), and import it using the “File→Manage IDE Settings→Import Settings” option in IntelliJ. You might end up with large text, which I use for recording videos. To adjust the size of the font in Intellij to your liking, see [this link](https://www.jetbrains.com/help/idea/configuring-colors-and-fonts.html).
我不是IntelliJ默认颜色的忠实粉丝，所以我制作了自己的配色方案，这是对Sublime非常好的朝阳主题的非常接近的模仿。要使用我的主题，请下载hug_朝阳，并使用IntelliJ中的“文件→管理IDE设置→导入设置”选项导入它。你可能会得到大文本，我用它来录制视频。要根据您的喜好调整Intellij中的字体大小，请参阅此链接。
