import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Customer {
    int ID;
    String name;
    String phone_number;
    String email;
    String role;

    public Customer(String name, String email, String role, String phone_number) {
        this.email = email;
        this.name = name;
        this.role = role;
        this.phone_number = phone_number;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getPhone_number(){
        return phone_number;
    }

    public String getRole(){
        return role;
    }

    public int getID(){
        return ID;
    }
}