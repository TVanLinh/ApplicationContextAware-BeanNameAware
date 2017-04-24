package linhtran.oec.com;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

/**
 * Created by linhtran on 24/04/2017.
 */
public class Department  implements ApplicationContextAware,BeanNameAware{
    private  String name;
    private  String id;
    private List<Employee> employees;
    String beanName;
    ApplicationContext applicationContext;
    public Department() {
    }

    public Department(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getBeanName() {
        return beanName;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public void printList()
    {
        for (Employee employee:this.employees)
        {
            System.out.println(employee);
        }
    }
    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override//name: name of bean
    public void setBeanName(String name) {
        System.out.println(name);
        this.beanName=name;
    }
}
