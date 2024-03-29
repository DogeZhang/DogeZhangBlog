# Docker 历程(一) —— 认识Docker

## Docker 定义
如果抛开Docker的发展历史不谈，那么Docker可以看作是一种技术，是另一种封装的艺术————容器。

> Docker是`Google`公司推出的`Go`语言开发的一种基于Linux内核的 `cgroup`, `namespace` ，以及AUFS类的`Union FS`等技术，**对进程进行封装隔离**，属于**操作系统层面的虚拟化技术**。
> ————《Docker 技术入门与实践 第二版》

为了更好的理解Docker的作用，我们可以联系一下虚拟机，相信虚拟机不是一个有难度的概念。

> 虚拟机是通过软件来模拟一个具有完整硬件系统功能的，运行在一个完全隔离环境中的完整计算机系统。

注意上文的**完整**。

虚拟机可以创造一个近乎完美的环境，来运行各种各样的系统。它可以为操作系统模拟出一套物理硬件，使得运行一套**完整**的操作系统。然后我们便可在里面运行我们程序。

相对Docker而言，**完整**便是一个最大的区别。它不会费尽周折的提供所有的硬件模拟，而是灵巧的运用Linux系统的特点，仅仅为他们提供必要的命名空间Namespace和Cgroup。

吃猪肉见不得一定要知道猪怎么跑，我们只需要知道（这肉真香），Cgroup技术和Namespace技术是Docker容器技术的核心。

> **Cgroup技术**是用来制造约束的主要手段，
>  
> **Namespace技术**是用来修改进程视图的主要方法。

Docker运用这种技术为我们的进程打造了一个与操作系统隔离的运行环境，我们叫它`容器`，所以我们就可以避免虚拟机的大量消耗，用小巧的容器把进程封装起来，像一个程序一样运行在自己的物理机中，而容器内却无法访问物理机的其他区域。就像游戏中的“空气墙”，不过这堵墙不仅你走不过去，你还看不到外面。