package weiyi.demo.builder;
/**
 * 产品角色
 * 一个系统一般会有多以一个的产品类,这些产品可以是不相关联的
 * @author weiyi
 */
public class Product {
	
	private String part1;
	private String part2;
	public String getPart1() {
		return part1;
	}
	public void setPart1(String part1) {
		this.part1 = part1;
	}
	public String getPart2() {
		return part2;
	}
	public void setPart2(String part2) {
		this.part2 = part2;
	}
	@Override
	public String toString() {
		return "Product [part1=" + part1 + ", part2=" + part2 + "]";
	}
	
}
