public class minutes {
    public static void main(String[] args) {
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);

    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
          System.out.println("Invalid Value");
        }
        else {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long leftoverDays = days % 365;
            String result = minutes + " min = " + years + " y and " + leftoverDays + " d";
            System.out.println(result);
        }
    }
}
