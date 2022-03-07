package springbootwebfluxapirest.app.models.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import springbootwebfluxapirest.app.models.documents.Categoria;



public interface CategoriaDao extends ReactiveMongoRepository<Categoria, String>{

}
