package cn.learning.lyc.observer.jdk;

import java.util.Observable;

/**
 * 新闻（主题）
 * 
 * @author yicai.liu
 * @version
 * @date 2016年3月3日 上午9:44:45
 */
public class News extends Observable
{
	private String content;

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
		this.setChanged();
		// 推模式
		this.notifyObservers(content);
	}

}
