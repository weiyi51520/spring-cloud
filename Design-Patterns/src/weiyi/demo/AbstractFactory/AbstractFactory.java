package weiyi.demo.AbstractFactory;

import weiyi.demo.AbstractFactory.cpu.Cpu;
import weiyi.demo.AbstractFactory.mainboard.Mainboard;

/**
 * ���󹤳�ģʽ ��Ե���ӵ�ж����Ʒ�ȼ��ṹ������
 * ��Ʒ��Ͳ�Ʒ��
 * ��Ʒ��:����������Ĳ�ͬ��Ʒ�ȼ���һ�ײ�Ʒ���� AMD�����塢оƬ��CPU���һ����Ʒ��;Intel ��ϵ�ж�Ӧ���һ����Ʒ��
 * ��Ʒ�ȼ�:һ����Ʒ�ȼ�������ͬ�ṹ�Ĳ�ͬ��Ĳ�Ʒ��� �� ��ADM������ �� Intel������ ���һ����Ʒ�ȼ� ��������
 * ʹ�ö�̬����ģʽʱ,һ����Ʒ�ȼ���Ҫ��һ������
 * ʹ�ó��󹤳�ģʽ,һ����Ʒ��ʹ��һ������
 * @author weiyi
 */
public interface AbstractFactory {
	/**
	 * ����CPU����
	 * @return
	 */
	public Cpu createCpu();
	/**
	 * �����������
	 * @return
	 */
	public Mainboard createMainboard();
	
}
