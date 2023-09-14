import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        System.out.println("*****STRANGE WEAPON STATS CALCULATOR*****\n\n");
        System.out.println("Input name of weapon: ");

        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.nextLine();

        System.out.println("Input kill COUNT: ");
        int kills = keyboard.nextInt();

        // skip line
        keyboard.nextLine();

        String[] strangePartNames = null;
        int[] partCounts = null; // counts of strange parts
        String answer = "";
        int i = 0;
        do {
            System.out.println("Input strange part (#" + (i + 1) + ") or NA to stop: ");
            answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("NA")) {
                break;
            } else if (answer.isBlank()) {
                continue; // restart the loop
            } else if (strangePartNames == null) {
                strangePartNames = new String[3];
                partCounts = new int[3];
                strangePartNames[i] = answer;
                System.out.println("Input strange part COUNT: ");
                partCounts[i] = keyboard.nextInt();

                // skip line
                keyboard.nextLine();
                i++;
            } else {
                strangePartNames[i] = answer;
                System.out.println("Input strange part COUNT: ");
                partCounts[i] = keyboard.nextInt();

                // skip line
                keyboard.nextLine();

                i++;
            }
        } while (i < 3);

        StrangeWeapon item = new StrangeWeapon(name, strangePartNames, partCounts, kills);
        System.out.println("\n\n" + item);

        keyboard.close();
    }
}
