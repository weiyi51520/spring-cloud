package weiyi.demo.prototype.complex;

import weiyi.demo.prototype.complex.Prototype;

public class ConcretePrototype1 implements Prototype {
	private String name;
	
	@Override
	public Prototype clone(){
		ConcretePrototype1 prototype = new ConcretePrototype1();
		prototype.setName(this.name);
		return prototype;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}

	@Override
	public String toString() {
		return "ConcretePrototype1 [name=" + name + "]";
	}
	
}
