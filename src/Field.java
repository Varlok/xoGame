import java.io.IOException;

public class Field{

    private static final int FIELD_SIZE = 3;

    private char[][] field = new char[FIELD_SIZE][FIELD_SIZE];

	
	
    private static final char DEFAULT = ' ';

    public void getField(){
        for(int i=0;i<FIELD_SIZE;i++){
            getLine(i);
            System.out.println("");
        }
    }

    public void getLine(int line){
        for(int i=0;i<FIELD_SIZE;i++){
            System.out.print("[" + field[line][i] + "]");
        }
    }

    public boolean newTurn(int x, int y, char value) {

        if(field[x][y] == DEFAULT){
            field[x][y] = value;
            return true;
        }
        else{

            return false;
        }
    }

    public void newGame() {
        for(int i=0;i<FIELD_SIZE;i++){
            newLine(i);
        }
    }

    public void newLine(int line) {
        for(int i=0;i<FIELD_SIZE;i++){
            field[line][i] = DEFAULT;
        }
    }

    public boolean checkWin(char xoChar)
    {
        //проверка по линии
        for(int i=0;i<FIELD_SIZE;i++)
        {
            if((field[i][0] == xoChar) & (field[i][1] == xoChar) & (field[i][2] == xoChar))
            {
                return true;
            }
        }
        //проверка по столбцу
        for(int i=0;i<FIELD_SIZE;i++)
        {
            if((field[0][i] == xoChar) & (field[1][i] == xoChar) & (field[2][i] == xoChar))
            {
                return true;
            }
        }

        //проверка по \
        if(field[0][0] == xoChar && field[1][1] == xoChar && field[2][2] == xoChar)
        {
            return true;
        }
        // проверка по /

        if(field[2][0] == xoChar && field[1][1] == xoChar && field[0][2] == xoChar)
        {
            return true;
        }
        return false;

    }


}