package cn.fireface.api.web.respository;

import cn.fireface.api.web.domain.RegistrarEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.RepositoryDefinition;

/**
 * Create by 灰色十三月 on 2018/11/26
 * don't worry be happy!
 *
 * @author 灰色十三月
 * @version $Id: $Id
 */
@RepositoryDefinition(domainClass = RegistrarEntity.class , idClass = String.class)
public interface RegisterMongoRepository extends MongoRepository<RegistrarEntity,String>{
}
