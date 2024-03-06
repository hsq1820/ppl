import java.util.ArrayList;

public class fall {
    public static void f(ArrayList<p1> b){
        for (int i=0;i<b.size();i++){
            if(!b.get(i).color.equals("　")){
                if (b.get(i).row != 1&&!b.get(i - 5).color.equals("　")) {
                    b.get(i - 5).setFa(1);
                }
                if (b.get(i).line != 1&&!b.get(i - 1).color.equals("　")) {
                    b.get(i - 1).setFa(1);
                }
                if (b.get(i).line != 5&&!b.get(i + 1).color.equals("　")) {
                    b.get(i + 1).setFa(1);
                }
                //判断可能掉落的球能否连接到第一行
                for (int o=0;o<15;o++) {
                    for (int u = 0; u < b.size(); u++) {
                        if (u!=i&&b.get(u).fa == 1) {
                            if (b.get(u).row != 1&&!b.get(u - 5).color.equals("　")&&(b.get(u-5).fa!=1)) {
                                b.get(u - 5).setFa(1);
                            }
                            if (b.get(u).line != 1&&!b.get(u - 1).color.equals("　")&&(b.get(u-1).fa!=1)) {
                                b.get(u - 1).setFa(1);
                            }
                            if (b.get(u).line != 5&&!b.get(u + 1).color.equals("　")&&(b.get(u+1).fa!=1)) {
                                b.get(u + 1).setFa(1);
                            }
                            if ((b.get(u+5).fa!=1)&&!b.get(u+5).color.equals("　")){
                                b.get(u+5).setFa(1);
                            }
                        }
                    }
                }
            }
            int r=0;
            for(int y=0;y<5;y++){
                if (b.get(y).fa == 1) {
                    r = 1;
                    break;
                }
            }
            if(r==0&&i>4){
                b.get(i).setColor("　");
            }
            for (p1 p1 : b) {
                p1.setFa(0);
            }
        }
    }
}
