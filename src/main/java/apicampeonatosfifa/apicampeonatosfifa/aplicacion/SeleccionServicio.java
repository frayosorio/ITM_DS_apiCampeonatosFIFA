package apicampeonatosfifa.apicampeonatosfifa.aplicacion;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import apicampeonatosfifa.apicampeonatosfifa.core.dominio.Seleccion;
import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.repositorios.ISeleccionRepositorio;
import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.servicios.ISeleccionServicio;

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
    public Seleccion obtener(int id) {
        Optional<Seleccion> seleccion = repositorio.findById(id);
        return seleccion.isEmpty() ? null : seleccion.get();
    }

    @Override
    public List<Seleccion> buscar(String nombre) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscar'");
    }

    @Override
    public Seleccion agregar(Seleccion seleccion) {
        seleccion.setId(0);
        return repositorio.save(seleccion);
    }

    @Override
    public Seleccion modificar(Seleccion seleccion) {
        Optional<Seleccion> seleccionEncontrada = repositorio.findById(seleccion.getId());
        return seleccionEncontrada.isEmpty() ? null : repositorio.save(seleccion);
    }

    @Override
    public boolean eliminar(int id) {
        try {
            repositorio.deleteById(id);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

}
