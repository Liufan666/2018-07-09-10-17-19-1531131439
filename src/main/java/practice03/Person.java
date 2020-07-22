package practice03;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String introduce(){

        String str = "My name is "+name+". I am "+age+" years old.";
        return str;
    }
}
