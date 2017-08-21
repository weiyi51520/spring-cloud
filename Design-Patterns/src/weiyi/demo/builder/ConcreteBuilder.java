package weiyi.demo.builder;
/**
 * ���彨���� ������Ӧ�ó�������´�����Ʒ��ʵ��
 * 1 ʵ�ֳ������������Ľӿ� 2 �ڽ�����ɺ��ṩ��Ʒ��ʵ�� 
 * @author weiyi
 */
public class ConcreteBuilder implements Builder{

	private Product product = new Product();
	
	@Override
	public void buildPart1() {
		// TODO Auto-generated method stub
		product.setPart1("���:9527");
	}

	@Override
	public void buildPart2() {
		// TODO Auto-generated method stub
		product.setPart2("����:XXX");
	}

	@Override
	public Product retrieveResult() {
		// TODO Auto-generated method stub
		return product;
	}
	
}
