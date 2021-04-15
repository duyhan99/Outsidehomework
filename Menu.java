import java.util.Scanner;

public class Menu extends ShowAccount {
    public Menu(long amount) {
        super(amount);
    }

    public static void main(String[] args) {
        ShowAccount sa = new ShowAccount(120000);
        String choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Ngan hang HanPlay kinh chao Quy khach hang Nguyen Van A");
            System.out.println("Menu:");
            System.out.println("1. Nhan phim A de kiem tra tai khoan");
            System.out.println("2. Nhan phim D de nap tien");
            System.out.println("3. Nhan phim W de rut tien");
            System.out.println("4. Nhan phim H de xem lich su 3 lan");
            System.out.println("5. Nhan phim X de thoat");
            System.out.println("==================================");

            System.out.println("Nhap lua chon cua ban:");
            choice = sc.next();

            switch (choice) {
                case "A":
                    sa.displayA();
                    System.out.println("Bam nut tiep theo de giao dich");
                    System.out.println("==================================");
                    break;
                case "D":
                    sa.displayD();
                    System.out.println("Bam nut tiep theo de giao dich");
                    System.out.println("==================================");
                    break;
                case "W":
                    sa.displayW();
                    System.out.println("Bam nut tiep theo de giao dich");
                    System.out.println("==================================");
                    break;
                case "X":
                    System.out.println("Thank you and see ya");
                    System.exit(0);
                case "H":{
                    sa.displayH();
                }
                default:
                    System.out.println("Ban nhap sai chuc nang");
                    System.out.println("Bam nut tiep theo de giao dich");
                    System.out.println("==================================");


            }
        } while (choice != "X") ;
    }
}
