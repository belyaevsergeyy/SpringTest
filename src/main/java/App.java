import by.it.Group;
import by.it.Student;
import by.itstep.HelloWorld;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext appContext =
                new ClassPathXmlApplicationContext("app.xml");
        HelloWorld helloWorld = appContext.getBean("helloWorld", HelloWorld.class);
//        Student student = appContext.getBean("student", Student.class);
        Group group = appContext.getBean("group", Group.class);
//        student.setName("Aleksei");
//        student.setGroup("it.step");
//        student.setBall(8D);

//        helloWorld.setHelloMessage("Hello I");
//        System.out.println(helloWorld);
//        group.addStudent(student);
        for (int i = 0; i < 10; i++) {
            Student student = appContext.getBean("student", Student.class);
            student.setName("Aleksei" + i);
            student.setGroup("it.step");
            student.setBall(8D);
            group.addStudent(student);
        }
        System.out.println(group);
    }


}
