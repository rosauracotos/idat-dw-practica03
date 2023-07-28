package idat.dw.practica03;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "instrumentos", path = "instrumentos")
public interface InstrumentoRepository extends PagingAndSortingRepository<Instrumento, Integer>, CrudRepository<Instrumento, Integer> {
}
