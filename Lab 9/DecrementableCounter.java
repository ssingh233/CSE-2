package oop;

public class DecrementableCounter extends Counter {
public	int MyCount;
	public void decrement(){
	if (value() <0){
		value();
	}
	if (value() >0 ){
	 int n = value();
	reset();
	for(int i = 0; i < n -1;i++){
		increment();
	}
	}
	}

}