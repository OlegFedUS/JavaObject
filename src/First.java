public class First {

    private String str;
    private String txt;
    private int num;
    private int num2;
    private int num3;
    private String c;

    public int getNum(int num){
        this.num = num;
        return num;
    }

    public int getNum2(int num2){
        this.num2 = num2;
        return num2;
    }

    public int getNum3(int num3){
        this.num3 = num3;
        return num3;
    }

    public String getTxt(String txt){
        this.txt = txt;
        return txt;
    }

    public String getStr(String str){
        this.str = str;
        return str;
    }

    public String getC(String c){
        this.c = c;
        return c;
    }

    public void groups() {
        if (num < 30) {
            System.out.println("group#0");
        } else {
            System.out.println("group#1");
        }
    }

}
