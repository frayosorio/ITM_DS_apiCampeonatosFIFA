package apicampeonatosfifa.apicampeonatosfifa.core.interfaces.repositorios;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import apicampeonatosfifa.apicampeonatosfifa.dominio.entidades.Campeonato;
import apicampeonatosfifa.apicampeonatosfifa.dominio.entidades.Grupo;

@Repository
public interface ICampeonatoRepositorio extends JpaRepository<Campeonato, Integer> {

    @Query("SELECT c FROM Campeonato c WHERE c.nombre LIKE '%' || ?1 || '%'")
    public List<Campeonato> buscar(String nombre);

    @Query("SELECT g FROM Grupo g WHERE g.campeonato.id = ?1")
    public List<Grupo> obtenerGrupos(Integer id);

}
