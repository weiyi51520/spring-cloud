package weiyi.demo.simplefactory.login;
/**
 * 抽象产品
 * @author weiyi
 *
 */
public interface Login {
	//登录验证
	public boolean verify(String name,String password);
}
