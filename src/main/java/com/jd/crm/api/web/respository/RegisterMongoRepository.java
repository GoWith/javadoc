package com.jd.crm.api.web.respository;

import com.jd.crm.api.web.domain.RegistrarEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.RepositoryDefinition;

/**
 * Create by maoyi on 2018/11/26
 * don't worry be happy!
 *
 * @author maoyi
 * @version $Id: $Id
 */
@RepositoryDefinition(domainClass = com.jd.crm.api.web.domain.RegistrarEntity.class , idClass = String.class)
public interface RegisterMongoRepository extends MongoRepository<RegistrarEntity,String>{
}
