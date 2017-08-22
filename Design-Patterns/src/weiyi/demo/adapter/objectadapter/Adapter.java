package weiyi.demo.adapter.objectadapter;

/**
 * @author weiyi
 *适配器角色Adapter扩展了Adaptee,同时又实现了目标(Target)接口
 */
public class Adapter {
	private Adaptee adaptee;
    
    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }
    /**
     * 源类Adaptee有方法sampleOperation1
     * 因此适配器类直接委派即可
     */
    public void sampleOperation1(){
        this.adaptee.sampleOperation1();
    }
    /**
     * 源类Adaptee没有方法sampleOperation2
     * 因此由适配器类需要补充此方法
     */
    public void sampleOperation2(){
        //写相关的代码
    }
}
