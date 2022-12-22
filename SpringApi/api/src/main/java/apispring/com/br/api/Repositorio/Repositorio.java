package apispring.com.br.api.Repositorio;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import apispring.com.br.api.Modelo.Pessoa;

public interface Repositorio extends CrudRepository<Pessoa, Integer> {
    
  List<Pessoa> findAll(); 
  

  Pessoa findByCodigo(Integer codigo);

    
  List<Pessoa> findByOrderByNome();
}
