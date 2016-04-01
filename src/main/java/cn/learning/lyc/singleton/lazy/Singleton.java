package cn.learning.lyc.singleton.lazy;

/**
 * 懒汉模式：类加载时较快，运行时获取速度对象的速度较慢，线程不安全
 * 
 * @author yicai.liu
 * @version
 * @date 2016年2月23日 下午2:46:03
 */
public class Singleton
{
	private static Singleton instance;

	private Singleton()
	{
	}

	// 可加synchronized 线程安全
	public static Singleton getInstance()
	{
		if (null == instance)
		{
			instance = new Singleton();
		}
		return instance;
	}

}
