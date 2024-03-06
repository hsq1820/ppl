import java.util.ArrayList;

public class push {
    static int p=1;
    public static void pu(ArrayList<p1> b){
        if(p%3==0){
            for(int i=b.size()-1;i>4;i--){
                b.get(i).setColor(b.get(i-5).color);
            }
            for(int j=0;j<5;j++){
                b.get(j).setColor(master.colour());
            }
        }
    }

    public static void upP() {
        push.p++;
    }
}
