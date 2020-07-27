package practice11;



import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Observer> observers = new ArrayList<>();
    private List<Obserable> obserables = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public boolean isIn(Student student,List<Klass> classes) {
        boolean flag = false;
        for (int index=0;index<classes.size();index++) {
            if(classes.get(index).getNumber() == student.getKlass().getNumber()){
                flag = true;
            }

        }
        return flag;
    }

    public Student getLeader() {
        return leader;
    }
    public void assignLeader(Student student){
        if(!obserables.contains(student)){
            System.out.print("It is not one of us.\n");
        }
        else {
            this.leader = student;
            this.observers.forEach(observer -> {
                observer.updateWithLeader(student);
            });
        }

    }

    public String getDisplayName() {
        return "Class "+this.number;

    }


    public void appendMember(Student student){
        student.setKlass(this);
        registerObserable(student);
        this.observers.forEach(observer -> {
            observer.update(student);
        });
    }
    public void registerObserver(Teacher teacher){
        this.observers.add(teacher);

    }
    public void registerObserable(Student student){
        this.obserables.add(student);

    }

}
