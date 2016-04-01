package cn.learning.lyc.ChainOfResponsibility;

/**
 * 纯的责任链具体处理对象只能选择两个行为中一个：1 承担责任 2 传递责任给下一个节点 
 * 不纯的责任链，允许在一个具体处理对象中承担一部分责任后向下传递责任
 * 折扣处理器
 * 
 * @author yicai.liu
 * @version
 * @date 2016年2月25日 上午11:40:42
 */
public abstract class DiscountHandler
{
	// 后继节点
	private DiscountHandler successor;

	public void setSuccessor(DiscountHandler successor)
	{
		this.successor = successor;
	}

	public void discount(float price)
	{
		successor.discount(price);
	}

}
