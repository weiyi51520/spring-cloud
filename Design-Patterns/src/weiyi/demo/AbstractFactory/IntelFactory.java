package weiyi.demo.AbstractFactory;

import weiyi.demo.AbstractFactory.cpu.Cpu;
import weiyi.demo.AbstractFactory.cpu.IntelCpu;
import weiyi.demo.AbstractFactory.mainboard.IntelMainboard;
import weiyi.demo.AbstractFactory.mainboard.Mainboard;
/**
 * ���󹤳�ģʽ Ϊһϵ���໥�����Ķ��󴴽�һ������
 * ���󹤳��İ���һ����Ʒ�崴��һ��������
 * �ŵ�:�ͻ���ֻ�������Ʒ�Ľӿڱ��,�л���Ʒ�巽�㡣
 * ȱ�㣺���Ӳ�Ʒ�ȼ�ʱ��Ҫ�޸����еĹ���ʵ����
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
