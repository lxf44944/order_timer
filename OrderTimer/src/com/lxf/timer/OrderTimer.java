package com.lxf.timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 订单限时启动
 * 
 * @author 风的流向
 * 
 */
public class OrderTimer {

	
	/**
	 * 1分钟后修改订单状态
	 */
	public static void work(Timer timer) {
		TimerTask timerTask = new OrderTimerTask();
		System.out.println("计时器进入1分钟倒计时···");
		timer.schedule(timerTask, 1000 * 60 * 1);// 1分钟后执行
	}
}
