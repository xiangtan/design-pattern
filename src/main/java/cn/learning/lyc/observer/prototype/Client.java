package cn.learning.lyc.observer.prototype;

/**
 * @author yicai.liu
 * @version
 * @date 2016年3月2日 下午4:43:19
 */
public class Client
{
	public static void main(String[] args)
	{
		// 创建主题对象
		ConcreteSubject subject = new ConcreteSubject();
		// 创建观察者对象
		Observer a = new ConcreteObserver("Observer 1 ");
		Observer b = new ConcreteObserver("Observer 2 ");
		Observer c = new ConcreteObserver("Observer 3 ");
		// 将观察者 注册 到主题对象
		subject.attach(a);
		subject.attach(b);
		subject.attach(c);
		// 更新
		subject.setStatus("A股跌破2000点");

	}
}
