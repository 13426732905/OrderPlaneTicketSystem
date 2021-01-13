package cn.edu.hcnu.dto;

import java.util.Date;

public class Customer {
    private String id;//没有业务意义
    private String customerType;//乘客类型：成人、儿童、婴儿
    private String name;//乘客姓名
    private String phone;//乘客电话号码
    private String Idcard;//乘客身份证号码
    private Date birthDate;//乘客出生日期

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdcard() {
        return Idcard;
    }

    public void setIdcard(String idcard) {
        Idcard = idcard;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
