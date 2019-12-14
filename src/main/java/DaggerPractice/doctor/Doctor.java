package DaggerPractice.doctor;

import DaggerPractice.body.Body;
import DaggerPractice.modules.RandomInjectionModule;
import dagger.Component;
import dagger.Module;

@Component(modules = RandomInjectionModule.class)
public interface Doctor {
    Body injectBlood();
}
