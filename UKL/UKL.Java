public class Prima {
    

    public static void main(String[]args);
    Scanner s = new Scanner(system.in);

    System.out.println("## program java cek bilangan prima ##");
    System.out.println("=====================================");
    System.out.println();

    int n,i;
    boolean angka_prima = true;

    System.out.println("masukkan angka");
    n = s.nextInt();

    if (n == 0 || n== 1) {
        angka_prima = false;
        
    }else {
        for (i=2; i <= n / 2; i++) {
            if (n % i == 0) {
                angka_prima = false;
                break;
            }
        }
    }
    if (angka_prima) {
    System.out.println(n + "adalah angka prima");
    }else { 
    System.out.println(n + "bukan angka prima");
    }
}