import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Libro> listaLibros;
    String nombreBiblioteca, direccion;

    Biblioteca(ArrayList<Libro> listaLibros, String nombreBiblioteca, String direccion){

        this.listaLibros = listaLibros;
        this.nombreBiblioteca = nombreBiblioteca;
        this.direccion = direccion;

    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getNombreBiblioteca() {
        return nombreBiblioteca;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setListaLibros(ArrayList<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public void setNombreBiblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
    }
}
