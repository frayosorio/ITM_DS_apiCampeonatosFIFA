package apicampeonatosfifa.apicampeonatosfifa.core.interfaces.servicios;

import java.util.List;

import apicampeonatosfifa.apicampeonatosfifa.core.dominio.Seleccion;

public interface ISeleccionServicio {
    
    public List<Seleccion> listar();

    public Seleccion obtener(int id);

    public List<Seleccion> buscar(String nombre);

    public Seleccion agregar(Seleccion Seleccion);

    public Seleccion modificar(Seleccion Seleccion);

    public boolean eliminar(int id);

}
