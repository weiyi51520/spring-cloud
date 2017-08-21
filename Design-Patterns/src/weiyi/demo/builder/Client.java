package weiyi.demo.builder;
/**
 * �ͻ���
 * @author weiyi
 *
 */
public class Client {
	
	public static void main(String[] args) {
		//�������彨����
		Builder builder = new ConcreteBuilder();
		//����������,���Ѿ��彨���ߴ���ָ����
		Director director = new Director(builder);
		//�����ߴ��������Ʒ
		director.construct();
		//�ͻ��˽��ܲ�Ʒ
		Product product = builder.retrieveResult();
		System.out.println(product.getPart1());
		System.out.println(product.getPart2());
	}
}
