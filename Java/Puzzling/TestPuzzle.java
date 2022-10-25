import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestPuzzle {
    public static void main(String[] args) {
        Puzzle Rand = new Puzzle();
        ArrayList<Integer> Randomz = Rand.getTenRolls();
        // System.out.println(Randomz);
        // -----------------------------------------
        // System.out.println(Rand.getRandomLetter());
        // -----------------------------------------
        // System.out.println(Rand.generatePassword());
        System.out.println(Rand.getNewPasswordSet(8));



    }
    
}



