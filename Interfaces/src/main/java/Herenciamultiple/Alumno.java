package Herenciamultiple;

public class Alumno extends Persona{
    private int numCuenta;
    private double promedio;
    private String carrera;

    public Alumno() {
    }

    public Alumno(int numCuenta, double promedio, String carrera) {
        this.numCuenta = numCuenta;
        this.promedio = promedio;
        this.carrera = carrera;
    }

    public Alumno(String nombre, int edad, int numCuenta, double promedio, String carrera) {
        super(nombre, edad);
        this.numCuenta = numCuenta;
        this.promedio = promedio;
        this.carrera = carrera;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "numCuenta=" + numCuenta +
                ", promedio=" + promedio +
                ", carrera='" + carrera + '\'' +
                '}';
    }
}
