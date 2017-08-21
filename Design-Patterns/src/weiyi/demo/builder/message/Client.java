package weiyi.demo.builder.message;

import weiyi.demo.builder.Product;

/**
 * �ͻ���
 * @author weiyi
 */
public class Client {
	/**
	 * ����ģʽ��Ϊ������
	 * 1.Builder�ӿ� ���ﶨ�����鹵������������
	 * 2.Director �����Ϲ�����Ʒ
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ͻ��˸�����Ҫ������Ҫ�Ľ�����
		Builder builder = new WelcomeBuilder();
		//�����������뵼����
	    Director director = new Director(builder);
	    //���ݸ��ݽ�����������װ���������Ʒ,������û�з��ز�Ʒ,����ֱ�ӵ��ù��ܷ���message
	    director.construct("toAddress@126.com", "fromAddress@126.com");
	}
}
