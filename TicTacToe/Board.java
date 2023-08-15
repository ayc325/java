/*
Angela Cui
CSE007 Section 010
Nov. 6, 2021
By the end of this assignment, you should be able to create, initialize and manipulate multidimensional arrays representing a well-known game.
*/
import java.util.*;
public class Board {
    private String [][] gameboard = new String [3][3];
    public Board(){
        int spaces = 1;
        for(int row = 0; row < gameboard.length; row++){
            for(int col = 0; col < gameboard[row].length; col++){
                gameboard[row][col] = "" + (spaces++);
            }
        }
    }

    public void printBoard(){
        for (int row = 0; row < gameboard.length; row++){
            for(int col = 0; col < gameboard[row].length; col++){
                System.out.print(gameboard[row][col] + " ");
            }
              System.out.println();
            }
    }

    public String checkSpace(Scanner scnr){
        //System.out.println("We are in checkSpace");
        //check if they gave a number 1-9 
        // a letter is an error
        boolean check = false;
        boolean check2 = false;
        boolean check3 = false;
        int spaceNum = 0;
        String pos = "no";
        do{
            System.out.println("Enter an integer from 1-9");
            check  = scnr.hasNextInt();
            if(check == true){
                spaceNum = scnr.nextInt();
                do{
                    if(spaceNum > 0 && spaceNum < 10){
                        check2 = true;
                        break;
                    }
                    else{
                        scnr.nextLine();
                        System.out.println("Invalid, try again. Value not between 1-9");
                        spaceNum = scnr.nextInt();
                        check2 = false;
                    }
                }while(!check2);
                break;
            }
            else{
                scnr.nextLine();
                System.out.println("Invalid, try again");
                check = false;
            }
        }while(!check);
        
        //check the number that they gave to see if there is a X or O in that position
        //also validates and runs through switch statement until the user hits an empty position
        //the do while enables the user to reenter an integer if that board space is filled already
        do{
        switch(spaceNum){
            case 1:
            if(gameboard[0][0].equals("1")){
                scnr.nextLine();
                check3 = true;
                //System.out.println("This space is empty");
                pos = "1";
                break;
            }
            else{
                do{
                    if(spaceNum > 0 && spaceNum < 10 && spaceNum != 1){
                        check2 = true;
                        break;
                    }
                    else{
                        scnr.nextLine();
                        System.out.println("Invalid, try again. Value not between 1-9");
                        spaceNum = scnr.nextInt();
                        check2 = false;
                    }
                }while(!check2);
            }
            break;
            case 2:
            if(gameboard[0][1].equals("2")){
                scnr.nextLine();
                check3 = true;
                //System.out.println("This space is empty");
                pos = "2";
                break;
            }
            else{
                do{
                    if(spaceNum > 0 && spaceNum < 10 && spaceNum != 2){
                        check2 = true;
                        break;
                    }
                    else{
                        scnr.nextLine();
                        System.out.println("Invalid, try again. Value not between 1-9");
                        spaceNum = scnr.nextInt();
                        check2 = false;
                    }
                }while(!check2);
            }
            break;
            case 3:
            if(gameboard[0][2].equals("3")){
                scnr.nextLine();
                check3 = true;
                //System.out.println("This space is empty");
                pos = "3";
                break;
            }
            else{
                do{
                    if(spaceNum > 0 && spaceNum < 10 && spaceNum != 3){
                        check2 = true;
                        break;
                    }
                    else{
                        scnr.nextLine();
                        System.out.println("Invalid, try again. Value not between 1-9");
                        spaceNum = scnr.nextInt();
                        check2 = false;
                    }
                }while(!check2);
            }
            break;
            case 4:
            if(gameboard[1][0].equals("4")){
                scnr.nextLine();
                check3 = true;
                //System.out.println("This space is empty");
                pos = "4";
                break;
            }
            else{
                do{
                    if(spaceNum > 0 && spaceNum < 10 && spaceNum != 4){
                        check2 = true;
                        break;
                    }
                    else{
                        scnr.nextLine();
                        System.out.println("Invalid, try again. Value not between 1-9");
                        spaceNum = scnr.nextInt();
                        check2 = false;
                    }
                }while(!check2);
            }
            break;
            case 5:
            if(gameboard[1][1].equals("5")){
                scnr.nextLine();
                check3 = true;
                //System.out.println("This space is empty");
                pos = "5";
                break;
            }
            else{
                do{
                    if(spaceNum > 0 && spaceNum < 10 && spaceNum != 5){
                        check2 = true;
                        break;
                    }
                    else{
                        scnr.nextLine();
                        System.out.println("Invalid, try again. Value not between 1-9");
                        spaceNum = scnr.nextInt();
                        check2 = false;
                    }
                }while(!check2);
            }
            break;
            case 6:
            if(gameboard[1][2].equals("6")){
                scnr.nextLine();
                check3 = true;
                //System.out.println("This space is empty");
                pos = "6";
                break;
            }
            else{
                do{
                    if(spaceNum > 0 && spaceNum < 10 && spaceNum != 6){
                        check2 = true;
                        break;
                    }
                    else{
                        scnr.nextLine();
                        System.out.println("Invalid, try again. Value not between 1-9");
                        spaceNum = scnr.nextInt();
                        check2 = false;
                    }
                }while(!check2);
            }
            break;
            case 7:
            if(gameboard[2][0].equals("7")){
                scnr.nextLine();
                check3 = true;
                //System.out.println("This space is empty");
                pos = "7";
                break;
            }
            else{
                do{
                    if(spaceNum > 0 && spaceNum < 10 && spaceNum != 7){
                        check2 = true;
                        break;
                    }
                    else{
                        scnr.nextLine();
                        System.out.println("Invalid, try again. Value not between 1-9");
                        spaceNum = scnr.nextInt();
                        check2 = false;
                    }
                }while(!check2);
            }
            break;
            case 8:
            if(gameboard[2][1].equals("8")){
                scnr.nextLine();
                check3 = true;
                //System.out.println("This space is empty");
                pos = "8";
                break;
            }
            else{
                do{
                    if(spaceNum > 0 && spaceNum < 10 && spaceNum != 8){
                        check2 = true;
                        break;
                    }
                    else{
                        scnr.nextLine();
                        System.out.println("Invalid, try again. Value not between 1-9");
                        spaceNum = scnr.nextInt();
                        check2 = false;
                    }
                }while(!check2);
            }
            break;
            case 9:
            if(gameboard[2][2].equals("9")){
                scnr.nextLine();
                check3 = true;
                //System.out.println("This space is empty");
                pos = "9";
                break;
            }
            else{
                do{
                    if(spaceNum > 0 && spaceNum < 10 && spaceNum != 9){
                        check2 = true;
                        break;
                    }
                    else{
                        scnr.nextLine();
                        System.out.println("Invalid, try again. Value not between 1-9");
                        spaceNum = scnr.nextInt();
                        check2 = false;
                    }
                }while(!check2);
            }
            break;
        }
    }while(!check3);

        //System.out.println(spaceNum);
        return pos;

    }
    public boolean checkWin(String playerCode){
        //System.out.println("We are in checkWin");
        //check if full. look at each element to see if there are any 1-9 if a number then not full
        int count = 0;
        boolean win = false;
        boolean finalWin = false;
        
        //check if the symbol in each row and col are the same
        //for row
        
        for(int i = 0; i < gameboard.length; i++){
            int j = 0;
            if(gameboard[i][j].equals(playerCode) && gameboard[i][j+1].equals(playerCode) && gameboard[i][j+2].equals(playerCode))
            {
                //System.out.println("win!");
                win = true;
                finalWin = true;
                break;
            }
            else{
                //System.out.println("no win!");
                win = false;
            }
        }
   
        //for column
 
        for(int i = 0; i < gameboard.length; i++){
            int j = 0;
            if(gameboard[j][i].equals(playerCode) && gameboard[j+1][i].equals(playerCode) && gameboard[j+2][i].equals(playerCode))
            {
                //System.out.println("win!");
                win = true;
                finalWin = true;
                break;
            }
            else{
                //System.out.println("no win!");
                win = false;
            }
        }


        //check if the symbol is diagonally the same board[0][0] and board [1][1] and board [2][2]
        if(gameboard[0][0].equals(playerCode) && gameboard[1][1].equals(playerCode) && gameboard[2][2].equals(playerCode))
        {
            //System.out.println("win!");
            win = true;
            finalWin = true;
        }
        if(gameboard[0][2].equals(playerCode) && gameboard[1][1].equals(playerCode) && gameboard[2][0].equals(playerCode))
        {
            //System.out.println("win!");
            win = true;
            finalWin = true;
        }

        //running through array elements to check if board is full
        for(int row = 0; row < gameboard.length; row++){
            for(int col = 0; col < gameboard[row].length; col++){
                if(gameboard[row][col].equals("X") || gameboard[row][col].equals("O")){
                    count++;
                }
            }
        }
        //checking if board is full
        if(count == 9){
            System.out.println("Board is full");
        }
        else{
            System.out.println("Board is not full");
        }


        //check if the same symbol is in each column board[0][0] and board [1][0] and board [2][0]
        return finalWin;
    }

    public boolean boardFull(){ //this method just simplifies stopping the code with a draw as I couldn't get it to work within checkWin
        //running through array elements to check if board is full
        int count = 0;
        boolean draw = false;
        for(int row = 0; row < gameboard.length; row++){
            for(int col = 0; col < gameboard[row].length; col++){
                if(gameboard[row][col].equals("X") || gameboard[row][col].equals("O")){
                    count++;
                }
            }
        }
        //checking if board is full
        if(count == 9){
            draw = true;
        }
        else{
            draw = false;
        }
        return draw;
    }

    public void changePosition(String pos, String playerCode){
        //System.out.println("We are in changePosition");
        switch(pos){
            case "1":
            gameboard[0][0] = playerCode;
            break;
            case "2":
            gameboard[0][1] = playerCode;
            break;
            case "3":
            gameboard[0][2] = playerCode;
            break;
            case "4":
            gameboard[1][0] = playerCode;
            break;
            case "5":
            gameboard[1][1] = playerCode;
            break;
            case "6":
            gameboard[1][2] = playerCode;
            break;
            case "7":
            gameboard[2][0] = playerCode;
            break;
            case "8":
            gameboard[2][1] = playerCode;
            break;
            case "9":
            gameboard[2][2] = playerCode;
            break;
        }
        
        //if number == 1 place the playerCode in board[0][0]
         //if number == 2 place the playerCode in board[0][1]
         //if number == 4 place the playerCode in board[1][0]
    }
}
