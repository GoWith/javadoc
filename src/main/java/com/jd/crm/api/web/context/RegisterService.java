package com.jd.crm.api.web.context;

import com.jd.crm.api.web.domain.RegistrarEntity;
import com.jd.crm.api.web.respository.RegisterMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;

/**
 * Create by maoyi on 2018/11/26
 * don't worry be happy!
 *
 * @author maoyi
 * @version $Id: $Id
 */
@Service
public class RegisterService {

    @Autowired
    private RegisterMongoRepository mongoRepository;

    /**
     * <p>listAll.</p>
     */
    public void listAll(){
        mongoRepository.findAll(new Example<RegistrarEntity>() {
            @Override
            public RegistrarEntity getProbe() {
                return null;
            }

            @Override
            public ExampleMatcher getMatcher() {
                return null;
            }
        });
    }

    /**
     * <p>save.</p>
     */
    public void save(){
        RegistrarEntity registrarEntity = new RegistrarEntity();
        registrarEntity.setAppLeaderEmail("maoyi12");
        registrarEntity.setAppLeaderEmail("maoyi@jd.com");
        mongoRepository.insert(registrarEntity);
    }
}
