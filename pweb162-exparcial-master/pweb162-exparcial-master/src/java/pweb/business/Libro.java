package pweb.business;

import java.io.Serializable;

public class Libro implements Serializable {

    private String Codigo;
    private String Titulo;
    private String Autor;
    private String Genero;
    
    private double Precio;
    private double descuento;
    private int cantidad_de_hojas;

    public Libro() {
        this.Codigo = "";
        this.Titulo = "";
        this.Autor = "";
        this.Genero = "";
        this.Precio = 0;
         this.descuento = 0;
         this.cantidad_de_hojas=0;
    }

    public Libro(String Codigo, String Titulo, String Autor, String Genero, double Precio,double descuento,int cantidad_de_hojas) {
        this.Codigo = Codigo;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Genero = Genero;
        this.Precio = Precio;
        this.descuento = descuento;
        this.cantidad_de_hojas = cantidad_de_hojas;
    }
    
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
public double getdescuento() {
        return descuento;
    }

    public void setdescuento(double descuento) {
        this.descuento = descuento;
    }
    public double getcantidad_de_hojas() {
        return cantidad_de_hojas;
    }

    public void setcantidad_de_hojas(int cantidad_de_hojas) {
        this.cantidad_de_hojas = cantidad_de_hojas;
    }
    
}
