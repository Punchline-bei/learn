package study5;

public class test {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.age=20;
        t.name="张三";
        System.out.println(t.name);
        System.out.println(t.age);
        t.teach();
        t.eat();
        t.sleep();
    }
}
