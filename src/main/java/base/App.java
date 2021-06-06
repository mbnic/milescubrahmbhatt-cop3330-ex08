package base;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        PizzaParty party = new PizzaParty();

        myApp.getInput(party);
        myApp.getSlicesPerPerson(party);
        myApp.printOutput(party);

    }

    public void printOutput(PizzaParty party) {
        System.out.printf("%d people with %d pizzas (%d slices)\n",
                party.people, party.pizzas, party.totalSlices);

        System.out.println("Each person gets " + party.slicesPerPerson + " pieces of pizza.");
        System.out.println("There are " + party.leftOvers + " leftover pieces.");
    }

    public void getSlicesPerPerson(PizzaParty party) {
        party.slicesPerPerson = party.totalSlices / party.people;
        party.leftOvers = party.totalSlices % party.people;
    }

    public void getInput(PizzaParty party) {
        System.out.printf("How many people? ");
        String people = in.nextLine();
        party.people = Integer.parseInt(people);

        System.out.printf("How many pizzas do you have? ");
        String pizzas = in.nextLine();
        party.pizzas = Integer.parseInt(pizzas);

        System.out.printf("How many slices per pizza? ");
        String slicesString = in.nextLine();
        int slicesInt = Integer.parseInt(slicesString);

        party.totalSlices = (party.pizzas * slicesInt);
    }
}
