package weiyi.demo.AbstractFactory.mainboard;

public class AmdMainboard implements Mainboard {
	/**
     * CPU��۵Ŀ���
     */
    private int cpuHoles = 0;
    /**
     * ���췽��������CPU��۵Ŀ���
     * @param cpuHoles
     */
    public AmdMainboard(int cpuHoles){
        this.cpuHoles = cpuHoles;
    }
    @Override
    public void installCPU() {
        // TODO Auto-generated method stub
        System.out.println("AMD�����CPU��ۿ����ǣ�" + cpuHoles);
    }

}
