import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class master {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<p1> b = new ArrayList<>();

        start(b);
    }
    public static void start(ArrayList<p1> b) {
        for (int i=1;i<6;i++){
            for (int j=1;j<6;j++){
                p1 ball = new p1(i,j,colour());
                b.add(ball);
                if (j<5){
                    System.out.print(ball.color);
                } else {
                    System.out.println(ball.color);
                }
            }
        }
    }
    public static String colour(){
        Random c = new Random();
        int co= c.nextInt(3);
        String colo = null;
        switch (co){
            case 0:
                colo= "蓝";
                break;
            case 1:
                colo= "红";
                break;
            case 2:
                colo= "黄";
                break;
        }
        return colo;
    }
}