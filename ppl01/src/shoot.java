import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class shoot {
    static int w=1;
    public static void s(ArrayList<p1> b){
        Scanner sc = new Scanner(System.in);
        while (w==1) {
            p1 ba = new p1(11,3,master.colour());
            System.out.println(ba.color);
            int ShootLine = sc.nextInt();
            if (ShootLine == 0){
                return;
            }
            for (int i=b.size()-1;i>=0;i--){
                p1 b1 =b.get(i);
                if(i>=5){
                    if (b1.line==ShootLine&&Objects.equals(b1.color, "　")&&(!Objects.equals(b.get(i - 5).color, "　")||b1.row==1)){
                        b1.setColor(ba.color);
                        del.d(i,b);
                    }
                }else {
                    if (b1.line==ShootLine&&Objects.equals(b1.color, "　")){
                        b1.setColor(ba.color);
                        del.d(i,b);
                    }
                }
            }
            for (p1 ball : b) {
                if (ball.line < 5) {
                    System.out.print(ball.color);
                } else {
                    System.out.println(ball.color);
                }
            }
            lose.l(b);
        }
    }
}