package cuentas;

/**
 * Clase que gestiona una cuenta bancaria con operaciones de ingreso y retiro.
 *
 * @author Carlos Javier Velásquez Díaz
 * @version 1.0
 * @since 2025-12-04
 */
public class Cuenta {


    private String nombre;
    private String cuenta;
    private double saldo;

    /**
     * Devuelve el nombre del titular.
     *
     * @return El nombre del titular de la cuenta.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el número de cuenta.
     *
     * @return El número de cuenta.
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     *
     * @return El saldo disponible en formato double.
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece un nuevo valor para el saldo de la cuenta.
     *
     * @param saldo Nuevo saldo de la cuenta.
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Establece un nuevo número de cuenta.
     *
     * @param cuenta Nuevo número de cuenta.
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Establece el nombre del titular.
     *
     * @param nombre Nombre del titular.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Constructor vacío.
     */
    public Cuenta() {

    }

    /**
     * Constructor que inicializa los atributos básicos de la cuenta.
     *
     * @param nombre Titular de la cuenta.
     * @param cuenta Número de la cuenta (IBAN o similar).
     * @param saldo Saldo inicial de la cuenta.
     */
    public Cuenta(String nombre, String cuenta, double saldo) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
    }

    /**
     * Devuelve una representación en formato String de la cuenta.
     *
     * @return String con el titular y el número de cuenta.
     */
    @Override
    public String toString() {
        return "Titular: " + nombre + "\ncuentas.Cuenta: " + cuenta;
    }

    /**
     * Permite ingresar una cantidad de dinero en la cuenta.
     *
     * @param cantidad Cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Permite retirar una cantidad de dinero de la cuenta, si el saldo es suficiente.
     *
     * @param cantidad Cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o si no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception {

        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");

        if (saldo < cantidad)
            throw new Exception("No se hay suficiente saldo");

        saldo = saldo - cantidad;
    }
}