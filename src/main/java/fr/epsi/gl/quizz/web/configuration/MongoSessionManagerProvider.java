package fr.epsi.gl.quizz.web.configuration;

import com.google.common.collect.Lists;
import com.mongodb.ServerAddress;
import org.mongolink.MongoSessionManager;
import org.mongolink.Settings;
import org.mongolink.domain.UpdateStrategies;
import org.mongolink.domain.mapper.ContextBuilder;

import javax.inject.Provider;
import java.util.ArrayList;

public class MongoSessionManagerProvider implements Provider<MongoSessionManager> {
    @Override
    public MongoSessionManager get() {
        /*Settings settings = Settings.defaultInstance()
                .withDefaultUpdateStrategy(UpdateStrategies.DIFF)
                .withDbName("db")
                .withHost("mongodb://cloudbees:9951e0fe3d6eedbc40213112625ac63f@linus.mongohq.com:10027/rzG1TpwGpZDTFe4QS2HI9Q")
                .withPort(10027);
         */
        return MongoSessionManager.create(new ContextBuilder("fr.epsi.gl.quizz.persistance.mongo.mapping"), Settings.defaultInstance().withDbName("quizz").withDefaultUpdateStrategy(UpdateStrategies.DIFF).withHost("mongodb://cloudbees:9951e0fe3d6eedbc40213112625ac63f@linus.mongohq.com:10027/rzG1TpwGpZDTFe4QS2HI9Q").withPort(10027));
        //return MongoSessionManager.create(new ContextBuilder("fr.epsi.gl.quizz.persistance.mongo.mapping"), settings);
    }
}
