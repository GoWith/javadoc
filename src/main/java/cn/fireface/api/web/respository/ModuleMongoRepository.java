package cn.fireface.api.web.respository;

import cn.fireface.api.web.domain.ApiModuleEntity;
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
@RepositoryDefinition(domainClass = ApiModuleEntity.class , idClass = String.class)
public interface ModuleMongoRepository extends MongoRepository<ApiModuleEntity,String>{
    List<ApiModuleEntity> findByGroupIdLikeOrArtifactIdLike(String groupId, String artifactId);
    List<ApiModuleEntity> findByGroupId(String groupId);
    List<ApiModuleEntity> findByArtifactId(String artifactId);
    List<ApiModuleEntity> findByGroupIdAndArtifactIdLike(String groupId, String artifactId);
    ApiModuleEntity findByGroupIdAndArtifactId(String groupId, String artifactId);
}
