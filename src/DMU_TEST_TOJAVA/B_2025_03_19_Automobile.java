package DMU_TEST_TOJAVA;

public class B_2025_03_19_Automobile extends B_2025_03_19_Car  {
	
	private int seatNum;
	
	B_2025_03_19_Automobile(){}
	
	B_2025_03_19_Automobile(String color,int speed,int seatNum){
		super(color,speed);
		this.seatNum=seatNum;
	}
	
	int upSpeed(int value) {
		speed = speed+value;
		if (speed>300)
			speed=300;
		return speed;
	}
		

	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	
	

}
