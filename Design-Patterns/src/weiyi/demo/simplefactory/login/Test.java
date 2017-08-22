package weiyi.demo.simplefactory.login;
/**
 * 简单工厂模式
 * 由LoginManager来决定创建的登录实例类型
 * 优点:核心是工厂类 根据业务创建登录验证类型 
 * 缺点:所有业务逻辑集中在工厂类中,业务复杂时过于集中
 * @author weiyi
 *
 */
public class Test {
	public static void main(String[] args) {
		String loginType = "password";
		Login login = LoginManager.factory(loginType);
		boolean verfy = login.verify("weiyi", "123123");
		if(verfy){
			//登录成功
		}else{
			//登录失败
		}
	}
}
