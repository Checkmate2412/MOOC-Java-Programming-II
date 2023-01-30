
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        this.numbers = new ArrayList<>();
        
        while (true) {            
            if (this.numbers.size() == 7)
                break;
            
            int rand = new Random().nextInt(41);
            if (!this.containsNumber(rand) && rand != 0)
                this.numbers.add(rand);
        }
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
}

