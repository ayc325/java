/***
 * Class to model the entity Person
 * @author Angela Cui
 * @version 0.1
 * Date of creation: February 4, 2022
 * Last Date Modified: February 4, 2022
 */
public class Employee extends Person{
    // Data members
    private int id;
    private String position;
    private double salary;
    /***
	 * Default constructor
	 * No parameters
	 * Initializes name, address, phone, email from Person, id, position, and salary to the string "none", int 0, or double 0.0.
	 */
    public Employee(){
        super();
        id = 0;
        position = "none";
        salary = 0.0;
    }
    /***
	 * Constructor with seven parameters
	 * @param	name for the name of a person
	 * @param	address for the address of a person
	 * @param	phone for the phone number of a person
	 * @param	email for the email address of a person
     * @param	id for the id of an employee
     * @param	position for the position of an employee
     * @param	salary for the salary of an employee
	 */
    public Employee(String name, String address, String phone, String email,
                        int id, String position, double salary){
        super(name, address, phone, email);
        this.id = id;
        this.position = position;
        this.salary = salary;
    }
    /***
	 * Getter for the ID of an employee
	 * @param	no parameters
	 * @return	the value of the data employee's ID
	 */
    public int getID(){
        return id;
    }
    /***
	 * Getter for the position of an employee
	 * @param	no parameters
	 * @return	the String of the data employee's position
	 */
    public String getPosition(){
        return position;
    }
    /***
	 * Getter for the salary of an employee
	 * @param	no parameters
	 * @return	the value of the data employee's salary
	 */
    public double getSalary(){
        return salary;
    }
    /***
	 * Setter for the ID of an employee
	 * @param	id to set the data member id
	 * no return value
	 */
    public void setID(int id){
        this.id = id;
    }
    /***
	 * Setter for the position of an employee
	 * @param	position to set the data member position
	 * no return value
	 */
    public void setPosition(String position){
        this.position = position;
    }
    /***
	 * Setter for the salary of an employee
	 * @param	salary to set the data member salary
	 * no return value
	 */
    public void setSalary(double salary){
        this.salary = salary;
    }
    /***
	 * Method to get the Employee information
	 * no parameters
	 * @return formatted string containing the value of the data members
	 */
    public String toString(){
        return String.format("%sID: %d\nPosition: %s\nSalary: %.2f\n",
                    super.toString(), id, position, salary);
    }

}

