Author: Eli Lipsitz作者：Eli Lipsitz

This document will guide you through installing and using the CS 61B IntelliJ plugins. This guide assumes that you already have IntelliJ installed, as well as the plugins from Lab 1, and update the plugins to their most recent versions.  
本文档将指导您安装和使用CS 61B IntelliJ插件。本指南假设您已经安装了IntelliJ以及实验1中的插件，并将插件更新到最新版本。

Using the Plugins [#](#using-the-plugins)  
使用插件#
-------------------------------------------------

### Style Checking [#](#style-checking)  
样式检查编号

In this class, you will eventually be required to make sure your code conforms to the official style guide. The plugin includes a helpful style checker, which will check your code and inform you of any style errors and their locations.  
在这个类中，您最终将被要求确保您的代码符合官方样式指南。该插件包括一个有用的样式检查器，它将检查您的代码并通知您任何样式错误及其位置。

To run the style checker, simply right click any file or directories you want to check, and select **Check Style** in the menu that appears:要运行样式检查器，只需右键单击要检查的任何文件或目录，然后在出现的菜单中选择检查样式： ![](https://sp23.datastructur.es/materials/guides/intellij/plugin/plugin-checkstyle-button.png)

Click it, and the style checker will run. A tool window will appear with the results of the style check, and a list of any errors. Click the links to jump directly to the problematic line of code:单击它，样式检查器将运行。将出现一个工具窗口，其中包含样式检查的结果以及所有错误的列表。单击链接可直接跳到有问题的代码行： ![](https://sp23.datastructur.es/materials/guides/intellij/plugin/plugin-checkstyle-results.png)

### Java Visualizer [#](#java-visualizer)  
Java Visualizer #

The “Java Visualizer” plugin contains a tool similar to the Python Visualizer you may have used in CS 61A. This tool is intended to help you debug and understand your code, and is integrated into IntelliJ’s Java debugger.  
“Java Visualizer”插件包含一个类似于您可能在CS 61A中使用过的Python Visualizer的工具。此工具旨在帮助您调试和理解代码，并集成到IntelliJ的Java调试器中。

To use the built-in visualizer, debug your code, setting breakpoints as necessary. When your code stops, you can click the Java Visualizer tab:若要使用内置可视化工具，请调试代码，并根据需要设置断点。当代码停止时，可以单击Java Visualizer选项卡： ![](https://sp23.datastructur.es/materials/guides/intellij/plugin/plugin-visualizer-tab.png)

The Java Visualizer will appear, displaying the stack of the currently paused program:此时将出现Java Visualizer，显示当前暂停的程序的堆栈： ![](https://sp23.datastructur.es/materials/guides/intellij/plugin/plugin-visualizer-view.png)

As you continue to step through and pause your code, the visualizer display will update accordingly to show you what’s going on in your program.  
当您继续单步执行并暂停代码时，可视化工具显示将相应地更新，以显示程序中正在发生的情况。