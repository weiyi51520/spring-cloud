package weiyi.demo.simplefactory.pc.mainboard;

public class IntelMainboard implements Mainboard{
	/**
	 * CPU��۵Ŀ���
	 */
	private int cpuHoles =0;
	
	public IntelMainboard(int cpuHoles) {
		super();
		this.cpuHoles = cpuHoles;
	}
	@Override
	public void installCPU() {
		// TODO Auto-generated method stub
		System.out.println("Intel�����CPU��ۿ�����:"+cpuHoles);
	}
	
}
