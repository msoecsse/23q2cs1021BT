package sectiona.week2.inheritanceexample;

public class Employee extends Person{

    private int ID;

    Employee(String name, int ID){
        super(name);
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    @Override
    public void display(){
        super.display();
        System.out.println(" ID " + ID);
    }

    @Override
    public boolean equals(Object o){
        if(o==null){
            return false;
        }
        if(o == this){
            return true;
        }
        if(!(o instanceof Employee)){
            return false;
        }

        return super.equals(o) && ((Employee)o).getID() == (this.getID());


    }



}
