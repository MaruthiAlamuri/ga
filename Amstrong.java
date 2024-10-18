public class Amstrong {

    public static String isArmstrong(int num) {
        int temp = num;
        int count = 0;

        // Calculate the number of digits
        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        temp = num;  // Re-assign original value to temp
        int sum = 0;

        // Calculate the sum of each digit raised to the power of count using a for loop
        while (temp > 0) {
            int rem = temp % 10;
            int pow = 1;

            // Calculate rem^count using a for loop
            for (int i = 0; i < count; i++) {
                pow *= rem;
            }

            sum += pow;
            temp = temp / 10;
        }

        // Check if the number is an Armstrong number
        if (sum == num) {
            return num + " is an Armstrong number.";
        } else {
            return num + " is not an Armstrong number.";
        }
    }

    public static void main(String[] args) {
        int num = 153;
        System.out.println(isArmstrong(num));
    }
}
