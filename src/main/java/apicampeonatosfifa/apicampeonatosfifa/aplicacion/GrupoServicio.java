package apicampeonatosfifa.apicampeonatosfifa.aplicacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.repositorios.IGrupoRepositorio;
import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.servicios.IGrupoServicio;
import apicampeonatosfifa.apicampeonatosfifa.dominio.DTOs.TablaPosicionDto;
import apicampeonatosfifa.apicampeonatosfifa.dominio.entidades.Grupo;
import jakarta.persistence.EntityManager;

@Service
public class GrupoServicio implements IGrupoServicio {

    private IGrupoRepositorio repositorio;

    @Autowired
    private EntityManager em; 

    public GrupoServicio(IGrupoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Grupo> listar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'listar'");
    }

    @Override
    public Grupo obtener(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'obtener'");
    }

    @Override
    public List<Grupo> buscar(String nombre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }

    @Override
    public Grupo agregar(Grupo pais) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'agregar'");
    }

    @Override
    public Grupo modificar(Grupo pais) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modificar'");
    }

    @Override
    public boolean eliminar(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eliminar'");
    }

    @Override
    public List<TablaPosicionDto> obtenerTablaPosiciones(int id) {
        List<TablaPosicionDto> posiciones=em.createNativeQuery("SELECT * FROM fObtenerTablaPosiciones(:idGrupoTabla)", TablaPosicionDto.class)
                                .setParameter("idGrupoTabla", id)
                                .getResultList();
        return posiciones;
    }

}
