package cn.fireface.api.web.context;

import cn.fireface.api.web.domain.ApiModuleEntity;
import cn.fireface.api.web.domain.ApiVersionEntity;
import cn.fireface.api.web.respository.VersionMongoRepository;
import cn.fireface.api.web.worker.PullJavaDocRunnable;
import cn.fireface.api.web.worker.SingletonThreadPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by maoyi on 2018/11/28
 * don't worry be happy!
 * @author maoyi
 */
@Service
public class VersionService {

    private final VersionMongoRepository versionMongoRepository;
    private final ModuleService moduleService;

    @Autowired
    public VersionService(VersionMongoRepository versionMongoRepository, ModuleService moduleService) {
        this.versionMongoRepository = versionMongoRepository;
        this.moduleService = moduleService;
    }

    /**
     * <p>save.</p>
     */
    public void save(ApiVersionEntity versionEntity){
        ApiVersionEntity entity = versionMongoRepository.findByGroupIdAndArtifactIdAndVersion(versionEntity.getGroupId(), versionEntity.getArtifactId(), versionEntity.getVersion());
        if(null == entity){
            versionMongoRepository.insert(versionEntity);
            ApiModuleEntity apiModuleEntity = new ApiModuleEntity(versionEntity.getGroupId(), versionEntity.getArtifactId(), versionEntity.getVersionDescribe(), versionEntity.getModifiedErp(), versionEntity.getModifiedEmail());
            if (!moduleService.exist(apiModuleEntity)) {
                moduleService.save(apiModuleEntity);
            }
        }
        SingletonThreadPool.getThreadPoolInstance().submit(new PullJavaDocRunnable(versionEntity));
    }

    public List<ApiVersionEntity> find(){
       return versionMongoRepository.findAll();
    }

    public List<ApiVersionEntity> findByGroupIdAndArtifactId(String groupId , String artifactId){
        return versionMongoRepository.findByGroupIdAndArtifactId(groupId,artifactId);
    }
}
