/***
 * Class to model the entity Student
 * @author Angela Cui
 * @version 0.1
 * Date of creation: February 4, 2022
 * Last Date Modified: February 4, 2022
 */
public class Student extends Person{
    private int id;
    private String major;

    public Student(){
        super();
        id = 0;
        major = "none";     
    }
    public Student(String name, String address, String phone,
                    String email, int id, String major){
        super(name, address, phone, email);
        this.id = id;
        this.major = major;
    }
    /***
	 * Getter for the ID of the student
	 * @param	no parameters
	 * @return	the value of the data student's ID
	 */
    public int getID() {
        return id;
    }
    /***
	 * Getter for the major of the student
	 * @param	no parameters
	 * @return	the String of the data student's major
	 */
    public String getMajor() {
        return major;
    }
    /***
	 * Setter for the ID of a student
	 * @param	id to set the data member ID
	 * no return value
	 */
    public void setID(int id){
        this.id = id;
    }
    /***
	 * Setter for the major of a student
	 * @param	major to set the data member major
	 * no return value
	 */
    public void setMajor(String major){
        this.major = major;
    }
    /***
	 * Method to get the Student information
	 * no parameters
	 * @return formatted string containing the value of the data members
	 */
    public String toString(){
        return String.format("%sID: %d\nMajor: %s\n", 
                super.toString(), id, major);
    }
}
