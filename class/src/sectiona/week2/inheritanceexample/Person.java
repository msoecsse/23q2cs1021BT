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

    @Override
    public boolean equals(Object o){
        if(o==null){
            return false;
        }
        if(o == this){
            return true;
        }
        if(!(o instanceof Person)){
            return false;
        }

        return ((Person)o).getName().equals(this.getName());


    }
}
