package DMU_TEST_TOJAVA;

public class B_2025_03_19_Exam09 {

	public static void main(String[] args) {

		B_2025_03_19_Automobile auto1=new B_2025_03_19_Automobile();
		System.out.println(auto1.getColor()+", "+auto1.getSpeed()+", "+auto1.getSeatNum());
		
		B_2025_03_19_Automobile pors=new B_2025_03_19_Automobile("황금",0,2);
		B_2025_03_19_Automobile benz = new B_2025_03_19_Automobile("흰색",0,4);
		B_2025_03_19_Automobile gene=new B_2025_03_19_Automobile("빨간색",0,6);
		
		
		System.out.println(pors.getColor() + ", " + pors.getSpeed() + ", " + pors.getSeatNum());
		
		System.out.println(benz.getColor() + ", " + benz.getSpeed() + ", " + benz.getSeatNum());
		
		System.out.println(gene.getColor() + ", " + gene.getSpeed() + ", " + gene.getSeatNum());
		
		B_2025_03_19_Car iucCar = new B_2025_03_19_Car("파랑", 0);
		iucCar.upSpeed(300);
		pors.upSpeed(300);

		System.out.println(iucCar.getColor() + ", " + iucCar.getSpeed());
		System.out.println(pors.getColor() + ", " + pors.getSpeed() + ", " + pors.getSeatNum());
		

	}

}
