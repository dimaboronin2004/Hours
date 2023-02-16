public class Hours {
    public static void main(String[] args) {
        int simmetric = 0;
        int general = 0;
        for (int i = 0; i <= 23; i ++) {
            for (int j = 0; j <= 59; j++) {
                general++;
                String hours = "";
                String mins = "";
                if (i < 10) hours = hours + "0" + i;
                else hours += Integer.toString(i);
                if (j < 10) mins = mins + "0" + j;
                else mins += Integer.toString(j);
                if (new StringBuilder(hours).reverse().toString().equals(mins)) {
                    System.out.println(hours + ":" + mins);
                    simmetric++;
                }
            }
        }
        System.out.println("Число повторяющихся комбинаций - " + simmetric);
        System.out.println("Общее число комбинаций - " + general);
    }
}