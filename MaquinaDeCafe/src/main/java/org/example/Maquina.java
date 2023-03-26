package org.example;

public class Maquina {
    private String marca;
    private Contenedor agua;
    private Contenedor crema;
    private Contenedor cafe;
    private Vasos vasosDisponibles;

    public Maquina() {
    }

    public Maquina(String marca, Contenedor agua, Contenedor crema, Contenedor cafe, Vasos vasosDisponibles) {
        this.marca = marca;
        this.agua = agua;
        this.crema = crema;
        this.cafe = cafe;
        this.vasosDisponibles = vasosDisponibles;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Contenedor getAgua() {
        return agua;
    }

    public void setAgua(Contenedor agua) {
        this.agua = agua;
    }

    public Contenedor getCrema() {
        return crema;
    }

    public void setCrema(Contenedor crema) {
        this.crema = crema;
    }

    public Contenedor getCafe() {
        return cafe;
    }

    public void setCafe(Contenedor cafe) {
        this.cafe = cafe;
    }

    public Vasos getVasosDisponibles() {
        return vasosDisponibles;
    }

    public void setVasosDisponibles(Vasos vasosDisponibles) {
        this.vasosDisponibles = vasosDisponibles;
    }

    @Override
    public String toString() {
        return "Maquina{" +
                "marca='" + marca + '\'' +
                ", agua=" + agua +
                ", crema=" + crema +
                ", cafe=" + cafe +
                ", vasosDisponibles=" + vasosDisponibles +
                '}';
    }
    public void Americano(){
        if (getCafe().getCapacidad() >= 20 && getAgua().getCapacidad() >= 180 && getCrema().getCapacidad() >= 70 && getVasosDisponibles().getCantidad() >= 1) {
            System.out.println("Preparando Americano...");
            int auxagua = getAgua().getCapacidad();
            int auxcafe = getCafe().getCapacidad();
            int auxvasos = getVasosDisponibles().getCantidad();
            auxagua = auxagua - 180;
            auxcafe = auxcafe - 15;
            auxvasos = auxvasos - 1;
            getAgua().setCapacidad(auxagua);
            getCafe().setCapacidad(auxcafe);
            getVasosDisponibles().setCantidad(auxvasos);
            System.out.println("Que disfrute su americano!!");
            System.out.println("----------------------------------------------");
            System.out.println("Recursos suficientes para mas preparaciones!!");

        }
        else {
            System.out.println("Recursos agotados");
        }

    }
    public void Expreso(){
        if (getCafe().getCapacidad() >= 20 && getAgua().getCapacidad() >= 180 && getCrema().getCapacidad() >= 70 && getVasosDisponibles().getCantidad() >= 1) {
            System.out.println("Preparando expreso...");
            int auxagua = getAgua().getCapacidad();
            int auxcafe = getCafe().getCapacidad();
            int auxvasos = getVasosDisponibles().getCantidad();
            auxagua = auxagua - 120;
            auxcafe = auxcafe - 20;
            auxvasos = auxvasos - 1;
            getAgua().setCapacidad(auxagua);
            getCafe().setCapacidad(auxcafe);
            getVasosDisponibles().setCantidad(auxvasos);
            System.out.println("Que disfrute su expreso!!");
            System.out.println("----------------------------------------------");
            System.out.println("Recursos suficientes para mas preparaciones!!");
        }
        else {
            System.out.println("Recursos agotados");
        }
    }

    public void Capuccino(){
        if (getCafe().getCapacidad() >= 20 && getAgua().getCapacidad() >= 180 && getCrema().getCapacidad() >= 70 && getVasosDisponibles().getCantidad() >= 1) {
            System.out.println("Preparando Capuccino...");
            int auxagua = getAgua().getCapacidad();
            int auxcafe = getCafe().getCapacidad();
            int auxcrema = getCrema().getCapacidad();
            int auxvasos = getVasosDisponibles().getCantidad();
            auxagua = auxagua - 100;
            auxcafe = auxcafe - 14;
            auxcrema = auxcrema - 70;
            auxvasos = auxvasos - 1;
            getAgua().setCapacidad(auxagua);
            getCafe().setCapacidad(auxcafe);
            getCrema().setCapacidad(auxcrema);
            getVasosDisponibles().setCantidad(auxvasos);
            System.out.println("Que disfrute su Capuccino!!");
            System.out.println("----------------------------------------------");
            System.out.println("Recursos suficientes para mas preparaciones!!");
        }
        else {
            System.out.println("Recursos Agotados");
        }

    }
    public void ComprobacionEstado(){
        System.out.println("La cantidad de agua restante es: " + getAgua().getCapacidad() + " ml");
        System.out.println("La cantidad de cafe restante es: " + getCafe().getCapacidad() + " gr");
        System.out.println("La cantidad de crema restante es: " + getCrema().getCapacidad() + " ml");
        System.out.println("Vasos Restantes: " + getVasosDisponibles().getCantidad());
    }
}
