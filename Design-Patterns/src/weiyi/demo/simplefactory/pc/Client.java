package weiyi.demo.simplefactory.pc;
/**
 * �򵥹���ģʽ ʵ����װ�� ����cpu �� mainboard ����Ϲ�ϵû������
 * @author Administrator
 *
 */
public class Client {
	public static void main(String[] args) {
		ComputerEngineer cf  = new ComputerEngineer();
		cf.makeComputer(1, 1);
	}
}
