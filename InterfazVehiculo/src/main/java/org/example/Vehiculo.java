package org.example;

public interface Vehiculo {
    public static final int VELOCIDAD_MAXIMA = 160;
    public static final char CLASIFICACION_EFICIENCIA = 'A';

    public boolean encender();
    public void avanzar();
    public void frenar();
    public boolean apagar();
}
