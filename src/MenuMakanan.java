import java.util.Scanner;

public class MenuMakanan {
    public static void main(String[] args) {

        String[] namaMenu = {"Soto", "Rawon", "Pecel", "Bakso", "Siomay"};
        int[] hargaMenu = {15000,  20000,  10000,  12500,  25000};

        Scanner sc = new Scanner(System.in);
        System.out.print("Isikan Makanan yang dipesan : ");
        String inputLine = sc.nextLine().trim();
        String[] tokens  = inputLine.split(" ");

        System.out.println("\nTotal Harga :");

        int total = 0;
        int i = 0;

        while (i < tokens.length - 1) {
            String namaPesan = tokens[i];
            int jumlah = Integer.parseInt(tokens[i + 1]);
            i += 2;

            for (int j = 0; j < namaMenu.length; j++) {
                if (namaMenu[j].equalsIgnoreCase(namaPesan)) {
                    int subtotal = hargaMenu[j] * jumlah;
                    System.out.println("\u2713 " + namaMenu[j]
                            + " @" + hargaMenu[j]
                            + " * " + jumlah
                            + " = " + subtotal);
                    total += subtotal;
                    break;
                }
            }
        }

        System.out.println("Total = " + total);
        sc.close();
    }
}