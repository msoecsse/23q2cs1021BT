package sectionb.week2.quiz.inheritanceexample;

public class Employee extends Person{

    private int ID;

    public Employee(String name, int ID){
        super(name);
        this.ID = ID;
    }

    public void display(){
        System.out.println("Name: " + this.getName() + " ID: " + this.ID);
    }

    @Override
    public boolean equals(Object o){
        if(o==null){
            return false;
        }
        if(o==this){
            return true;
        }
        if(!(o instanceof Employee)){
            return false;
        }

        return super.equals(o) &&
                this.ID == ((Employee)o).ID;

    }

}
