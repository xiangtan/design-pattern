package cn.learning.lyc.factory.simple;

/**
 * 仓库工厂
 * 
 * @author yicai.liu
 */
public class WareHouseFactory
{
	public static IWarehouse create(Class<? extends IWarehouse> clazz)
	{
		IWarehouse warehouse = null;
		try
		{
			warehouse = clazz.newInstance();
		}
		catch (InstantiationException | IllegalAccessException e)
		{
			e.printStackTrace();
		}
		return warehouse;

	}
}
