package eus.birt.dam.repository;

import eus.birt.dam.domain.Desfibriladores;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DesfibriladoresRepository extends MongoRepository<Desfibriladores, String> {
}
