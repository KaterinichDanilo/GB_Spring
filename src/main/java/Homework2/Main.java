package Homework2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("Homework2");
        Cart cart = context.getBean(Cart.class);

        String command = "showCart";
        System.out.println("Commands:\n'showCart'\n'add integer'\n'remove integer'\nshowProducts");
        Scanner in = new Scanner(System.in);

        while (!command.equals("exit")){
            switch (command.split(" ")[0]) {
                case ("showCart"):
                    cart.showCart();
                    break;
                case ("add"):
                    cart.addById(Long.valueOf(command.split(" ")[1]));
                    break;
                case ("remove"):
                    cart.deleteById(Long.valueOf(command.split(" ")[1]));
                    break;
            }
            command = in.nextLine();
        }
    }
}
