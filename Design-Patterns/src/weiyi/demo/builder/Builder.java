package weiyi.demo.builder;
/**
 * 抽象建造者类Builder
 * 一般来说产品所包含的零件数与建造方法的数目相符
 * @author weiyi
 */
public interface Builder {
	
	public void buildPart1();
	
	public void buildPart2();
	
	public Product retrieveResult();
}
