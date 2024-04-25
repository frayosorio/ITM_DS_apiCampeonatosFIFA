package apicampeonatosfifa.apicampeonatosfifa.core.interfaces.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import apicampeonatosfifa.apicampeonatosfifa.core.dominio.Campeonato;

public interface ICampeonatoRepositorio extends JpaRepository<Campeonato, Integer> {
    
}
