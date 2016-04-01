package cn.learning.lyc;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yicai.liu
 * @version
 * @date 2016年3月11日 下午3:52:49
 */
public class T
{

	private ThreadLocal<T> session = new ThreadLocal<>();

	public static void main(String[] args)
	{
		Map<String, Integer> t = new HashMap<>();
		t.put(null, null);
		System.out.println(t.get(null));
		t.put(null, 1);
		System.out.println(t.get(null));
	}

}
