package com.shang.dp.adapter.ex;

/**
 * 对象适配器
 *
 */
public class Adapter2 implements Target{
	private Adaptee adaptee;
	
	public Adapter2(Adaptee adaptee){
		super();
		this.adaptee = adaptee;
	}
	@Override
	public void sampleOperation2() {
		/**
		 * bala bala...
		 */
	}

	@Override
	public void sampleOpeation1() {
		adaptee.sampleOpeation1();
	}

}
