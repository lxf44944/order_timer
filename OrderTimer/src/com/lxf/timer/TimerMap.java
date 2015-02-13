package com.lxf.timer;

import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

;
/**
 * 获取Timer单例
 * 
 * @author 风的流向
 * 
 */
public class TimerMap {

	private static Map<String, Timer> map = new HashMap<String, Timer>();

	private TimerMap() {// 私有构造器
	}

	/**
	 * 获得订单对应的Timer
	 * 
	 * @param Id
	 *            订单id
	 * @return 订单对应的Timer
	 */
	public static Timer getTimer(String Id) {
		return map.get(Id);
	}
}
