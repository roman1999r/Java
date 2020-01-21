import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Test test = new Test("Roman",20,"Mitkivskiy",031-855-452);
        System.out.println("Поля класу:");
        Class<Test> testClass = Test.class;
        Field[] declaredFields = testClass.getDeclaredFields();
        for (Field field :declaredFields) {
            System.out.println(field);
        }
        System.out.println("______________________");
        System.out.println("Методи класу:");
        Method[] declaredMethods = testClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);
        }
    }
}
