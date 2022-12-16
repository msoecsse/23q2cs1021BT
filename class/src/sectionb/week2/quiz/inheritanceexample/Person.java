package sectionb.week2.quiz.inheritanceexample;

public class Person {

    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o){
        if(o==null){
            return false;
        }
        if(o==this){
            return true;
        }
        if(!(o instanceof Person)){
            return false;
        }

        return getName().equals(((Person) o).getName());

    }
}
