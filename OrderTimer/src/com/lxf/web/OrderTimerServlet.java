package com.lxf.web;

import java.io.IOException;
import java.util.Timer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lxf.timer.OrderTimer;
import com.lxf.timer.TimerMap;

@SuppressWarnings("serial")
public class OrderTimerServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Timer timer = new Timer();
		OrderTimer.work(timer);
		boolean isPay = false;// 是否已支付，默认未支付
		if (isPay) {
			// 如果已支付，则取消定时器
			System.out.println("定时器已取消");
			TimerMap.getTimer("1").cancel();// 测试中的订单id为1
		}
		response.sendRedirect("timer.jsp");
	}
}
