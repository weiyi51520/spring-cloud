package weiyi.demo.AbstractFactory.cpu;

public class IntelCpu implements Cpu {
	/**
	 * CPUÕë½ÅÊı
	 */
	private int pins=0;
	
	public IntelCpu(int pins) {
		this.pins = pins;
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("Intel CPUµÄÕë½ÅÊı:"+pins);
	}
	
}
