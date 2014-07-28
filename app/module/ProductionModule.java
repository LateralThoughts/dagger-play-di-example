package module;

import controllers.Application;
import dagger.Module;
import service.CoffeeService;

@Module(
        injects = {
                Application.class
        }
)
public class ProductionModule {
}
