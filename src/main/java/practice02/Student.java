package practice02;

public class Student extends Person{
    protected int klass;
    @Override
    public String introduce(){
        String str = "I am a Student. I am at Class "+klass+".";
        return str;
    }

    public int getKlass() {
        return klass;
    }

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }
}
