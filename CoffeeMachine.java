package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        getAmount();
    }

    /* public static void calculateAmount() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write how many cups of coffee you will need: ");
        int amountCups = scan.nextInt();

        int water = amountCups * 200;
        int milk = amountCups * 50;
        int coffee = amountCups * 15;

        System.out.println("For " + amountCups + " cups of coffee you will need:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffee + " g of coffee beans");
    } */

    public static void getAmount() {
        Scanner scan = new Scanner(System.in);

        // Cantidades de agua, leche, cafe y tazas deseadas
        System.out.println("Write how many ml of water the coffee machine has: ");
        int amountWater = scan.nextInt();

        System.out.println("Write how many ml of milk the coffee machine has: ");
        int amountMilk = scan.nextInt();

        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int amountCoffee = scan.nextInt();

        System.out.println("Write how many cups of coffee you will need: ");
        int amountCups = scan.nextInt();

        // Calculo de maximo de tazas posibles para cada ingrediente
        int cupsWater = amountWater / 200;
        int cupsMilk = amountMilk / 50;
        int cupsCoffee = amountCoffee / 15;

        // Calculo del ingrediente con menos tazas
        int menor = 0;
        if (cupsWater < cupsMilk) {
            menor = cupsWater;
        } else {
            menor = cupsMilk;
        }

        if (menor > cupsCoffee) {
            menor = cupsCoffee;
        }

        // Resto para el output de tazas que aun pueden pedirse
        int restantes = menor - amountCups;

        // Output para el usuario
        if (menor == amountCups) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (menor < amountCups){
            System.out.println("No, I can make only " + menor + " cup(s) of coffee");
        } else {
            System.out.println("Yes, I can make that amount of coffee (and even " + restantes + " more than that)");
        }

    }
}