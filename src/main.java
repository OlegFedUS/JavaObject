import java.util.GregorianCalendar;

public class main {

    public static void main(String[] args) {


        First firstPerson = new First();
        String name = firstPerson.getStr("Victor");
        int age = firstPerson.getNum(29);
        String gender = firstPerson.getC("M");

        First secondPerson = new First();
        String name2 = secondPerson.getStr("Max");
        int age2 = secondPerson.getNum(37);
        String gender2 = secondPerson.getC("M");

        First thirdPerson = new First();
        String name3 = thirdPerson.getStr("Lisa");
        int age3 = thirdPerson.getNum(21);
        String gender3 = thirdPerson.getC("M");

        First firstGroup = new First();
        int group1 = firstGroup.getNum2(0);

        First secondGroup = new First();
        int group2 = secondGroup.getNum3(1);

        firstPerson.groups();
        secondPerson.groups();
        thirdPerson.groups();




    }
}
