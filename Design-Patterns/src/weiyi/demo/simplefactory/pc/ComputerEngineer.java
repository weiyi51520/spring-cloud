package weiyi.demo.simplefactory.pc;

import weiyi.demo.simplefactory.pc.cpu.Cpu;
import weiyi.demo.simplefactory.pc.mainboard.Mainboard;

/**
 * װ������ʦ��
 * @author Administrator
 *
 */
public class ComputerEngineer {
	/**
	 * װ����Ҫ��CPU
	 */
	private Cpu cpu = null;
	/**
	 * װ����Ҫ������
	 */
	private Mainboard mainboard = null;
	
	public void makeComputer(int cpuType , int mainboard){
        /**
         * ��װ�����Ļ�������
         */
        //1:����׼����װ������Ҫ�����
        prepareHardwares(cpuType, mainboard);
        //2:��װ����
        //3:���Ի���
        //4�������ͻ�
    }
	private void prepareHardwares(int cpuType , int mainboard){
        //����Ҫȥ׼��CPU������ľ���ʵ�֣�Ϊ��ʾ���򵥣�����ֻ׼��������
        //���ǣ�װ������ʦ����֪�����ȥ��������ô���أ�
        
        //ֱ������Ӧ�Ĺ�����ȡ
        this.cpu = CpuFactory.createCpu(cpuType);
        this.mainboard = MainboardFactory.createMainboard(mainboard);
        
        //��������Ƿ����
        this.cpu.calculate();
        this.mainboard.installCPU();
	}
}
