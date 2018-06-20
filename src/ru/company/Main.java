package ru.company;
import ru.company.users.Users;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            Users user = new Users();

            System.out.println("Enter you name: ");
            user.setName(scanner.nextLine());
            System.out.println("You name is: " + user.getName());

        System.out.println("Enter you E-mail: ");
        user.setEmail(scanner.nextLine());
        System.out.println("You E-mail: " + user.getEmail());

            System.out.println("Enter you age: ");
            user.setAge(scanner.nextInt());
            if (user.getAge() < 18) {
                System.out.println("You age less than 18 years!!!");
            }
            else {
                System.out.println("You are " + user.getAge() + ", welcome!!!");
            }


    }
}
