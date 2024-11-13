package apicampeonatosfifa.apicampeonatosfifa.presentacion;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import apicampeonatosfifa.apicampeonatosfifa.core.interfaces.servicios.IGrupoServicio;
import apicampeonatosfifa.apicampeonatosfifa.dominio.DTOs.TablaPosicionDto;

@RestController
@RequestMapping("/api/grupos")
public class GrupoControlador {

    private IGrupoServicio servicio;

    public GrupoControlador(IGrupoServicio servicio) {
        this.servicio = servicio;
    }

    @RequestMapping(value = "/posiciones/{id}", method = RequestMethod.GET)
    public List<TablaPosicionDto> obtenerPosiciones(@PathVariable int id){
        return servicio.obtenerTablaPosiciones(id);
    }


}
