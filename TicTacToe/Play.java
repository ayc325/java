/*
Angela Cui
CSE007 Section 010
Nov. 6, 2021
By the end of this assignment, you should be able to create, initialize and manipulate multidimensional arrays representing a well-known game.
*/
import java.util.*;
public class Play {
    public static void main(String [] args){
        Scanner scnr = new Scanner(System.in);
        Board game = new Board();
        game.printBoard();
        boolean winner = false;
        int player = 0;
        String playerCode;
        boolean boardFilled = false;
        
        System.out.println("Player 1 or 2?");
        player = scnr.nextInt();
        do{ 
            if(player == 1){
                playerCode = "X";
                System.out.println("");
                System.out.println("Player 1's turn");
                System.out.println("Indicate where to place " + playerCode + " (1-9):");
                
                String position = game.checkSpace(scnr);
                //System.out.println(position);
                game.changePosition(position, playerCode);
                game.printBoard();
                winner = game.checkWin(playerCode);
                boardFilled = game.boardFull();
                
                if(winner == true){
                    System.out.println("Player One Wins!");
                    break;  
                }
                else{
                    if(boardFilled == false){
                    winner = false;
                    player = 2;
                    }
                    else if(boardFilled == true){
                        System.out.println("Draw");
                        winner = true;
                    }
                }
                //String positionString = getValue(scnr);
                //boolean valueBoolean = false;
            }
            else{
                playerCode = "O";
                System.out.println("");
                System.out.println("Player 2's turn");
                System.out.println("Indicate where to place " + playerCode + " (1-9):");
                
                String position = game.checkSpace(scnr);
                game.changePosition(position, playerCode);
                game.printBoard();
                winner = game.checkWin(playerCode);
                if(winner == true){
                        System.out.println("Player Two Wins!");
                        break;
                }
                else{
                    if(boardFilled == false){
                        winner = false;
                        player = 1;
                        }
                        else if(boardFilled == true){
                            System.out.println("Draw");
                            winner = true;
                        }
                }

            }
            //winner
            /*if(player == 1){
                scnr.nextLine();
                winner = true;
                player = 2;
            }
            else{
                scnr.nextLine();
                winner = true;
                player = 1;
            }*/
        }while(!winner);
    }
}
