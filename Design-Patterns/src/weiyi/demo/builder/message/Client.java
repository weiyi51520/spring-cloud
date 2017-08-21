package weiyi.demo.builder.message;

import weiyi.demo.builder.Product;

/**
 * 客户端
 * @author weiyi
 */
public class Client {
	/**
	 * 建造模式分为两部分
	 * 1.Builder接口 这里定义了乳沟构建各个部件
	 * 2.Director 如何组合构建产品
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//客户端根据需要创建需要的建造器
		Builder builder = new WelcomeBuilder();
		//将建造器传入导演中
	    Director director = new Director(builder);
	    //导演根据建造器种类组装零件构建产品,在这里没有返回产品,而是直接调用功能发送message
	    director.construct("toAddress@126.com", "fromAddress@126.com");
	}
}
