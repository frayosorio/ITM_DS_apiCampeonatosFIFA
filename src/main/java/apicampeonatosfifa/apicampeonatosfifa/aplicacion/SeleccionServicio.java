package apicampeonatosfifa.apicampeonatosfifa.aplicacion;

import java.util.List;

import org.springframework.stereotype.Service;

import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.repositorios.ISeleccionRepositorio;
import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.servicios.ISeleccionServicio;
import apicampeonatosfifa.apicampeonatosfifa.dominio.entidades.Seleccion;

@Service
public class SeleccionServicio implements ISeleccionServicio {

    private ISeleccionRepositorio repositorio;

    public SeleccionServicio(ISeleccionRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public List<Seleccion> listar() {
        return repositorio.findAll();
    }

    @Override
    public Seleccion obtener(Integer id) {
        return repositorio.findById(id).isEmpty() ? null : repositorio.findById(id).get();
    }

    @Override
    public List<Seleccion> buscar(String nombre) {
        return repositorio.buscar(nombre);
    }

    @Override
    public Seleccion agregar(Seleccion pais) {
        pais.setId(0);
        return repositorio.save(pais);
    }

    @Override
    public Seleccion modificar(Seleccion pais) {
        if (!repositorio.findById(pais.getId()).isEmpty()) {
            return repositorio.save(pais);
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

}
