# order_timer
这是一个下单后等待结算倒计时的计时器程序，前端使用js进行倒计时显示，后端开辟新的线程进行倒计时及定时相关操作

# 程序原理
    java.util包中提供了两个非常有用类Timer 、TimerTask。
    Timer类用来安排任务工作,TimerTask用来实现任务工作；
    我们可以通过下面来实现一个定时任务：
    1、定义一个实现了TimerTask的自定义类MyTimerTask(别忘了实现父类中的抽象方法run())，并创建一个实例mytask.
    2、创建Timer的一个实例：Timer mytimer= new Timer();
    3、安排执行：mytimer.schedule(mytask,80000,50000).
    好了,这个任务会在启动8秒后执行,以后每隔5秒执行一次.
