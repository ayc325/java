/***
 * Class to model the entity Person
 * @author Angela Cui
 * @version 0.1
 * Date of creation: February 4, 2022
 * Last Date Modified: February 4, 2022
 */
public class Faculty extends Employee{
    private String rank;
    
    public Faculty(){
        super();
        rank = "none";
    }
    public Faculty(String name, String address, String phone,
                    String email, int id, String position,
                    double salary, String rank){
        super(name, address, phone, email, id, position, salary);
        this.rank = rank;
    }
    /***
	 * Getter for the rank of the faculty
	 * @param	no parameters
	 * @return	the String of the data faculty's rank
	 */
    public String getRank(){
        return rank;
    }
    /***
	 * Setter for the rank of a faculty
	 * @param	rank to set the data member rank
	 * no return value
	 */
    public void setRank(String rank){
        this.rank = rank;
    }
    /***
	 * Method to get the Faculty information
	 * no parameters
	 * @return formatted string containing the value of the data members
	 */
    public String toString(){
        return String.format("%sRank: %s\n", super.toString(), rank);
    }
}
