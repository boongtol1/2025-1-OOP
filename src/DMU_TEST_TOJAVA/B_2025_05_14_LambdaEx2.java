package DMU_TEST_TOJAVA;

interface MyFunction2 {
    int calc2(int x);

    
}

public class B_2025_05_14_LambdaEx2 {


    public static void main(String[] args) {

        MyFunction2 square = x -> x*x;

        System.out.println(square.calc2(2));
        
    }

    
    
}
