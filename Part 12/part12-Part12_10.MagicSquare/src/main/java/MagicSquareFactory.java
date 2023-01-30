
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

        // implement the creation of a magic square with the Siamese method algorithm here
        int curRow = 0, curCol = size / 2;
        square.placeValue(curCol, curRow, 1);
        
        for (int i = 2; i <= (size * size); i++) {
            int row = curRow - 1, col = curCol + 1;
            
            if (row < 0)
                row = square.getHeight() - 1;
            
            if (col >= square.getWidth())
                col = 0;
            
            if (square.readValue(col, row) != 0)  {
                row = curRow + 1;
                col = curCol;
            }
            
            square.placeValue(col, row, i);
            curRow = row;
            curCol = col;
        }
        
        return square;
    }

}
