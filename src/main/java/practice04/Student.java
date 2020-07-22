package practice04;

public class Student extends Person{
    protected int klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    @Override
    public String introduce() {
        String str = basicIntroduce();
        str += " I am a Student. I am at Class "+klass+".";
        return str;
    }

    public int getKlass() {
        return klass;
    }
}
