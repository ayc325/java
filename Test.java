/***
 * Class to model the entity Person
 * @author Angela Cui
 * @version 0.1
 * Date of creation: February 4, 2022
 * Last Date Modified: February 4, 2022
 */
public class Test {
    public static void main(String[] args){
        Person[] people = new Person[4];
        //first index includes information of a person: name, address, phone number, and email
        people[0] = new Person("Helen Brown",
                                "222 10th Street Bethlehem",
                                "610-334-2288",
                                "hbrown@gmail.com");
        //second index includes information of a student: name, address, phone number, email, id, and major
        people[1] = new Student("Paul Leister",
                                "972 4th Street Allentown",
                                "610-331-7177",
                                "pleister@gmail.com",
                                12345,
                                "CSE");
        //third index includes information of an employee: name, address, phone number, email, id, position, and salary
        people[2] = new Employee("Beth Down",
                                "234 Main Street Philadelphia",
                                "484-222-4433",
                                "bdown@gmail.com",
                                33442,
                                "Systems Admininstrator",
                                75000);
        //last index includes information of a faculty: name, address, phone number, email, id, position, salary, and rank
        people[3] = new Faculty("Mark Jones",
                                "21 Orchid Street Bethlehem",
                                "618-333-2211",
                                "mjones@gmail.com",
                                22222,
                                "Faculty",
                                90000,
                                "Associate Professor");
        System.out.println("Original List:"); //array before sorted
        printArray(people);

        sortArray(people); //sorting array by going into the sortArray method

        System.out.println("Sorted List:"); //array after sorted
        printArray(people);
    }

    //method used to print array
    public static void printArray(Person[] list){
        for(int i=0; i<list.length; i++){
            System.out.println(list[i]);
        }
    }
    //method used to sort the array based on the alphabetical order of the name
    public static void sortArray(Person[] list){
        for(int i = 0; i < list.length; i++){
            int minIndex = i;
            for(int j=i+1; j<list.length; j++){
                if(list[j].getName().compareTo(list[minIndex].getName()) < 0){
                    minIndex = j;
                }
            Person temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
            }
        }
    }
}
