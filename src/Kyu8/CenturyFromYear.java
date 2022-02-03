package Kyu8;


public class CenturyFromYear {

    public static void main(String[] args) {
        int a = century(1705); //18
        System.out.println(a);
        a = century(1900); //19
        System.out.println(a);
        a = century(1601); //17
        System.out.println(a);
        a = century(2000); //20
        System.out.println(a);
        a = century(89); //1
        System.out.println(a);
        a = century(101); //2
        System.out.println(a);
    }


    public static int century(int number) {
        int answer = 0;
        int millenium = number / 1000;
        int cent = (number - millenium * 1000) / 100;
        int decade = number - millenium * 1000 - cent * 100;
        int year = number - millenium * 1000 - cent * 100 - decade * 10;

        if (year == 0) {
            answer = millenium * 10 + cent;
        } else {
            answer = millenium * 10 + cent + 1;
        }
        return answer;
    }
}

