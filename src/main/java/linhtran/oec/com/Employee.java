package linhtran.oec.com;

/**
 * Created by linhtran on 24/04/2017.
 */
public class Employee   {
    private  String name;
    private  String addr;
    private  double salary;
    private String phone;
    private  String emai;

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmai() {
        return emai;
    }

    public void setEmai(String emai) {
        this.emai = emai;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", salary=" + salary +
                ", phone='" + phone + '\'' +
                ", emai='" + emai + '\'' +
                '}';
    }
}
