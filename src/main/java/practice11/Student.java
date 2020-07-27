package practice11;



public class Student extends Person implements Obserable {
    protected Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
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

    @Override
    public void update() {

    }
}
