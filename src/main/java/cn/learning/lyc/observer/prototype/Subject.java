package cn.learning.lyc.observer.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yicai.liu
 * @version
 * @date 2016年3月2日 下午3:52:20
 */
public abstract class Subject
{
	// 观察者列表
	private List<Observer> observers = new ArrayList<Observer>();

	// 添加观察者
	public void attach(Observer observer)
	{
		observers.add(observer);
	}

	// 删除观察者
	public void detach(Observer observer)
	{
		observers.remove(observer);
	}

	// 通知观察者
	public void notifyObservers()
	{
		for (Observer o : observers)
		{
			o.update(this);
		}
	}
}
