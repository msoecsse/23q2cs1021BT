package sectiona.week2.quiz;

public class Dice implements ObjectOfChance{

    private int sides;
    private int value;

    Dice(int sides){
        this.sides = sides;
        this.manipulate();
    }


    @Override
    public int observe() {
        return this.value;
    }

    @Override
    public void manipulate() {
        this.value = (int)(Math.random()*sides) +1;
    }
}
