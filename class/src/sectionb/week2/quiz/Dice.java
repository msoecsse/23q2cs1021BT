package sectionb.week2.quiz;

public class Dice implements ObjectOfChance {

    private int sides;
    private int currentValue;

    public Dice(int sides){
        this.sides = sides;
        this.manipulate();
    }

    public int observe() {
        return this.currentValue;
    }

    @Override
    public void manipulate() {
        this.currentValue = (int)(Math.random()*sides+1);
    }
}
