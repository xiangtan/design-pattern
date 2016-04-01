package cn.learning.lyc.ChainOfResponsibility;

/**
 * @author yicai.liu
 * @version
 * @date 2016年2月25日 下午2:22:00
 */
public class DiscountChain
{
	public static void process(float price)
	{
		DiscountHandler sales = new Sales();
		DiscountHandler manage = new Manage();
		DiscountHandler director = new Director();
		DiscountHandler vp = new VP();
		DiscountHandler ceo = new CEO();
		sales.setSuccessor(manage);
		manage.setSuccessor(director);
		director.setSuccessor(vp);
		vp.setSuccessor(ceo);
		sales.discount(price);
	}
}
