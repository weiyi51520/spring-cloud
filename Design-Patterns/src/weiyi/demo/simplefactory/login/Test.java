package weiyi.demo.simplefactory.login;
/**
 * �򵥹���ģʽ
 * ��LoginManager�����������ĵ�¼ʵ������
 * �ŵ�:�����ǹ����� ����ҵ�񴴽���¼��֤���� 
 * ȱ��:����ҵ���߼������ڹ�������,ҵ����ʱ���ڼ���
 * @author weiyi
 *
 */
public class Test {
	public static void main(String[] args) {
		String loginType = "password";
		Login login = LoginManager.factory(loginType);
		boolean verfy = login.verify("weiyi", "123123");
		if(verfy){
			//��¼�ɹ�
		}else{
			//��¼ʧ��
		}
	}
}
