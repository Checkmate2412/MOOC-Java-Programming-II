
import java.util.ArrayList;
import java.util.Collections;

public class MagicSquare {

    private int[][] square;

    // ready constructor
    public MagicSquare(int size) {
        if (size < 2) {
            size = 2;
        }

        this.square = new int[size][size];
    }

    public ArrayList<Integer> sumsOfRows() {
        ArrayList<Integer> sum = new ArrayList<>();
        
        for (int row = 0; row < this.square.length; row++) {
            int totalRow = 0;
            for (int col = 0; col < this.square[row].length; col++) 
                totalRow += this.square[row][col];
            sum.add(totalRow);
        }
        
        return sum;
    }

    public ArrayList<Integer> sumsOfColumns() {
        ArrayList<Integer> sum = new ArrayList<>();
        for (int col = 0; col < this.square[0].length; col++) {
            int totalColumn = 0;
            for (int row = 0; row < this.square.length; row++) 
                totalColumn += this.square[row][col];
            sum.add(totalColumn);
        }
        return sum;
    }

    public ArrayList<Integer> sumsOfDiagonals() {
        ArrayList<Integer> sum = new ArrayList<>();
        int sumSameIndex = 0, sumNotSameIndex = 0;
        
        for (int row = 0; row < square.length; row++) {     
            for (int column = 0; column < square[row].length; column++) {
                if (row == column) {
                    int num = square[row][column];
                    sumSameIndex += num;                    
                }
                if ((row + column) == square.length - 1) {
                    int num2  = square[row][column];
                    sumNotSameIndex += num2;                    
                }
            }        
        }
        
        sum.add(sumSameIndex);
        sum.add(sumNotSameIndex);
        return sum;
    }

    // ready-made helper methods -- don't touch these
    public boolean isMagicSquare() {
        return sumsAreSame() && allNumbersDifferent();
    }

    public ArrayList<Integer> giveAllNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                numbers.add(square[row][col]);
            }
        }

        return numbers;
    }

    public boolean allNumbersDifferent() {
        ArrayList<Integer> numbers = giveAllNumbers();

        Collections.sort(numbers);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i - 1) == numbers.get(i)) {
                return false;
            }
        }

        return true;
    }

    public boolean sumsAreSame() {
        ArrayList<Integer> sums = new ArrayList<>();
        sums.addAll(sumsOfRows());
        sums.addAll(sumsOfColumns());
        sums.addAll(sumsOfDiagonals());

        if (sums.size() < 3) {
            return false;
        }

        for (int i = 1; i < sums.size(); i++) {
            if (sums.get(i - 1) != sums.get(i)) {
                return false;
            }
        }

        return true;
    }

    public int readValue(int x, int y) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return - 1;
        }

        return this.square[y][x];
    }

    public void placeValue(int x, int y, int value) {
        if (x < 0 || y < 0 || x >= getWidth() || y >= getHeight()) {
            return;
        }

        this.square[y][x] = value;
    }

    public int getWidth() {
        return this.square.length;
    }

    public int getHeight() {
        return this.square.length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                result.append(square[row][col]).append("\t");
            }

            result.append("\n");
        }

        return result.toString();
    }
}
