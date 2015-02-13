package com.lxf.timer;

import java.util.TimerTask;

/**
 * 限时支付订单定时器
 * 
 * @author 刘向峰
 * 
 */
public class OrderTimerTask extends TimerTask {

	@Override
	public void run() {
		// 将等待支付的订单状态改为未支付
		// 0 等待支付
		// 1 已支付
		// 2 未支付
		System.out.println("调用修改订单状态定时器");
		//根据订单id取得订单信息
		int status = -1;
		//获取订单状态
		if (status == 0) {
			// 如果为等待支付，则修改为未支付
			// 同时修改座位状态为可售
			System.out.println("订单已失效，座位解除锁定");
		}

	}
}
