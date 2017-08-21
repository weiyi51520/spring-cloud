package weiyi.demo.AbstractFactory.cpu;

public class AmdCpu implements Cpu {
	/**
	 * CPUÕë½ÅÊı
	 */
	private int pins =0;
	
	public AmdCpu(int pins) {
		super();
		this.pins = pins;
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("AMD CPUµÄÕë½ÅÊı:"+pins);
	}

}
