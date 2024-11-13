package apicampeonatosfifa.apicampeonatosfifa.core.interfaces.servicios;

import java.util.List;

import apicampeonatosfifa.apicampeonatosfifa.dominio.DTOs.TablaPosicionDto;
import apicampeonatosfifa.apicampeonatosfifa.dominio.entidades.Grupo;

public interface IGrupoServicio {

    public List<Grupo> listar();

    public Grupo obtener(Integer id);

    public List<Grupo> buscar(String nombre);

    public Grupo agregar(Grupo pais);

    public Grupo modificar(Grupo pais);

    public boolean eliminar(Integer id);

    public List<TablaPosicionDto> obtenerTablaPosiciones(int id);

}
