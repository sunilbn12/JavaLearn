package exception;

public class Demo {


    static void validate(int age) throws CustomException {
        if (age < 18) {

            // throw an object of user defined exception
            throw new CustomException("age is not valid to vote");
        } else {
            System.out.println("welcome to vote");
        }
    }

    public static void main(String[] args) throws CustomException {
        try {
            // calling the method
            validate(13);
        } catch (CustomException ex) {
            System.out.println("Caught the exception");

            // printing the message from InvalidAgeException object
            System.out.println("Exception occured: " + ex);
        }

        System.out.println("rest of the code...");
    }

}
