package DMU_TEST_TOJAVA;

//  필드 캡슐화란?
// 클래스의 **필드(변수)**를 private으로 숨기고,
// 접근은 getter와 setter 메서드로 하게 만드는 것

public class B_2025_04_16_Student {
    //1. 속성=>이름,학번,학과,과목
    private String name;
    private String hb;
    private String dept;
    private String gwamok;
    //2. 생성자
    public B_2025_04_16_Student(){}
    public B_2025_04_16_Student(String name, String hb, String dept, String gwamok) {
        this.name = name;
        this.hb = hb;
        this.dept = dept;
        this.gwamok = gwamok;
    }
    //3. 메소드=> getter/setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getHb() {
        return hb;
    }
    public void setHb(String hb) {
        this.hb = hb;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public String getGwamok() {
        return gwamok;
    }
    public void setGwamok(String gwamok) {
        this.gwamok = gwamok;
    }
    @Override
    public String toString() {
        return "B_2025_04_16_Student [name=" + name + ", hb=" + hb + ", dept=" + dept + ", gwamok=" + gwamok + "]";
    }
    
    
   


}

//toString()-> 자동으로 하는 법 혼자 해보기!


