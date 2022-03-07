package springbootwebfluxapirest.app.models.dao;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import springbootwebfluxapirest.app.models.documents.Producto;



public interface ProductoDao extends ReactiveMongoRepository<Producto, String>{

}
