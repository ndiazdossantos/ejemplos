/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploherdanza;

/**
 *
 * @author noese
 */
public class Libro extends Publicacion{
    private String isbn;
    private String autor;
    private String titulo;

    public Libro() {
        super();
    }

    public Libro(int paxinas,float prezo,String isbn, String autor, String titulo) {
        super(paxinas,prezo);
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return super.toString()+"isbn=" + isbn + ", autor=" + autor + ", titulo=" + titulo;
    }
    
    @Override
    public void amosar(){
        System.out.println("Son un libro");
    }
    
}
