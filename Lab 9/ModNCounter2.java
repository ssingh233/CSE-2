package oop;

public class ModNCounter2 extends Counter {

	private int cycleLength;
	
	public ModNCounter2 (int a){
		cycleLength = a;
	}
	
	public int value() {
		if (super.value()== cycleLength){
			super.reset();
		}
		return super.value();
	}
}
