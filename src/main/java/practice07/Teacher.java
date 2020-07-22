package practice07;

public class Teacher extends Person{
    protected Klass klass;

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;

    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        String str = super.introduce();
        if (klass==null){
            str += " I am a Teacher. I teach No Class.";
        }
        else{
            str += " I am a Teacher. I teach Class "+klass.getNumber()+".";
        }
        return str;
    }
    public String introduceWith(Student student){
        String str = super.introduce();
        if(this.klass.getNumber()==student.klass.getNumber()){
            str += " I am a Teacher. I teach "+student.getName()+".";
        }
        else {
            str += " I am a Teacher. I don't teach "+student.getName()+".";
        }
        return str;

    }
}
