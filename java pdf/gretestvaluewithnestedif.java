public class gretestvaluewithnestedif{
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 15;
        
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("num1 is the greatest: " + num1);
            } else {
                System.out.println("num3 is the greatest: " + num3);
            }
        } else {
            if (num2 > num3) {
                System.out.println("num2 is the greatest: " + num2);
            } else {
                System.out.println("num3 is the greatest: " + num3);
            }
        }
    }
}
