package com.pildorasinformaticas.colecciones;

import java.util.Objects;

public class Libro {
    private String autor;
    private String titulo;
    private int isbn;

    public Libro(String autor, String titulo, int isbn) {
        this.autor = autor;
        this.titulo = titulo;
        this.isbn = isbn;
    }

    public String obtenerInformacion() {
        return "Autor: " + autor + ", Titulo: " + titulo + ", ISBN: " + isbn;
    }

	@Override
	public int hashCode() {
		return Objects.hash(isbn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return isbn == other.isbn;
	}

 /* public boolean equals(Object obj) {// el metodo equals es true o false tiene que tener un return

	  Libro otrolibro=(Libro)obj; // aqui vamos a tener que hacer un casting
		
	 
	  if(obj instanceof Libro) {
	
		  if( this.isbn==otrolibro.isbn)
			  
			  return true;
			 
			  else return false;

	  }
	  else return false;*/
  }
	
  


