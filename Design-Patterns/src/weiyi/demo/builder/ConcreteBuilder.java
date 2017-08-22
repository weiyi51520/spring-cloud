package weiyi.demo.builder;
/**
 * 具体建造类 它们在应用程序调用下创建产品的实例
 * 1 实现抽象建造者声明的接口 2 在建造完成后提供产品的实例 
 * @author weiyi
 */
public class ConcreteBuilder implements Builder{

	private Product product = new Product();
	
	@Override
	public void buildPart1() {
		// TODO Auto-generated method stub
		product.setPart1("编号:9527");
	}

	@Override
	public void buildPart2() {
		// TODO Auto-generated method stub
		product.setPart2("名称:XXX");
	}

	@Override
	public Product retrieveResult() {
		// TODO Auto-generated method stub
		return product;
	}
	
}
