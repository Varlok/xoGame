import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

    private static final char X_CHAR = 'X';

    private static final char O_CHAR = 'O';

    private static final int NUM_FOR_EXIT = 9;

    public static void game() throws IOException {

        Field field = new Field();

        field.newGame();

        char turn = X_CHAR;

        while(true){

            field.getField();

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int num1 = Integer.parseInt(reader.readLine())-1;
            if(num1 > NUM_FOR_EXIT){
                break;
            }
            int num2 = Integer.parseInt(reader.readLine())-1;



            if(field.newTurn(num1, num2, turn))
            {
                if(field.checkWin(turn))                 //проверка на победу
                {
                    System.out.println("Выйграл игрок:" + turn);
                }
                else
                {
                    System.out.println("Следующий ход");

                    if(turn == X_CHAR){			//смена символа х/о
                        turn = O_CHAR;			//
                    }							//
                    else{						//
                        turn = X_CHAR;
                    }
                }				//конец смены х/о
            }
            else
            {
                System.out.println("Иди домой");
            }
        }
    }







    public static void main(String[] args) throws IOException {



        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int swit = Integer.parseInt(reader.readLine());

        boolean infiniSwitch = true;

        while(infiniSwitch){
            switch(swit){
                case 1: game();
                    break;
                case 2: infiniSwitch = false;
                    break;
                default: System.out.println("lol");
                    infiniSwitch = false;
                    break;
            }
        }
    }



}