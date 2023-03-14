import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<String> W40K = new ArrayList<>();
    public Main() {
    }
    public static void main(String[] args) {
huvudMeny();
    }

    public static void huvudMeny() {
        System.out.println("--- Välkommen till Warhammer 40K Huvudmeny! ---");
        System.out.println("1. Lägg till W40K karaktär");
        System.out.println("2. Uppdatera W40K karaktär");
        System.out.println("3. Ta bort W40K karaktär");
        System.out.println("4. Visa lista med befintliga W40K karaktärer");
        System.out.println("5. Avsluta programmet");
        System.out.println("------------------------------------");
        System.out.print("Gör ditt sifferval : ");

        Scanner huvudMeny = new Scanner(System.in);
        int Val = huvudMeny.nextInt();
        switch (Val) {
            case 1 -> addW40K();
            case 2 -> updateW40K();
            case 3 -> deleteW40K();
            case 4 -> showW40K();
            case 5 -> System.exit(0);
            default -> { System.out.println("Det är inte ett giltigt val");

huvudMeny();
            }
        }

}
    public static void addW40K() {
        Scanner scanAdd = new Scanner(System.in);
        System.out.print("Ange namn på karaktär att lägga till: ");
        String addW40K = scanAdd.next();

        if (W40K.contains(addW40K)) {
            System.out.println("Karaktären finns redan");
        } else {
            W40K.add(addW40K);
            System.out.print("Karaktär tillagd\n");
        }
huvudMeny();
    }

    public static void updateW40K() {
        Scanner scanUpd = new Scanner(System.in);
        System.out.print("Ange namn på karaktär att uppdatera: ");
        String updateW40K = scanUpd.next();

        if (W40K.contains(updateW40K)) {
            int index = W40K.indexOf(updateW40K);
            System.out.print("Ange nytt namn på karaktär: ");
            String updateW40K1 = scanUpd.next();
            W40K.set(index, updateW40K1);
            System.out.println("Karaktär uppdaterad. \n");
        } else {
            System.out.print("Karaktär existerar ej.\n");
        }
huvudMeny();
    }

    public static void deleteW40K() {
        Scanner scanDel = new Scanner(System.in);
        System.out.print("Ange namn på karaktären att ta bort: ");
        String deleteW40K = scanDel.next();

        if (W40K.contains(deleteW40K)) {
            W40K.remove(deleteW40K);
            System.out.println("Karaktär raderad. \n");
        } else {
            System.out.print("Karaktär existerar ej.\n");
        }

huvudMeny();
    }

    public static void showW40K() {
        System.out.println("Befintliga W40K karaktärer i lista är: " + (W40K));
huvudMeny();
    }
}
