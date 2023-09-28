public class Libro {

    String nombre, autor, editorial;

    Libro(String nombre, String autor, String editorial){

        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }
}
