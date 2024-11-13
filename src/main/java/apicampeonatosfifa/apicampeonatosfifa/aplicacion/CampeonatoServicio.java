package apicampeonatosfifa.apicampeonatosfifa.aplicacion;

import java.util.List;

import org.springframework.stereotype.Service;

import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.repositorios.ICampeonatoRepositorio;
import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.servicios.ICampeonatoServicio;
import apicampeonatosfifa.apicampeonatosfifa.dominio.entidades.Campeonato;
import apicampeonatosfifa.apicampeonatosfifa.dominio.entidades.Grupo;

@Service
public class CampeonatoServicio implements ICampeonatoServicio {

        private ICampeonatoRepositorio repositorio;

    public CampeonatoServicio(ICampeonatoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Campeonato> listar() {
        return repositorio.findAll();
    }

    @Override
    public Campeonato obtener(Integer id) {
        return repositorio.findById(id).isEmpty() ? null : repositorio.findById(id).get();
    }

    @Override
    public List<Campeonato> buscar(String nombre) {
        return repositorio.buscar(nombre);
    }

    @Override
    public Campeonato agregar(Campeonato campeonato) {
        campeonato.setId(0);
        return repositorio.save(campeonato);
    }

    @Override
    public Campeonato modificar(Campeonato campeonato) {
        if (!repositorio.findById(campeonato.getId()).isEmpty()) {
            return repositorio.save(campeonato);
        }
        return null;
    }

    @Override
    public boolean eliminar(Integer id) {
        try {
            repositorio.deleteById(id);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    @Override
    public List<Grupo> obtenerGrupos(Integer id) {
        return repositorio.obtenerGrupos(id);
    }


}
