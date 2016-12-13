package pm.pojo;

import java.util.Date;

/**
 * Created by csu118 on 2016/12/12.
 */
public class Person {

    private int pid;
    private String name;
    private int age;
    private Date birthday;
    private String address;

    public Person() {
        super();
    }

    public Person(int pid, String name, int age, Date birthday, String address) {
        this.pid = pid;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.address = address;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
