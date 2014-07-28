import dagger.ObjectGraph;
import module.ProductionModule;
import play.Application;
import play.GlobalSettings;

public class Global extends GlobalSettings {

    private ObjectGraph objectGraph;

    @Override
    public void beforeStart(Application app) {
        super.beforeStart(app);
        objectGraph = ObjectGraph.create(new ProductionModule());
    }

    @Override
    public <A> A getControllerInstance(Class<A> controllerClass) throws Exception {
        return objectGraph.get(controllerClass);
    }
}
