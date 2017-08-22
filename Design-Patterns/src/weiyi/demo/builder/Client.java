package weiyi.demo.builder;
/**
 * 客户端
 * @author weiyi
 *
 */
public class Client {
	
	public static void main(String[] args) {
		//创建具体建造者
		Builder builder = new ConcreteBuilder();
		//创建导演者,并把具体建造者传给指挥者
		Director director = new Director(builder);
		//导演者创建具体产品
		director.construct();
		//客户端接受产品
		Product product = builder.retrieveResult();
		System.out.println(product.getPart1());
		System.out.println(product.getPart2());
	}
}
