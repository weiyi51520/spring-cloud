package weiyi.demo.builder;

public class Director {
	/**
	 * 需要使用的建造器
	 */
	private Builder builder;
	/**
	 * 传入建造器对象
	 * @param builder
	 */
	public Director(Builder builder) {
		// TODO Auto-generated constructor stub
		this.builder = builder;
	}
	/**
	 * 指挥类的产品构造方法,负责按步骤调用零件建造方法构建产品
	 */
	public void construct(){
		builder.buildPart1();
		builder.buildPart2();
	}
}
