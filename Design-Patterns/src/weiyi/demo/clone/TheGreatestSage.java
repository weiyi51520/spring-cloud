package weiyi.demo.clone;

import java.io.IOException;

/**
 * 浅克隆
 * @author weiyi
 *
 */
public class TheGreatestSage {
	private Monkey monkey = new Monkey();
	
	public void change() throws ClassNotFoundException, IOException{
		//Monkey copyMonkey = (Monkey) this.monkey.clone();//浅克隆
		Monkey copyMonkey = (Monkey) this.monkey.deepClone();//深克隆
		System.out.println("大圣本尊的生日是：" + monkey.getBirthDate());
        System.out.println("克隆的大圣的生日是：" + monkey.getBirthDate());
        System.out.println("大圣本尊跟克隆的大圣是否为同一个对象 " + (monkey == copyMonkey));
        System.out.println("大圣本尊持有的金箍棒 跟 克隆的大圣持有的金箍棒是否为同一个对象？ " + (monkey.getStaff() == copyMonkey.getStaff()));
	}
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		TheGreatestSage sage = new TheGreatestSage();
        sage.change();
	}
}
