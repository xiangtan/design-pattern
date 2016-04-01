package cn.learning.lyc.proxy.dynamic.jdk.example.normal;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author yicai.liu
 * @version
 * @date 2016年2月28日 下午9:59:51
 */
public class SomethingHandler implements InvocationHandler
{
	private ISomething something;

	public SomethingHandler(ISomething something)
	{
		this.something = something;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
	{
		before();
		Object object = method.invoke(something);
		after();
		return object;
	}

	private void after()
	{
		System.out.println("after doing something .");

	}

	private void before()
	{
		System.out.println("before doing something .");

	}

}
