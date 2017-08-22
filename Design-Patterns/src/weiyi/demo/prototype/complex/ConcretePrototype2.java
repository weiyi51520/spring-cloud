package weiyi.demo.prototype.complex;

import weiyi.demo.prototype.complex.Prototype;

public class ConcretePrototype2 implements Prototype {
	private String name;
	
	@Override
	public Prototype clone(){
		ConcretePrototype2 prototype = new ConcretePrototype2();
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
		return "ConcretePrototype2 [name=" + name + "]";
	}
	
}
