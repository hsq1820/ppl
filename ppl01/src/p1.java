public class p1{
    int row;
    int line;
    String color;
    int de=0;
    int fa=0;

    public p1(int row, int line, String color) {
        this.row=row;
        this.line=line;
        this.color=color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDe(int de) {
        this.de = de;
    }

    public void setFa(int fa) {
        this.fa = fa;
    }
}