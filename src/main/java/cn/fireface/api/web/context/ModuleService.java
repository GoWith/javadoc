package cn.fireface.api.web.context;

import cn.fireface.api.web.domain.ApiModuleEntity;
import cn.fireface.api.web.respository.ModuleMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by 灰色十三月 on 2018/12/5
 * don't worry be happy!
 *
 * @author 灰色十三月
 */
@Service
public class ModuleService {
    private final ModuleMongoRepository moduleMongoRepository;

    @Autowired
    public ModuleService(ModuleMongoRepository moduleMongoRepository) {
        this.moduleMongoRepository = moduleMongoRepository;
    }

    public void save(ApiModuleEntity apiModuleEntity) {
        moduleMongoRepository.save(apiModuleEntity);
    }

    public boolean exist(ApiModuleEntity apiModuleEntity) {
        return null != moduleMongoRepository.findByGroupIdAndArtifactId(apiModuleEntity.getGroupId(), apiModuleEntity.getArtifactId());
    }

    public List<ApiModuleEntity> findQuickly(String query){
        return moduleMongoRepository.findByGroupIdLikeOrArtifactIdLike(query,query);
    }

    public List<ApiModuleEntity> findByGroupId(String groupId){
        return moduleMongoRepository.findByGroupId(groupId);
    }

    public ApiModuleEntity findByGroupIdAndArtifactId(String groupId,String artifactId){
        return moduleMongoRepository.findByGroupIdAndArtifactId(groupId,artifactId);
    }
}
