package cn.learning.lyc.observer.prototype;

/**
 * @author yicai.liu
 * @version
 * @date 2016年3月2日 下午3:55:43
 */
public interface Observer
{
	/**
	 * 推模型 和 拉模型的区别就在这参数的传递了 
	 * 推模型：只选择项的推送 
	 * 拉模型：推送整个对象，让观察者自己选择性的拉取，该处为拉模型
	 * 
	 * @param subject
	 */
	public void update(Subject subject);
}
