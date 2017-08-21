package weiyi.demo.simplefactory.pc.mainboard;

public class IntelMainboard implements Mainboard{
	/**
	 * CPU插槽的孔数
	 */
	private int cpuHoles =0;
	
	public IntelMainboard(int cpuHoles) {
		super();
		this.cpuHoles = cpuHoles;
	}
	@Override
	public void installCPU() {
		// TODO Auto-generated method stub
		System.out.println("Intel主板的CPU插槽孔数是:"+cpuHoles);
	}
	
}
