package org.starichkov.java.spring.mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

/**
 * @author Vadim Starichkov
 * @since 09.01.2018 11:45
 */
@Service
public class SampleService {
    private MongoTemplate mongoTemplate;

    @Autowired
    public void setMongoTemplate(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public String getDbName() {
        return mongoTemplate.getDb().getName();
    }

    public void save(Sample sample) {
        mongoTemplate.save(sample);
    }

    public Sample get(Object id) {
        return mongoTemplate.findById(id, Sample.class);
    }
}
