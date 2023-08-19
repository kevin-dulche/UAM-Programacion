public class MetodosSobrecarga {
    public static void main(String[] args) throws Exception {
        MetodosSobrecarga ms = new MetodosSobrecarga();
        int res = ms.suma(3, 5);
        System.out.println(res);
        res = ms.suma(4, 7, 9);
        System.out.println(res);
        double resf = ms.suma(8, 9.9);
        System.out.println(resf);
    }

    public int suma(int a, int b) {
        int res = a + b;
        return res;
    }

    public int suma(int a, int b, int c) {
        int res = a + b + c;
        return res;
    }

    public double suma(int a, double d) {
        double res = a + d;
        return res;
    }
}