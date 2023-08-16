public class ArregloDos {
    public static void main(String[] args) {
        int vec[] = new int[4];
        vec[0] = 2;
        vec[1] = 6;
        vec[2] = 10;
        vec[3] = 22;
        ImprimirArreglo(vec);
    }
    static void ImprimirArreglo(int []arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("vec[" + i + "] = " + arreglo[i]);
        }
    }
}
