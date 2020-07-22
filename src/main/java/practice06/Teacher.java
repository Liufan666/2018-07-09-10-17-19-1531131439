package practice06;

public class Teacher extends Person{
    protected int klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
        this.klass = 0;
    }

    @Override
    public String introduce() {
        String str = super.introduce();
        if(klass==0){
            str += " I am a Teacher. I teach No Class.";
        }
        else {
            str += " I am a Teacher. I teach Class "+klass+".";
        }

        return str;
    }

    public int getKlass() {
        return klass;
    }
}
