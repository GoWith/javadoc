package com.jd.crm.api.web.context;

import com.jd.crm.api.web.domain.ApiVersionEntity;
import com.jd.crm.api.web.domain.RegistrarEntity;
import com.jd.crm.api.web.respository.VersionMongoRepository;
import com.jd.crm.api.web.worker.PullJavaDocRunnable;
import com.jd.crm.api.web.worker.SingletonThreadPool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/**
 * Create by maoyi on 2018/11/28
 * don't worry be happy!
 * @author maoyi
 */
@Service
public class VersionService {

    private final VersionMongoRepository versionMongoRepository;

    @Autowired
    public VersionService(VersionMongoRepository versionMongoRepository) {
        this.versionMongoRepository = versionMongoRepository;
    }

    /**
     * <p>save.</p>
     */
    public void save(ApiVersionEntity versionEntity){
        versionMongoRepository.insert(versionEntity);
        SingletonThreadPool.getThreadPoolInstance().submit(new PullJavaDocRunnable(versionEntity));
    }

    public List<ApiVersionEntity> find(){
       return versionMongoRepository.findAll();
    }
}
