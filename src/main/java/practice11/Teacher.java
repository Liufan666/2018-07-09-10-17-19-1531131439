package practice11;

import java.util.List;

public class Teacher extends Person implements Observer{
    protected List<Klass> classes;

    public Teacher(int id, String name, int age, List<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        classes.forEach(klass -> {
            klass.registerObserver(this);
        });
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }


    public List<Klass> getClasses() {
        return classes;
    }

    @Override
    public String introduce() {
        String str = super.introduce();
        if (classes == null) {
            str += " I am a Teacher. I teach No Class.";
        } else {
            str += " I am a Teacher. I teach Class ";
            for (int i = 0; i < classes.size(); i++) {
                str += classes.get(i).getNumber();
                if (i == classes.size() - 1) {
                    str += ".";
                } else {
                    str += ", ";
                }
            }

        }
        return str;
    }


    public boolean isTeaching(Student student) {
        return student.klass.isIn(student, classes);
    }

    public String introduceWith(Student student) {
        String str = super.introduce();
        if (isTeaching(student)) {
            str += " I am a Teacher. I teach " + student.getName() + ".";
        } else {
            str += " I am a Teacher. I don't teach " + student.getName() + ".";
        }
        return str;

    }

    public void update(Student student) {
        System.out.print(String.format("I am %s. I know %s has joined Class 2.",this.getName(),student.getName())+"\n");
    }
    @Override
    public void updateWithLeader(Student student) {
        System.out.print(String.format("I am %s. I know %s become Leader of Class 2.",this.getName(),student.getName())+"\n");
    }
}
