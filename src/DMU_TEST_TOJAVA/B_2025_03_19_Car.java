package DMU_TEST_TOJAVA;

public class B_2025_03_19_Car {
	protected String color;
	protected int speed=0;
	static int carCount=0;
	final static int MAXSPEED=200;
	final static int MINSPEED=0;
	
	static int currentCarCount() {
		return carCount;
	}
	
	B_2025_03_19_Car(){}
	B_2025_03_19_Car(String color ,int speed ){
		this.color=color;
		this.speed=speed;
	}
	
	
	int getSpeed() {
		return speed;
	}
	
	int upSpeed(int value) {
		speed = speed+value;
		if (speed>200)
			speed=200;
		return speed;
	
			
	}
	
	int downSpeed(int value) {
		speed=speed-value;
		if (speed<0);
			speed=0;
		return speed;	
			
		
	}
	
	String getColor() {
		return color;
	}
	

	

}
