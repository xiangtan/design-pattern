package cn.learning.lyc.observer.prototype;

/**
 * @author yicai.liu
 * @version
 * @date 2016年3月2日 下午4:03:43
 */
public class ConcreteSubject extends Subject
{
	private String status;

	public String getStatus()
	{
		return status;
	}

	public void setStatus(String status)
	{
		this.status = status;
		this.notifyObservers();
	}

}
