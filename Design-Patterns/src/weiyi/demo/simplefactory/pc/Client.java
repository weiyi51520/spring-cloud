package weiyi.demo.simplefactory.pc;
/**
 * 简单工厂模式 实现了装机 但是cpu 和 mainboard 的组合关系没有限制
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		ComputerEngineer cf  = new ComputerEngineer();
		cf.makeComputer(1, 1);
	}
}
