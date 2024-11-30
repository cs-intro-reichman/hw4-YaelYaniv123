public class Primes {
    public static void main(String[] args) {
        int max = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[max];
        for (int i = 0; i < arr.length; i++){
            if (i > 1) {
                arr[i] = true;
            }
        } 
        int count = 2;
        while (count < max / 2) {
            if (arr[count] == true) {
                for (int i = count + 1; i < max; i++) {
                    if (i % count == 0) {
                        arr[i] = false;
                    }
                }
            }
            count++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == true) {
                System.out.println(i);
            }
        }

    }
}