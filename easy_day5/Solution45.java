package easy;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

class Student1 { // Corrected class name
    private String name;
    private String id;
    private String email;

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
public class Solution45 {
    public static void main(String[] args) throws Exception {
        Class<?> student = Class.forName("Student"); // Ensure the class name matches
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for (Method m : methods) {
            methodList.add(m.getName());
        }

        Collections.sort(methodList);
        for (String name : methodList) {
            System.out.println(name);
        }
    }
}
