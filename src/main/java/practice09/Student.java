package practice09;


public class Student extends Person{
    protected Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        String str = super.introduce();
        if(this==klass.getLeader()){
            str += " I am a Student. I am Leader of Class "+klass.getNumber()+".";
        }
        else {
            str += " I am a Student. I am at Class "+klass.getNumber()+".";
        }
        return str;
    }
}
