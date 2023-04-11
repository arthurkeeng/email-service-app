import java.util.Scanner;

public class Email{
    private String email;
    private String firstname;
    private String lastname;
    private String department;
    private String password;
    private int mailBoxCap = 500;
    private String altEmail;

    public Email(String firstname , String lastname){
        this.firstname = firstname ;
        this.lastname = lastname;
        System.out.println("email created successfully" + this.firstname + this.lastname);
        this.department = setDepartment();
        this.password = setRandomPassword(8);

        this.email = firstname.toLowerCase() + 
            "." + lastname.toLowerCase() + 
            "." + department.toLowerCase() + "@gmail.com";
    }


    private String setDepartment(){
        System.out.print("please enter your department \n 1 for sales \n 2 for accounting \n 0 for nothing");
        Scanner scanner = new Scanner(System.in);
        try{
             int input = scanner.nextInt();
        if (input == 1) {return "sales";}
        else if(input == 2) {return "accounting";}
        else{
            return "";
        }
        }
        finally{
            scanner.close();

        }
       
    }

    public void setMailCapacity(int capacity){
        mailBoxCap = capacity;
    }

    public void changePassword(String password){
        this.password = password;
    }

    public void alternateEmail(String  altEmail){
        this.altEmail = altEmail;
    
    }

    private String setRandomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@$%";
        char[] passwordArr = new char[length];

        for (int i = 0 ;i<length; i++){
            int randomNo = (int)(Math.random() * passwordSet.length());
            passwordArr[i] = passwordSet.charAt(randomNo);
        }
        return new String(passwordArr);
    }
}