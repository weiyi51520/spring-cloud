package weiyi.demo.simplefactory.pc.cpu;

public class AmdCpu implements Cpu {
	/**
	 * CPU�����
	 */
	private int pins =0;
	
	public AmdCpu(int pins) {
		super();
		this.pins = pins;
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("AMD CPU�������:"+pins);
	}

}
