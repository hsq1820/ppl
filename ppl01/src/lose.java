import java.util.ArrayList;
import java.util.Objects;

public class lose {
    public static void l(ArrayList<p1> b){
        for (int i =1;i<6;i++){
            if (!Objects.equals(b.get(b.size()-i).color, "　")){
                System.out.println("lose.");
                shoot.w=0;
                return;
            }
        }
    }
}
