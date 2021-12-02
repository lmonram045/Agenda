package org.iesalandalus.programacion.agenda;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contacto {
    private static final String ER_TELEFONO = "[6789][0-9]{8}";
    private static final String ER_CORREO = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private String nombre;
    private String telefono;
    private String correo;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (Objects.equals(nombre, ""))
            throw new IllegalArgumentException("El nombre de un contacto no puede ser nulo o vacío.");

        if (nombre == null)
            throw new NullPointerException("El nombre de un contacto no puede ser nulo o vacío.");

        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (Objects.equals(telefono, ""))
            throw new IllegalArgumentException("El teléfono de un contacto no puede ser nulo o vacío.");

        if (telefono == null)
            throw new NullPointerException("El teléfono de un contacto no puede ser nulo o vacío.");

        Pattern pattern = Pattern.compile(ER_TELEFONO);

        Matcher matcher = pattern.matcher(telefono);

        if (!matcher.matches()) {

            throw new IllegalArgumentException("El teléfono no tiene un formato válido.");

        }

        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (Objects.equals(correo, ""))
            throw new IllegalArgumentException("El correo de un contacto no puede ser nulo o vacío.");

        if (correo == null)
            throw new NullPointerException("El correo de un contacto no puede ser nulo o vacío.");

        this.correo = correo;
    }
}
