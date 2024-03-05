import java.util.ArrayList;

public class del {
    public static void d(int k, ArrayList<p1> b) {
        String cl1 = b.get(k).color;
        b.get(k).setDe(1);
        int tode=1;
        if (b.get(k).row != 1&&b.get(k - 5).color.equals(cl1)) {
            b.get(k - 5).setDe(1);
            tode++;
        }
        if (b.get(k).line != 1&&b.get(k - 1).color.equals(cl1)) {
            b.get(k - 1).setDe(1);
            tode++;
        }
        if (b.get(k).line != 5&&b.get(k + 1).color.equals(cl1)) {
            b.get(k + 1).setDe(1);
            tode++;
        }
        for (int o=0;o<15;o++) {
            for (int i = 0; i < b.size(); i++) {
                if (i!=k&&b.get(i).de == 1) {
                    if (b.get(i).row != 1&&b.get(i - 5).color.equals(cl1)&&(b.get(i-5).de!=1)) {
                        b.get(i - 5).setDe(1);
                        tode++;
                    }
                    if (b.get(i).line != 1&&b.get(i - 1).color.equals(cl1)&&(b.get(i-1).de!=1)) {
                        b.get(i - 1).setDe(1);
                        tode++;
                    }
                    if (b.get(i).line != 5&&b.get(i + 1).color.equals(cl1)&&(b.get(i+1).de!=1)) {
                        b.get(i + 1).setDe(1);
                        tode++;
                    }
                    if ((b.get(i+5).de!=1)&&b.get(i+5).color.equals(cl1)){
                        b.get(i+5).setDe(1);
                        tode++;
                    }
                }
            }
        }
        for (p1 p1 : b) {
            if (tode > 2 && p1.de == 1) {
                p1.setColor("　");
            }
            if (p1.de == 1) {
                p1.setDe(0);
            }
        }
        fall.f(b);
    }
}