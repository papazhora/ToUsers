package ru.company;
import ru.company.users.Users;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            Users user = new Users();
            System.out.print("Enter you name: ");
            user.setName(scanner.nextLine());
            System.out.print("You name is: " + user.getName());

    }
}
