package practice04;

public class Worker extends Person{
    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        String str = "My name is "+name+". I am "+age+" years old. I am a Worker. I have a job.";
        return str;
    }

}
