package cn.learning.lyc.factory.simple;

/**
 * 美国仓
 * 
 * @author yicai.liu
 */
public class US implements IWarehouse
{

	@Override
	public void process()
	{
		System.out.println("美国仓仓库运转...");

	}

}
