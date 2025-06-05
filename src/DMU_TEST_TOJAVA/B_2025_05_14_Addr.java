package DMU_TEST_TOJAVA;

import java.time.LocalDateTime;

public class B_2025_05_14_Addr {

    private String name;
    private String tel;
    private String com;
    private LocalDateTime createDate;
    public B_2025_05_14_Addr(String name, String tel, String com, LocalDateTime createDate) {
        this.name = name;
        this.tel = tel;
        this.com = com;
        this.createDate = createDate;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getCom() {
        return com;
    }
    public void setCom(String com) {
        this.com = com;
    }
    public LocalDateTime getCreateDate() {
        return createDate;
    }
    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }
    @Override
    public String toString() {
        return "B_2025_05_14_Addr [name=" + name + ", tel=" + tel + ", com=" + com + ", createDate=" + createDate + "]";
    }
    
}
