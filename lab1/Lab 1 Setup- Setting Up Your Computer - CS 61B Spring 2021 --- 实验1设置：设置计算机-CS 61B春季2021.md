Lab 1 Setup: Setting Up Your Computer

We encourage you to complete as much of this setup as you can on your own before coming to lab 1. If you get stuck, come to office hours or lab to get help.
我们鼓励您在进入实验 1 之前，尽可能多地自行完成此设置。如果你被卡住了，来办公时间或实验室寻求帮助。

A. Installing a Text Editor (optional)

## 答：安装文本编辑器（可选）

If you don’t already have a favorite text editor, we recommend installing one.
如果您还没有最喜欢的文本编辑器，我们建议您安装一个。

The three most popular GUI text editors these days seem to be:
目前最流行的三种 GUI 文本编辑器似乎是：

1. Sublime Text (free but nags you until you pay): [https://www.sublimetext.com/](https://www.sublimetext.com/)
Sublime Text（免费，但会唠叨你，直到你付费）：[https://www.sublimetext.com/](https://www.sublimetext.com/)
2. Atom (free): [https://atom.io/](https://atom.io/)
原子（游离）：[https://atom.io/](https://atom.io/)
3. Visual Studio Code (free): [https://code.visualstudio.com/](https://code.visualstudio.com/)
Visual Studio Code（免费）：[https://code.visualstudio.com/](https://code.visualstudio.com/)

See [this text editor review](https://www.techradar.com/best/best-text-editors) for a more thorough look at these and other text editors.
请参阅此文本编辑器评论，以更全面地了解这些和其他文本编辑器。

The choice isn’t very important, as we will only be using a text editor a few times throughout the course. Most of the time we’ll be using something else called an IDE.
这个选择并不重要，因为我们在整个课程中只会使用几次文本编辑器。大多数时候，我们将使用其他称为 IDE 的东西。

You do not need to pick one of the three options above. You’re welcome to use a different text editor entirely (built-in text editors, vim, emacs, etc).
你不需要从上面的三个选项中选择一个。欢迎您使用完全不同的文本编辑器（内置文本编辑器，vim，emacs 等）。

B. Configure Your Computer

## B. 最后一句配置您的计算机

Depending on your operating system, there are a few things we need to do to set your computer up for 61B.
根据您的操作系统，我们需要做一些事情来设置您的计算机为 61B。

The precise steps to take depend on your operating system.
具体步骤取决于您的操作系统。

- [Windows instructions](windows.html) \[[Video Walkthrough](https://youtu.be/xEO4SOjmUOw)]
Windows 说明\[视频演练]
- [macOS instructions macOS 说明](mac.html)
- [Linux instructions Linux 指令](linux.html)

Move on to the next section only once you’ve completed the instructions above for your operating system. Advanced users on Windows may also use the new Bash for Windows feature, but we will not be providing official directions.
只有在您完成了操作系统的上述说明后，才能进入下一节。Windows 上的高级用户也可以使用新的 Bash for Windows 功能，但我们不会提供官方说明。
Note that if you use Bash for Windows, you’ll need to install Java twice (once inside Bash for Windows, and once inside Windows itself, following the directions above).
请注意，如果您使用 Bash for Windows，则需要安装两次 Java（一次在 Bash for Windows 中，一次在 Windows 本身中，按照上面的说明）。

C. Learn to Use the Terminal (Optional)

## C. 最大值学习使用终端（可选）

If you already know how to open and use a terminal, skip this section.
如果您已经知道如何打开和使用终端，请跳过本节。

The terminal is an application that allows you to run all sorts of programs, as well as manipulate files in your own computer. It is a powerful but also dangerous tool, so please be careful with using some of these commands.
终端是一个应用程序，允许您运行各种程序，以及在自己的计算机上操作文件。它是一个强大但也很危险的工具，所以请小心使用其中的一些命令。
On Unix-like operating systems, the Terminal application will provide you with everything that you need. On macOS, for example, you can use Spotlight to search for the Terminal application.
在类 Unix 操作系统上，终端应用程序将为您提供所需的一切。例如，在 macOS 上，您可以使用 Spotlight 搜索终端应用程序。

Here are some important ones that you may find useful in this course:
以下是您可能会在本课程中发现有用的一些重要内容：

- `cd`: change your working directory
`cd` ：更改工作目录

 cd hw 

This command will change your directory to `hw`.
此命令会将目录更改为 `hw` 。
- `pwd`: present working directory
`pwd` ：当前工作目录

 pwd 

This command will tell you the full absolute path for the current directory you are in if you are not sure where you are.
如果您不确定当前目录的位置，此命令将告诉您当前目录的完整绝对路径。
- `.`: means your current directory
`.` ：表示当前目录

 cd . 

This command will change your directory to the current directory (aka. do nothing).
此命令将把目录更改为当前目录（也称为。什么都不做）。
- `..`: means one parent directory above your current directory
`..` ：表示当前目录上的一个父目录

 cd .. 

This command will change your directory to its parent. If you are in /workspace/day1/, the command will place you in /workspace/.
此命令将把您的目录更改为其父目录。如果您在 / workspace/day 1 / 中，则该命令会将您放置在 / workspace / 中。
- `ls`: list files/folders in directory
`ls` ：列出目录中的文件 / 文件夹

 ls 

This command will list all the files and folders in your current directory.
此命令将列出当前目录中的所有文件和文件夹。

 ls -l 

This command will list all the files and folders in your current directory with timestamps and file permissions. This can help you double-check if your file updated correctly or change the read-write- execute permissions for your files.
此命令将列出当前目录中的所有文件和文件夹以及时间戳和文件权限。这可以帮助您仔细检查文件是否正确更新或更改文件的读写执行权限。
- `mkdir`: make a directory
`mkdir` ：创建目录

 mkdir dirname 

This command will make a directory within the current directory called `dirname`.
此命令将在当前目录中创建一个名为的目录 `dirname` 。
- `rm`: remove a file
`rm` ：删除文件

 rm file1 

This command will remove file1 from the current directory. It will not work if `file1` does not exist.
此命令将从当前目录中删除 file 1。如果不存在，它将无法工作 `file1` 。

 rm -r dir1 

This command will remove the `dir1` directory recursively. In other words, it will delete all the files and directories in `dir1` in addition to `dir1` itself. Be careful with this command!
此命令将递归删除 `dir1` 目录。换句话说，它将删除除了自身之外的所有文件和目录 `dir1` `dir1` 。小心这个命令！
- `cp`: copy a file
`cp` ：复制文件

 cp lab1/original lab2/duplicate 

This command will copy the `original` file in the `lab1` directory and and create a `duplicate` file in the `lab2` directory.
此命令将复制目录中的 `original` 文件 `lab1` 并 `duplicate` 在目录中创建文件 `lab2` 。
- `mv`: move or rename a file
`mv` ：移动或重命名文件

 mv lab1/original lab2/original 

This command moves `original` from `lab1` to `lab2`. Unlike `cp`, mv does not leave original in the `lab1` directory.
此命令从移动 `original` `lab1` 到 `lab2` 。与此不同 `cp` ，mv 不会将 original 保留在目录中 `lab1` 。

 mv lab1/original lab1/newname 

This command does not move the file but rather renames it from `original` to `newname`.
此命令不会移动文件，而是将其从重命名 `original` 为 `newname` 。

There are some other useful tricks when navigating on a command line:
在命令行上导航时，还有一些其他有用的技巧：

- Your shell can complete file names and directory names for you with _tab completion_. When you have an incomplete name (for something that already exists), try pressing the `tab` key for autocomplete or a list of possible names.
您的 shell 可以使用制表符完成来完成文件名和目录名。当您有不完整的名称（对于已经存在的名称）时，请尝试 `tab` 按自动完成键或可能的名称列表。
- If you want to retype the same instruction used recently, press the `up` key on your keyboard until you see the correct instruction. This saves typing time if you are doing repetitive instructions.
如果要重新键入最近使用过的相同指令，请按 `up` 键盘上的键，直到看到正确的指令。如果您正在执行重复的指令，则可以节省键入时间。

D. Test Run for your Setup from Step B

## D. 最大值从步骤 B 开始为您的安装程序进行测试运行

Let’s ensure that everything is working.
让我们确保一切正常。

1. First open up your terminal. Check that git is a recognized command by typing the following command:
首先打开终端。输入以下命令，检查 git 是否是可识别的命令：

 git --version 

The version number for git should be printed. If you see “git: command not found”, or similar, try opening a new terminal window, restarting your computer, or installing Git again.
应该打印 git 的版本号。如果你看到 “git：命令未找到” 或类似的命令，尝试打开一个新的终端窗口，重新启动计算机，或重新安装 Git。
2. Second, let’s check that `javac` and `java` are working. `javac` and `java` allow _Command Line Compilation_, or in other words, the ability to run Java programs directly from the command line. In practice, most developers run Java programs through an IDE like IntelliJ, so we won’t be using command line compilation for much this semester other than testing your setup.
第二，让我们检查一下， `javac` 并 `java` 正在工作。 `javac` 并 `java` 允许命令行编译，或者换句话说，能够直接从命令行运行 Java 程序。在实践中，大多数开发人员通过 IntelliJ 之类的 IDE 运行 Java 程序，因此本学期除了测试您的设置外，我们不会使用命令行编译。
Start by running the following commands at your terminal.
首先在终端上运行以下命令。

 mkdir ~/temp
 cd ~/temp 

1. Then, open your operating system’s file explorer in this directory. You can do this from the command line:
然后，在此目录中打开操作系统的文件资源管理器。您可以从命令行执行此操作：

- Mac: `open .`麦克： `open .`
- Windows: `explorer .`窗口： `explorer .`
- Ubuntu: `gnome-open .`Ubuntu： `gnome-open .`
- Linux Mint: `xdg-open .` or `mate .`
Linux Mint： `xdg-open .` 或 `mate .`
2. In this newly opened directory, create a file `HelloWorld.java` with these contents:
在这个新打开的目录中，创建一个 `HelloWorld.java` 包含以下内容的文件：

 public class HelloWorld {
 public static void main(String[] args) {
 System.out.println("Hello world!");
 }
 } 
3. In your terminal, enter `ls` (list the files/folders in this directory). You should see `HelloWorld.java` listed.
在终端中，输入 `ls` （列出此目录中的文件 / 文件夹）。你应该看到 `HelloWorld.java` 列出的。
4. Run `javac HelloWorld.java`. If this produces any output, then something may be wrong with your setup. Try opening a new terminal window or restarting your computer. If that still doesn’t work, see the Troubleshooting section under the directions for your operating system.
`javac HelloWorld.java` 快跑如果这产生了任何输出，那么您的设置可能有问题。尝试打开新的终端窗口或重新启动计算机。如果仍然不起作用，请参阅操作系统说明下的故障排除部分。
5. Type `ls`, you should see both `HelloWorld.java` and a freshly created `HelloWorld.class` (the `javac` command created this file).
类型 `ls` ，您应该看到 `HelloWorld.java` 和一个新创建的 `HelloWorld.class` （ `javac` 命令创建了这个文件）.
6. Run `java HelloWorld`. It should print out “Hello world!” for you. If it didn’t, something is wrong with your setup!
`java HelloWorld` 快跑它应该打印出 “Hello world！“为了你如果没有，那么您的设置有问题！
7. You’re done! You can also delete the “temp” folder and its contents as you please.
你完了！您也可以删除 “临时” 文件夹及其内容，你请。

The screenshot below shows what we’re hoping for when we do steps 4-7. If you see something similar to this, your java setup is complete. 下面的屏幕截图显示了我们在执行步骤 4-7 时的期望。如果你看到类似的东西，你的 java 安装就完成了。 ![](https://sp21.datastructur.es/materials/lab/lab1setup/img/hello_world.png)

## E. Install IntelliJE. 安装 IntelliJ

1. Download the Community Edition of IntelliJ from the [JetBrains](https://www.jetbrains.com/idea/download/) website.
从 JetBrains 网站下载 IntelliJ 的社区版。
2. After selecting the appropriate version for your OS, click download and wait a few minutes for the file to finish downloading.
为您的操作系统选择适当的版本后，单击下载并等待几分钟，以完成文件下载。
3. Run the installer. If you have an older version of IntelliJ, you should uninstall it at this time and replace it with this newer version. You can use all of the default installation options, with one exception, if **you are on Windows**, make sure you check the box “Add launchers dir to the PATH”. If you accidentally missed it, the easiest fix is to uninstall intelliJ, and running the installer again, making sure you check that box the second time around. **The image below only applies to Windows.**
运行安装程序。如果您有旧版本的 IntelliJ，您应该在此时卸载它，并将其替换为新版本。您可以使用所有默认安装选项，但有一个例外，如果您在 Windows 上，请确保选中 “将启动器目录添加到 PATH” 框。如果您不小心错过了它，最简单的修复方法是卸载 intelliJ，并再次运行安装程序，确保第二次选中该框。下图仅适用于 Windows。

![](https://sp21.datastructur.es/materials/lab/lab1setup/img4/path.png)

F. Installing the IntelliJ CS 61B Plugins

## F 的。安装 IntelliJ CS 61B 插件

Begin the setup process by starting up IntelliJ. Then follow the steps below.
通过启动 IntelliJ 开始设置过程。然后按照下面的步骤。

**Make sure you’re running IntelliJ Version 2020.3.1 or later before continuing.** Older versions may also work but we haven’t tried them ourselves.
在继续之前，请确保您正在运行 IntelliJ 版本 2020.3.1 或更高版本。旧版本也可以工作，但我们自己还没有尝试过。

1. In the _Welcome_ window, click the **“Plugins”** button in the menu on the left. 在欢迎窗口中，单击左侧菜单中的 “插件” 按钮。 ![](https://sp21.datastructur.es/materials/lab/lab1setup/img2/plugin_setup1.png)
2. On the window that appears, click “Marketplace” and enter “CS 61B” in the search bar at the top. The CS 61B plugin entry should appear. If you click the autocomplete suggestion, a slightly different window from what is shown below may appear – this is okay.
在出现的窗口中，单击 “Marketplace”，然后在顶部的搜索栏中输入 “CS 61 B”。CS 61 B 插件条目应该出现。如果单击自动完成建议，可能会出现与下面显示的窗口略有不同的窗口 - 这是可以的。
3. Click the green **Install** button, and wait for the plugin to download and install. 点击绿色的 Install 按钮，等待插件下载并安装。 ![](https://sp21.datastructur.es/materials/lab/lab1setup/img2/plugin_setup2.png)
4. Now, search for “Java Visualizer”, and click the green **Install** button to install the plugin. 现在，搜索 “Java Visualizer”，然后单击绿色的 Install 按钮安装插件。 ![](https://sp21.datastructur.es/materials/lab/lab1setup/img2/plugin_setup3.png)
5. If it appears, click the green **Restart IDE** button to finalize the installation. If you don’t see a **Restart IDE** button, just continue.
如果出现，请单击绿色的 “重新启动 IDE” 按钮以完成安装。如果没有看到 “重新启动 IDE” 按钮，请继续。

For more information on using the plugins, read [the plugin guide](../../guides/plugin.html#using-the-plugins). You don’t have to read this right now.
有关使用插件的更多信息，请阅读插件指南。你不必现在读这个。

## G. CelebrateG 的。庆祝

Phew! You’re finally done setting everything up. You can now proceed to lab 1.
呼！你终于把一切都安排好了。现在，您可以进入实验 1。
