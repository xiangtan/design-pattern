package cn.learning.lyc.observer.prototype;

/**
 * @author yicai.liu
 * @version
 * @date 2016年3月2日 下午4:39:27
 */
public class ConcreteObserver implements Observer
{
	// 观察者名称
	private String	name;
	// 获取主题消息
	private String	msg;

	public ConcreteObserver(String name)
	{
		super();
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getMsg()
	{
		return msg;
	}

	public void setMsg(String msg)
	{
		this.msg = msg;
	}

	@Override
	public void update(Subject subject)
	{
		System.out.println(getName() + " 获取主题消息:" + ((ConcreteSubject) subject).getStatus());

	}

}
