package sectiona.week2.inheritanceexample;

public class Person {

    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display(){
        System.out.println("Name: " + this.name);
    }
}
