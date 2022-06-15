/***
 * Class to model the entity Person
 * @author Angela Cui
 * @version 0.1
 * Date of creation: February 4, 2022
 * Last Date Modified: February 4, 2022
 */
public class Media{
    // Data members
    private String title;
    private String genre;
    private String rating;
    /***
	 * Default constructor
	 * No parameters
	 * Initializes title, genre, and rating to the string "none"
	 */
	public Media() {
		title = "none";
		genre = "none";
		rating = "none";
	}
    /***
	 * Constructor with three parameters
	 * @param	title for the title of a media
	 * @param	genre for the genre of a media
	 * @param	rating for the rating of a media
	 */
	public Media(String title, String genre, String rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    } 
    /***
	 * Getter for the title of a media
	 * @param	no parameters
	 * @return	the value of the data member title
	 */
	public String getTitle() {
		return title;
	} 
    /***
	 * Getter for the genre of a media
	 * @param	no parameters
	 * @return	the value of the data member genre
	 */
	public String getGenre() {
		return genre;
	} 
    /***
	 * Getter for the rating of a media
	 * @param	no parameters
	 * @return	the value of the data member rating
	 */
	public String getRating() {
		return rating;
	}
    /***
	 * Setter for the title of media
	 * @param	title to set the data member title
	 * no return value
	 */
	public void setTitle(String title) {
		this.title = title;
	}
    /***
	 * Setter for the genre of media
	 * @param	genre to set the data member genre
	 * no return value
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
    /***
	 * Setter for the rating of media
	 * @param	rating to set the data member rating
	 * no return value
	 */
	public void setRating(String rating) {
		this.rating = rating;
	}
    /***
	 * Method to get the Media information
	 * no parameters
	 * @return formatted string containing the value of the data members
	 */
	public String toString() {
        String out;
        out = String.format("%-30s\t%-10s\t%-5s\t",
						title, genre, rating);
        return out;
    }

}

