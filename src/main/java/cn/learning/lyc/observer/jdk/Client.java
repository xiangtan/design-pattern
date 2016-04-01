package cn.learning.lyc.observer.jdk;

import java.util.Observer;

/**
 * @author yicai.liu
 * @version
 * @date 2016年3月3日 上午10:48:55
 */
public class Client
{

	public static void main(String[] args)
	{
		// 主题
		News news = new News();
		// 观察者
		Observer oa = new Subscriber("1054566712@qq.com");
		Observer ob = new Subscriber("yourbatis@163.com");
		Observer oc = new Subscriber("18676780050@163.com");
		// 主题绑定观察者
		news.addObserver(oa);
		news.addObserver(ob);
		news.addObserver(oc);
		// 主题变更
		news.setContent("美国总统奥巴马昨晚11.30辞职！");
	}

}
