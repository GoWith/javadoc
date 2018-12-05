package com.jd.crm.api.web.respository;

import com.jd.crm.api.web.domain.ApiVersionEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Create by maoyi on 2018/12/5
 * don't worry be happy!
 *
 * @author maoyi
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class VersionMongoRepositoryTest {

    @Autowired
    private VersionMongoRepository versionMongoRepository;

}