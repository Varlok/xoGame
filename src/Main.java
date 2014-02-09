import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{

    private static final char xChar = 'X';

    private static final char oChar = 'O';

    public static void game() throws IOException {
        Field field = new Field();

        field.newGame();

        boolean infiniGame = true;
        char turn = xChar;




        while(infiniGame){
            field.getField();

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int num1 = Integer.parseInt(reader.readLine())-1;
            if(num1 > 9){
                infiniGame = false;
            }
            int num2 = Integer.parseInt(reader.readLine())-1;



            if(field.newTurn(num1, num2, turn))
            {
                if(field.checkWin(turn))
                {
                    System.out.println("Выйграл игрок:" + turn);
                }
                else
                {

                    System.out.println("Следующий ход");

                    if(turn == xChar){			//смена символа х/о
                        turn = oChar;			//
                    }							//
                    else{						//
                        turn = xChar;
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