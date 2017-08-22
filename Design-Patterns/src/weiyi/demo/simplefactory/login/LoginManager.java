package weiyi.demo.simplefactory.login;
/**
 * 工厂类
 * @author Administrator
 *
 */
public class LoginManager {
	public static Login factory(String type){
		if(type.equals("password")){
			return new PasswordLogin();
		}else if(type.equals("Domain")){
			return new DomainLogin();
		}else{
			/**
			 * 这里可抛出自定义异常
			 */
			throw new RuntimeException("没有找到登录类型");
		}
	}
	
	
}
