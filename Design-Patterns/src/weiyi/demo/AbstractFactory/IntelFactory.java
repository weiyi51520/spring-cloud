package weiyi.demo.AbstractFactory;

import weiyi.demo.AbstractFactory.cpu.Cpu;
import weiyi.demo.AbstractFactory.cpu.IntelCpu;
import weiyi.demo.AbstractFactory.mainboard.IntelMainboard;
import weiyi.demo.AbstractFactory.mainboard.Mainboard;
/**
 * 抽象工厂模式 为一系列相互依赖的对象创建一个工厂
 * 抽象工厂的按照一个产品族创建一个工厂类
 * 优点:客户端只是面向产品的接口编程,切换产品族方便。
 * 缺点：增加产品等级时需要修改所有的工厂实现类
 * @author weiyi
 *
 */
public class IntelFactory implements AbstractFactory {

	@Override
	public Cpu createCpu() {
		// TODO Auto-generated method stub
		return new IntelCpu(755);
	}

	@Override
	public Mainboard createMainboard() {
		// TODO Auto-generated method stub
		return new IntelMainboard(755);
	}

}
