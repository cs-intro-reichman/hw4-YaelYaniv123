public class Primes {
    public static void main(String[] args) {
        int max = Integer.parseInt(args[0]);
        System.out.println("Prime numbers up to " + max + ":");
        boolean[] arr = new boolean[max + 1];
        for (int i = 0; i < arr.length; i++){
            if (i > 1) {
                arr[i] = true;
            }
        } 
        int index = 1;
        int counter = 0;
        while (index <= max) {
            if (arr[index] == true) {
                for (int i = index + 1; i <= max; i++) {
                    if (i % index == 0) {
                        arr[i] = false;
                    }
                }
                counter++;
            }
            index++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == true) {
                System.out.println(i);
            }
        }
        int percent =  (int) ((double) counter / max * 100);
        System.out.println("There are " + counter + " primes between 2 and " + max + " (" + percent + "% are primes)");

    }
}