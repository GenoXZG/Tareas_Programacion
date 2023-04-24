package Herenciamultiple;

public class AlumnoExtraordinario extends Alumno implements Deportista,Artista{
    private int Id;
    private String deporte;
    private String arte;

    public AlumnoExtraordinario() {
    }

    public AlumnoExtraordinario(String nombre, int edad, int numCuenta, double promedio, String carrera, int id, String deporte, String arte) {
        super(nombre, edad, numCuenta, promedio, carrera);
        Id = id;
        this.deporte = deporte;
        this.arte = arte;
    }

    public int getId() {
        return Id;
    }


    public void setId(int id) {
        Id = id;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getArte() {
        return arte;
    }

    public void setArte(String arte) {
        this.arte = arte;
    }

    @Override
    public String toString() {
        return
             super.toString() +  "AlumnoExtraordinario{" +
                "Id=" + Id +
                ", deporte='" + deporte + '\'' +
                ", arte='" + arte + '\'' +
                '}';
    }

    @Override
    public int ensyar(String disciplina) {
        System.out.println(getNombre() + " esta ensayando " + getArte());
        return 2;
    }

    @Override
    public boolean presentarObra() {
        System.out.println(getNombre() + " esta presentando su obra ");
        return true;
    }

    @Override
    public int entrenar() {
        System.out.println(getNombre() + " esta entrenando " + getDeporte());
        return 2;
    }

    @Override
    public boolean competir(String ubicacion) {
        System.out.println(getNombre() + " esta compitiendo en: " + ubicacion);
        return true;
    }
}
