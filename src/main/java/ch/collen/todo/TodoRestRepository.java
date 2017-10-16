package ch.collen.todo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by cyril on 16/10/17.
 */
@RepositoryRestResource(path = "/todo")
public interface TodoRestRepository extends PagingAndSortingRepository<Todo, Long>{
}
