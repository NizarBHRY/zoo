import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("have you fed the giraffes:(answer: \"true\" if you have and \"false\")");
        String answer = input.nextLine().toLowerCase();
        boolean hasfed= Boolean.parseBoolean(answer);

        Giraffee stacy = new Giraffee("Stacy", 17, "meteor", true,13, 2);
        Giraffee gwen = new Giraffee("Gwen", 17, "meteor", true, 10, 3);
        Giraffee Dale = new Giraffee("Dale", 17, "meteor", true, 11, 1);
        Giraffee tallguy= new Giraffee();
        Giraffee[] listeer = {stacy, gwen, Dale, tallguy};

        Janitor jeff = new Janitor("Jeff");
        Janitor maximillion= new Janitor("Maximillion", 200, 6, 6, 12, "savanna", 2);

        Guide trent = new Guide();

        if(!hasfed) {
            System.out.println("What! How many days did you not feed them?!");
            int noFeed = input.nextInt();
            Giraffee.setDaysHaventEaten(noFeed);

            for (int i = 0; i < listeer.length; i++) {
                if (listeer[i].getLastsdaysWitoutFood() <= noFeed) {
                    listeer[i].putOutOfMisery();
                }
            }
            System.out.println("Now I have to check if they're alive:");
            for (int i = 0; i < listeer.length; i++) {
                System.out.println(listeer[i].getName()+" being alive is: "+ listeer[i].isAlive());
            }
        }else{
            System.out.println("Oh good then go get the keys from the janitor, and give them to the guide");
            System.out.println("What hour is it by the way?:(answer should be from 0-12)");
            int time = input.nextInt();
            if(jeff.getShiftStart()< time && time< jeff.getShiftEnd()){
                jeff.takeKeys();
                System.out.println("Now the keys were taken from Jeff the janitor");
            }else{maximillion.takeKeys();
                System.out.println("Now the keys were taken from Maximillion the janitor");}
            trent.giveKeys();
            System.out.println("Then keys were given to Trent the guide.");
        }
    }
}