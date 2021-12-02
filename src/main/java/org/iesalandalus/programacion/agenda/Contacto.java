package org.iesalandalus.programacion.agenda;

public class Contacto {
    private static final String ER_TELEFONO = "[6789][0-9]{8}";
    private static final String ER_CORREO = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private String nombre;
    private String telefono;
    private String correo;

}
