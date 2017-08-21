package weiyi.demo.AbstractFactory;

import weiyi.demo.AbstractFactory.cpu.Cpu;
import weiyi.demo.AbstractFactory.mainboard.Mainboard;

/**
 * 抽象工厂模式 针对的是拥有多个产品等级结构的需求
 * 产品族和产品级
 * 产品族:功能相关联的不同产品等级的一套产品，如 AMD的主板、芯片、CPU组成一个产品族;Intel 的系列对应组成一个产品族
 * 产品等级:一个产品等级是由相同结构的不同族的产品组成 如 ：ADM的主板 和 Intel的主板 组成一个产品等级 都是主板
 * 使用多态工厂模式时,一个产品等级就要用一个工厂
 * 使用抽象工厂模式,一个产品族使用一个工厂
 * @author weiyi
 */
public interface AbstractFactory {
	/**
	 * 创建CPU对象
	 * @return
	 */
	public Cpu createCpu();
	/**
	 * 创建主板对象
	 * @return
	 */
	public Mainboard createMainboard();
	
}
