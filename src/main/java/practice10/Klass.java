package practice10;


import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private int joinId;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public boolean isIn(Student student, List<Klass> classes) {
        boolean flag = false;
        for(int i=0;i<classes.size();i++){
            if(student.klass.getNumber()==classes.get(i).getNumber()){
                flag = true;
            }
        }
        return flag;
    }

    public Student getLeader() {
        return leader;
    }
    public void assignLeader(Student student){
        if(this.joinId!=student.getId()){
            System.out.print("It is not one of us.\n");
        }
        else {
            this.leader = student;
        }

    }

    public String getDisplayName() {
        return "Class "+this.number;

    }

    public void appendMember(Student student) {
//        System.out.println(student.getId());
        this.joinId = student.getId();

    }


}
