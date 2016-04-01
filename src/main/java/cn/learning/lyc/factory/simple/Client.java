package cn.learning.lyc.factory.simple;

/**
 * 客户端
 * 
 * @author yicai.liu
 */
public class Client
{

	public static void main(String[] args)
	{
		IWarehouse warehouse = WareHouseFactory.create(DE.class);
		warehouse.process();
	}

}
