package com.jd.crm.api.web.respository;

import com.jd.crm.api.web.ApiWebApplication;
import com.jd.crm.api.web.domain.ApiVersionEntity;
import com.jd.crm.api.web.domain.RegistrarEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;

/**
 * Create by maoyi on 2018/11/26
 * don't worry be happy!
 *
 * @author maoyi
 * @version $Id: $Id
 */
@RepositoryDefinition(domainClass = ApiVersionEntity.class , idClass = String.class)
public interface VersionMongoRepository extends MongoRepository<ApiVersionEntity,String>{

    ApiVersionEntity findByGroupIdAndArtifactIdAndVersion(String groupId, String artifactId, String version);

    List<ApiVersionEntity> findByGroupIdAndArtifactId(String groupId, String artifactId);
}
