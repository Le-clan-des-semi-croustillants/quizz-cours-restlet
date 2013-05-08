package fr.epsi.gl.quizz.web.configuration;


import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;
import fr.epsi.gl.quizz.domaine.Entrepots;
import fr.epsi.gl.quizz.web.QuizzApplication;
import org.restlet.Application;
import org.restlet.Context;
import org.restlet.ext.servlet.ServerServlet;

public class QuizzServlet extends ServerServlet {

    @Override
    protected Application createApplication(Context parentContext) {
        Injector injector = Guice.createInjector(Stage.PRODUCTION, new GuiceProductionModule());
        Entrepots.setInstance(injector.getInstance(Entrepots.class));
        return new QuizzApplication(parentContext, injector);
    }
}
