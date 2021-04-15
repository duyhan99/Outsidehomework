import java.util.Scanner;

public class ShowAccount {
    private long amount;
    String[] str = new String[3];
    public int count = 2;

    public ShowAccount(long amount) {
        this.amount = amount;
    }
    public long getAmount(){
        return amount;
    }

    public void displayA(){
        System.out.println("Your balance is: " + getAmount());
    }

    public void displayD(){
        System.out.println("Giao dich nap tien");
        System.out.println("Vui long nhap so tien");
        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong();
        System.out.println("Giao dich thanh cong. Ban vua nap " + money + " thanh cong");
        this.amount += money;
        System.out.println("So du tai khoan khach hang la: " + this.amount + " vnd");

    }

    public void displayW(){
        System.out.println("Giao dich rut tien");
        System.out.println("Vui long nhap so tien");
        Scanner sc = new Scanner(System.in);
        long moneyy = sc.nextLong();
        if(moneyy > getAmount()){
            System.out.println("Giao dich ko thanh cong");
            System.out.println("So du tai khoan khach hang la: " + getAmount());
            System.out.println("Ban ko the rut so tien lon hon so du tai khoan");
        }else {
            System.out.println("Giao dich thanh cong. Ban vua rut " + moneyy + " thanh cong");
            this.amount -= moneyy;
            System.out.println("So du tai khoan hien tai " + this.amount + " vnd");
        }
    }
    public void displayH(){
        if(count<0){
            for(int i=str.length-1;i>0;i--){
                str[i] = str[i-1];
            }
            count = 0;
        }
        str[count] = "Nap tien : " + this.amount;
        count--;

        for(int i=0;i<str.length;i++){
            if(str[i]!=null){
                System.out.println(str[i]);
            }
        }
    }

}
