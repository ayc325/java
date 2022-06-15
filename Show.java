/***
 * Class to model the entity Person
 * @author Angela Cui
 * @version 0.1
 * Date of creation: February 4, 2022
 * Last Date Modified: February 4, 2022
 */
public class Show extends Media{
    //Data members
    private int seasons;
    /***
	 * Default constructor
	 * No parameters
	 * Initializes title, genre, rating to the string "none" from Media and seasons to the int 0
	 */
    public Show() {
		super();
		seasons = 0;
	}
    /***
	 * Constructor with four parameters
	 * @param	title for the title of a media
	 * @param	genre for the genre of a media
	 * @param	rating for the rating of a media
     * @param	seasons for the seasons of a show
	 */
	public Show(String title, String genre, String rating, int seasons) {
        super(title, genre, rating);
        this.seasons = seasons;
    } 
    /***
	 * Getter for the seasons of a show
	 * @param	no parameters
	 * @return	the value of the data member seasons
	 */
	public int getSeasons() {
		return seasons;
	} 
    /***
	 * Setter for the seasons of a show
	 * @param	seasons to set the data member seasons
	 * no return value
	 */
	public void setSeasons(int seasons) {
		this.seasons = seasons;
	}
    /***
	 * Method to get the Show information
	 * no parameters
	 * @return formatted string containing the value of the data members
	 */
    public String toString() {
        return String.format("%s %d\n",
                            super.toString(), seasons);
    }

}
