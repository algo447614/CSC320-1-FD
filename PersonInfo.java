/*This program will create variables to store the following information:
 * 1. First name
 * 2. Last name
 * 3. Street Address
 * 4. City
 * 5. Zip code
 * After creating these variables, a fictional person's corresponding data will be assigned to each.
 * Finally, program will print each variable with assigned storage data. 
 */

package CT_Assignments;

public class PersonInfo {
	public static void main(String[] args) {
        // Create variables to store information
        String firstName = "Man";
        String lastName = "Manson";
        String streetAddress = "111 Road St";
        String city = "Ann Arbor";
        String zipCode = "48103";

        // Print the information
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Street Address: " + streetAddress);
        System.out.println("City: " + city);
        System.out.println("Zip Code: " + zipCode);
    }
}
