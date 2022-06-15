/***
 * Class to model the entity Person
 * @author Angela Cui
 * @version 0.1
 * Date of creation: February 4, 2022
 * Last Date Modified: February 4, 2022
 */
public class Movie extends Media{
    //Data members
    private int duration;
    /***
	 * Default constructor
	 * No parameters
	 * Initializes title, genre, rating to the string "none" from Media and duration to the int 0 
	 */
	public Movie() {
		super();
		duration = 0;
	}
    /***
	 * Constructor with four parameters
	 * @param	title for the title of a media
	 * @param	genre for the genre of a media
	 * @param	rating for the rating of a media
     * @param	duration for the duration of the movie
	 */
	public Movie(String title, String genre, String rating, int duration) {
        super(title, genre, rating);
        this.duration = duration;
    } 
    /***
	 * Getter for the duration of the movie
	 * @param	no parameters
	 * @return	the value of the data member duration
	 */
	public int getDuration() {
		return duration;
	} 
    /***
	 * Setter for the duration of the movie
	 * @param	duration to set the data member duration
	 * no return value
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}
    /***
	 * Method to get the Movie information
	 * no parameters
	 * @return formatted string containing the value of the data members
	 */
	public String toString() {
	        return String.format("%s %d\n",
	                            super.toString(), duration);
	    }

}
