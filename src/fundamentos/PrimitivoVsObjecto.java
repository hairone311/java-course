package fundamentos;

public class PrimitivoVsObjecto {

    public static void main(String[] args) {

        String s = new String("Texto");
        s.toUpperCase();

        // Wrappers são a versão objecto dos tipos primitivos
        int a = 0;
        System.out.println(a);
    }
}
