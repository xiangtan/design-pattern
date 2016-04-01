package cn.learning.lyc.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @author yicai.liu
 * @version
 * @date 2016年3月3日 上午10:43:26
 */
public class Subscriber implements Observer
{
	private String	name;

	private String	content;

	public Subscriber(String name)
	{
		this.name = name;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public void update(Observable o, Object arg)
	{
		this.setContent((String) arg);
		System.out.println(name + "/" + content);
	}

}
