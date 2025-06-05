package DMU_TEST_TOJAVA;

public class B_2025_03_12_practice_1 {

	public static void main(String[] args) {
		int one[]=new int[3];	// 배열 요소들은 자동으로 0으로 초기화됩니다 (자바에서 int 타입 기본값은 0).
		for (int i = 0 ; i<one.length; i++) {
			one[i] = 10*i;
		}
		
		String two[] = {"하나","둘","셋"};
		for (String item : two) {
			System.out.println(item);
		}
		int j=0;
		while(j < one.length) {
			System.out.println(one[j]);
			j++;
		}

	}

}
