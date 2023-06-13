package com.java.parcial;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class InmuebleRepositoryImpl implements InmuebleRepository{
    private List<Inmueble>inmuebles;
    public InmuebleRepositoryImpl()throws IOException, ClassNotFoundException{
        inmuebles = new ArrayList<>();
    }

    @Override
    public Inmueble findById(int Id) {
        return (Inmueble) inmuebles;
    }

    public List<Inmueble> findAll() throws IOException, ClassNotFoundException {
        inmuebles = (List<Inmueble>) ObjectSerializer.readObjectFromFile("inmuebles.ax");
        return inmuebles;
    }

    @Override
    public void listar(Inmueble inmueble) throws IOException {

    }

    @Override
    public void consultar(Inmueble inmueble) throws IOException {

    }


    @Override
    public void guardar(Inmueble inmueble) throws IOException {
        inmuebles.add(inmueble);
        ObjectSerializer.writeObjectToFile(inmuebles, "inmuebles.ax");
    }

    @Override
    public void modificar(Inmueble inmueble) throws IOException {
        Inmueble inmueble1 = findById(inmueble.getId());
        if (inmueble1 != null) {
            inmuebles.remove(inmueble1);
            inmuebles.add(inmueble);
            ObjectSerializer.writeObjectToFile(inmuebles, "inmuebles.ax");
        }
    }

    @Override
    public void borrar(Inmueble inmueble) throws IOException {
        inmuebles.remove(inmueble);
        ObjectSerializer.writeObjectToFile(inmuebles, "inmuebles.ax");
    }
}
