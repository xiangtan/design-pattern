package cn.learning.lyc.ChainOfResponsibility;

/**
 * 销售
 * 
 * @author yicai.liu
 * @version
 * @date 2016年2月25日 下午12:18:20
 */
public class Sales extends DiscountHandler
{

	@Override
	public void discount(float price)
	{
		if (price <= 0.05)
		{
			System.out.println("销售打折：" + price);
			return;
		}
		super.discount(price);
	}

}
