package com.java.parcial;

import java.io.IOException;
import java.util.List;

public interface InmuebleRepository {
   Inmueble findById(int Id);
   List<Inmueble> findAll()throws IOException, ClassNotFoundException;
   void guardar (Inmueble inmueble)throws IOException;
   void listar(Inmueble inmueble)throws IOException;
   void consultar (Inmueble inmueble)throws IOException;
   void modificar(Inmueble inmueble)throws IOException;
   void borrar(Inmueble inmueble)throws IOException;
}
