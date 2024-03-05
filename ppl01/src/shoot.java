import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class shoot {
    public static void s(ArrayList<p1> b){
        p1 ba = new p1(11,3,master.colour());
        System.out.println(ba.color);
        Scanner sc = new Scanner(System.in);

        for (;;) {
            String pd = sc.next();
            if (pd.equals("s")){
                int ShootLine = sc.nextInt();
                for (int i=b.size()-1;i>=0;i--){
                    p1 b1 =b.get(i);
                    if (b1.line==ShootLine& Objects.equals(b1.color, " ")& !Objects.equals(b.get(i - 5).color, " ")){
                        b1.setColor(ba.color);
                    }
                }
                for (p1 ball : b) {
                    if (ball.line < 5) {
                        System.out.print(ball.color);
                    } else {
                        System.out.println(ball.color);
                    }
                }
            } else if (pd.equals("quit")) {
                return;
            }
        }
    }
}