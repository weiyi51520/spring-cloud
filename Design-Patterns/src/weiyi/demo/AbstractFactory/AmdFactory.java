package weiyi.demo.AbstractFactory;

import weiyi.demo.AbstractFactory.cpu.AmdCpu;
import weiyi.demo.AbstractFactory.cpu.Cpu;
import weiyi.demo.AbstractFactory.mainboard.AmdMainboard;
import weiyi.demo.AbstractFactory.mainboard.Mainboard;

public class AmdFactory implements AbstractFactory {

	@Override
	public Cpu createCpu() {
		// TODO Auto-generated method stub
		return new AmdCpu(938);
	}

	@Override
	public Mainboard createMainboard() {
		// TODO Auto-generated method stub
		return new AmdMainboard(938);
	}

}
