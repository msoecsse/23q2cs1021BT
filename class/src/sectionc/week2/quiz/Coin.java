package sectionc.week2.quiz;

public class Coin implements ObjectOfChance{
    private int sides;
    private int value = 1;

    Coin(int sides){
        this.sides = sides;
    }

    
    public int observe() {
        return value;
    }

    @Override
    public void manipulate() {
        this.value = (int)(Math.random()*sides+1);
    }
}
