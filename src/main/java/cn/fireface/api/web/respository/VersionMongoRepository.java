package cn.fireface.api.web.respository;

import cn.fireface.api.web.domain.ApiVersionEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;

/**
 * Create by 灰色十三月 on 2018/11/26
 * don't worry be happy!
 *
 * @author 灰色十三月
 * @version $Id: $Id
 */
@RepositoryDefinition(domainClass = ApiVersionEntity.class , idClass = String.class)
public interface VersionMongoRepository extends MongoRepository<ApiVersionEntity,String>{

    ApiVersionEntity findByGroupIdAndArtifactIdAndVersion(String groupId, String artifactId, String version);

    List<ApiVersionEntity> findByGroupIdAndArtifactId(String groupId, String artifactId);
}
