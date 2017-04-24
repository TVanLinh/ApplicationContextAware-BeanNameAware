package linhtran.oec.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by linhtran on 24/04/2017.
 */
public class Test {
    public static void main(String[] args) {
        String bean[]={"Inheritance.xml","bean.xml"};
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(bean);

//        Department department= (Department) applicationContext.getBean("depart1");
//        System.out.println(department);
//        department.setApplicationContext(applicationContext);
//        Department department2= (Department) department.getApplicationContext().getBean("depart2");
//        System.out.println(department2);
//        System.out.println(department.beanName);
//        System.out.println(department2.beanName);

        testInit(applicationContext);
    }

    public static  void testInit(ApplicationContext applicationContext)
    {
        //if abstract =false
//        Department departmentParent= (Department) applicationContext.getBean("parent");
//        departmentParent.printList();
        Department department= (Department) applicationContext.getBean("child");
        department.printList();
    }
}
