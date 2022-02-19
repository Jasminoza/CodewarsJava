package Kyu8;

public class ThirdAngleOfATriangle {
    public static void main(String[] args) {
    int angle1 = 45;
    int angle2 = 12;
        System.out.println(otherAngle(angle1, angle2));
    }

    public static int otherAngle(int angle1, int angle2) {
        return 180-angle1-angle2;
    }
}