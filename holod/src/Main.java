import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String cold = "на улице холодно";
        String warm = "на улице тепло";
        Scanner con = new Scanner(System.in);
        int temp = con.nextInt();
        if (temp < 0 ) {
            System.out.println("на улице холодно");
        }
        else {
            if (temp >= 0)
                System.out.println("на улице тепло");
        }


    }
}