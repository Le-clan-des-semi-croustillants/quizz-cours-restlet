package fr.epsi.gl.quizz.web.configuration;


import org.mongolink.MongoSessionManager;
import org.mongolink.Settings;
import org.mongolink.domain.UpdateStrategies;
import org.mongolink.domain.mapper.ContextBuilder;

import javax.inject.Provider;

public class MongoSessionManagerProvider implements Provider<MongoSessionManager> {

    @Override
    public MongoSessionManager get() {
        /*Settings settings = Settings.defaultInstance()
                .withDefaultUpdateStrategy(UpdateStrategies.DIFF)
                .withDbName("lcdsct/QuizzDataBase")
                .withHost("linus.mongohq.com")
                .withPort(10027)
                .withAuthentication("lcdsct", "lcdsct123");
         */


        //return MongoSessionManager.create(new ContextBuilder("fr.epsi.gl.quizz.persistance.mongo.mapping"), Settings.defaultInstance().withDbName("quizz").withDefaultUpdateStrategy(UpdateStrategies.DIFF));
        //return MongoSessionManager.create(new ContextBuilder("fr.epsi.gl.quizz.persistance.mongo.mapping"), settings);
        return MongoSessionManager.create(new ContextBuilder("fr.epsi.gl.quizz.persistance.mongo.mapping"),
                Settings.defaultInstance()
                        .withDbName("lcdsct/QuizzDataBase")
                        .withDefaultUpdateStrategy(UpdateStrategies.DIFF));
    }
}
