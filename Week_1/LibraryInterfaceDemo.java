interface LibraryUser{
    void registerAccount();
    void requestBook();
}


class KidUser implements LibraryUser{
    int age;
    String bookType = "Kids";

    @Override
    public void registerAccount(){
        if(age<12){
            System.out.println("You have successfully registered under a Kids Account");
        }else{
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }


    @Override
    public void requestBook(){
        if(this.bookType.equals("Kids")){
            System.out.println("Book Issued successfully, please return the book within 10 days");
        }else{
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}

class AdultUser implements LibraryUser{
    int age;
    String bookType = "Fiction";
    @Override
    public void registerAccount(){
        if(age>12){
            System.out.println("You have successfully registered under an Adult Account");
        }else{
            System.out.println("Sorry, Age must be greater than 12 to register as an adult.");
        }
    }

    @Override
    public void requestBook(){
        if(this.bookType.equals("Fiction")){
            System.out.println("Book Issued successfully, please return the book within 7 days");
        }else{
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }

}


public class LibraryInterfaceDemo{
    public static void main(String[] args) {
        //Test case 1
        KidUser ku = new KidUser();

        // ku.age = 10;
        // ku.registerAccount();  // Output : You have successfully registered under a Kids Account

        // ku.age = 18;
        // ku.registerAccount(); // Output : Sorry, Age must be less than 12 to register as a kid

        // ku.bookType = "Kids";
        // ku.requestBook(); // Output : Book Issued successfully, please return the book within 10 days


        // ku.bookType = "Fiction";
        // ku.requestBook(); //Output : Oops, you are allowed to take only kids books


        // Test case : 2
        AdultUser au = new AdultUser();

        // au.age = 5;
        // au.registerAccount(); //Output : Sorry, Age must be greater than 12 to register as an adult.

        // au.age = 23;
        // au.registerAccount(); //Output : You have successfully registered under an Adult Account

        // au.bookType = "Kids";
        // au.requestBook(); //Output : Oops, you are allowed to take only adult Fiction books

        au.bookType = "Fiction";
        au.requestBook(); //Output : Book Issued successfully, please return the book within 7 days

    }
}