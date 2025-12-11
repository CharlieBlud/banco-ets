package cuentas;

public class Main {

    public static void main(String[] args) {
        Cuenta cuentaCarlos;
        cuentaCarlos = new Cuenta("Antonio López", "1000-2365-85-1230456789", 2500);
        System.out.println(cuentaCarlos.toString());
        System.out.println("\nEl saldo actual es: "+ cuentaCarlos.getSaldo());

        try {
        	System.out.println("Retiramos " + cantidadRetiro() + " en cuenta");
            cuentaCarlos.retirar(cantidadRetiro());
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingresamos " + cantidadIngreso() + " en cuenta");
            cuentaCarlos.ingresar(cantidadIngreso());
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }

        System.out.println("El saldo actual es: "+ cuentaCarlos.getSaldo());
    }

    private static int cantidadRetiro() {
        return 2000;
    }

    private static int cantidadIngreso() {
        return 600;
    }
}
