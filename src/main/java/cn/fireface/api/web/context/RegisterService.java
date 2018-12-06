package cn.fireface.api.web.context;

import cn.fireface.api.web.domain.RegistrarEntity;
import cn.fireface.api.web.respository.RegisterMongoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
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
        mongoRepository.insert(registrarEntity);
    }
}
