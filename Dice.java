import java.util.Random;

class Dice{

    Random rand;

    public Dice()
    {
        rand = new Random();
    }

    public int rollDice()
    {
        int roll = rand.nextInt(6)+1;
        return roll;
    }
    public static void main(String[] args) {

        System.out.println("After rolling dice we get the numbers: ");
        Dice dice = new Dice();
        System.out.println(dice.rollDice());
        System.out.println(dice.rollDice());

    }
}