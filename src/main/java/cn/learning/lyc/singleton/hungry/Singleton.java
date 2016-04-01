
package cn.learning.lyc.singleton.hungry;

/**
 * 饿汉模式：类加载时较慢，运行时获取速度对象的速度较快，线程安全
 * 
 * @author yicai.liu
 * @date 2016年2月23日 下午2:43:11
 */
public class Singleton
{
	private static Singleton instance = new Singleton();

	private Singleton()
	{
	}

	public static Singleton getInstance()
	{
		return instance;
	}
}
