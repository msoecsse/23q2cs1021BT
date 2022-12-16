package sectionc.week2.inheritanceexample;

public class Employee extends Person{

    private int ID;
    protected String name;

    public Employee(String name, int ID){
        super(name);
        this.ID = ID;
    }

    public void display(){
        super.display();
        System.out.println(" ID: " + this.ID);
    }

    @Override
    public boolean equals(Object o){
        if(o == null){
            return false;
        }
        if(o == this){
            return true;
        }
        if(!(o instanceof Employee)){
            return false;
        }

        return super.equals(o) && ((Employee)o).ID == this.ID;

    }

}
