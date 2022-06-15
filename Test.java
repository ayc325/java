/***
 * Class to model the entity Person
 * @author Angela Cui
 * @version 0.2
 * Date of creation: February 4, 2022
 * Last Date Modified: February 4, 2022
 */
import java.util.*;
public class Test {
    public static void main(String[] args){
        //intializes array
        Media[] mediaList = new Media[10];
    /***
	 * Initializations
	 * @param	title for the title of a media
	 * @param	genre for the genre of a media
	 * @param	rating for the rating of a media
     * @param	duration/number of seasons for the duration of the movie or number of seasons for the tv show
	 */
        mediaList[0] = new Show("Archive81", 
                            "Sci-Fi", 
                            "TV-MA", 
                            1);
        mediaList[1] = new Show("After Life",
                            "Drama",
                            "TV-MA",
                            3);
        mediaList[2] = new Movie("After We Fell",
                            "Drama",
                            "R",
                            98);
        mediaList[3] = new Show("The Witcher",
                            "Drama",
                            "TV-MA",
                            2);
        mediaList[4] = new Movie("Don't Look Up",
                            "Drama",
                            "R",
                            138);
        mediaList[5] = new Movie("The Alpinist",
                            "Documentary",
                            "PG-13",
                            92); 
        mediaList[6] = new Movie("Miss Sloane",
                            "Drama",
                            "R",
                            131); 
        mediaList[7] = new Show("Arcane - League of Legends",
                            "Animation",
                            "TV-14",
                            1); 
        mediaList[8] = new Movie("The Girl with the Dragon Tattoo",
                            "Drama",
                            "R",
                            158); 
        mediaList[9] = new Show("Arrested Development",
                            "Comedy",
                            "TV-MA",
                            5);                       
        //initializing a few variables needed for the main method
        Scanner scnr = new Scanner(System.in);
        Scanner scnr2 = new Scanner(System.in);
        int answer = -1;
        String genreInput = "none";
        //prints menu options
        while(answer != 6){
        System.out.println("Selection an operation:");
        System.out.println("1: View Media List");
        System.out.println("2: View Movies");
        System.out.println("3: View Shows");
        System.out.println("4: Search media by genre");
        System.out.println("5: Sort media by rating");
        System.out.println("6: Exit");
        
        if(scnr.hasNextInt()) {
        //used switch/case statement and if statements for menu selection
        	answer = scnr.nextInt();
        	switch(answer){
            case 1: 
                printMedia(mediaList, 0);
            break;
            case 2:  
                printMedia(mediaList, 1);
            break;
            case 3:
                printMedia(mediaList, 2);
            break;
            case 4:
                System.out.println("Enter a genre (Drama, Comedy, Sci-Fi, Animation, Documentary:");
                genreInput = scnr2.nextLine();
                findGenre(mediaList, genreInput);
            break;
            case 5:
                sortRating(mediaList);
                printMedia(mediaList, 0);
            break;
            case 6:
                System.out.println("Thank you for using my program, Bye!");
                System.exit(0);
            break;
            default: 
            	System.out.println("Invalid operation. Try again.\n");
                scnr.nextLine();
            break;
        }
        }
        else{
        	System.out.println("Invalid operation. Try again.\n");
            scnr.nextLine();
        	}
        }                      
}
    /***
	 * printMedia method
	 * @param	list for the array list of media
	 * @param	type for the type of array: all, Movie, and Show the user wants
	 */
    public static void printMedia(Media[] list, int type){
    	System.out.printf("%-30s\t%-10s\t%-5s\t%s\n", "Title", "Genre", "Rating", "Duration/Seasons");
    	switch(type){
            case 0:
                for(int i=0; i < list.length; i++){
                    System.out.println(list[i]);
                }
            break;
            case 1:
                for(int i = 0; i < list.length; i++){
                    if(list[i] instanceof Movie){
                        System.out.println(list[i]);
                    }  
                }
            break;
            case 2:
                for(int i = 0; i < list.length; i++){
                    if(list[i] instanceof Show){
                        System.out.println(list[i]);
                    }  
                }
            break;
        }
    }
    /***
	 * findGenre method
	 * @param	list for the array list of media
	 * @param	genre for the type of genre the user wants
	 */
    public static void findGenre(Media[] list, String genre){
        int count = 0;
        ArrayList<Object> genreList = new ArrayList<Object>();
        for(int i = 0; i < list.length; i++){
            if(list[i].getGenre().equals(genre)){
                count++;
                genreList.add(list[i]);
            }
        }
        //print genre only arraylist
        for(int i = 0; i < genreList.size(); i++){
            System.out.println(genreList.get(i));
        }

        //end print statement
        if(count > 0)
        System.out.println(count + " media found for the genre '" + genre + "'");
        if(count == 0)
        System.out.println("No media found for the genre '" + genre + "'");

    }
    /***
	 * printMedia method
	 * @param	list for the array list of media
	 */
    public static void sortRating(Media[] list) {
    	 for (int i=1; i<list.length; i++) {
    	     //Insert element i in the sorted sub-list
    	 	Media currentVal = list[i];
    	 	int j = i;
    	 	while (j>0 && currentVal.getRating().compareTo(list[j - 1].getRating()) < 0){
    	      	// Shift element (j-1) into element (j)
    	      	list[j] = list[j - 1];
    	      	j--;
    	 	}
    	 	// Insert currentVal at position j
    	 	list[j] = currentVal;
    	  }
	}
}


