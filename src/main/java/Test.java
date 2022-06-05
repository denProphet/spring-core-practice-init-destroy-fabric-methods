import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

       // test.testUniversityBean(context);
        test.testStudentBeans(context);
    }
    public void testStudentBeans(ClassPathXmlApplicationContext context){
        Student student1 = context.getBean("student", Student.class);
        Student student2 = context.getBean("student", Student.class);
        Student student3 = context.getBean("student", Student.class);

        System.out.println(student1.getName());

        context.close();
    }

    public void testUniversityBean(ClassPathXmlApplicationContext context){
        University university = context.getBean("university", University.class);

        System.out.println(university.getName());

        context.close();
    }
}
