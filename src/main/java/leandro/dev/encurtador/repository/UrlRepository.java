package leandro.dev.encurtador.repository;

import leandro.dev.encurtador.entitys.UrlEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UrlRepository extends MongoRepository<UrlEntity, String> {
}
