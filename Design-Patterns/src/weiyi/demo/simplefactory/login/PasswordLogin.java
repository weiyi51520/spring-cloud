package weiyi.demo.simplefactory.login;
/**
 * 具体产品
 * @author weiyi
 *
 */
public class PasswordLogin implements Login {

	@Override
	public boolean verify(String name, String password) {
		// TODO Auto-generated method stub
		/**
		 * 业务逻辑
		 */
		return true;
	}

}
