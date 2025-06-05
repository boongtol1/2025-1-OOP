package DMU_TEST_TOJAVA;

interface MyFunction {
    int calc(int x, int y);
    
}

public class B_2025_05_14_LambdaEx1 {

    public static void main(String[] args) {
        MyFunction add = (x, y) -> {return x + y;}; // 람다식으로 덧셈 구현
        MyFunction minus = (x, y) -> {return x - y;}; // 람다식으로 뺄셈 구현

        MyFunction multi = (x, y) -> {return x * y;}; // 람다식으로 곱셈 구현
        MyFunction div = (x, y) -> {return x / y;}; // 람다식으로 나눗셈 구현

        System.out.println(add.calc(1,2));
        System.out.println(minus.calc(1,2));
        System.out.println(multi.calc(1,2));
        System.out.println(div.calc(1,2));

    }



    
}
