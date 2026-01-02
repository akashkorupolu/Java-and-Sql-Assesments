public class P11 {
    public static void main(String[] args) {

        int length = 5; 

        try {
            int num = Integer.parseInt(args[0]);

            if (!args[1].equals("0")) {
                length = Integer.parseInt(args[1]);
            }

            for (int i = 0; i < length; i++) {
                System.out.println(num);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide at least one argument");
        }
        catch (NumberFormatException e) {
            System.out.println("Arguments must be numeric");
        }
    }
}
