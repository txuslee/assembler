package com.zyncro.assembler.application.component;

import android.app.Activity;

import com.zyncro.assembler.application.module.ActivityModule;
import com.zyncro.assembler.application.scope.PerActivity;

import dagger.Component;

/**
 * A base component upon which fragment's components may depend.
 * Activity-level components should extend this component.
 * <p/>
 * Subtypes of ActivityComponent should be decorated with annotation:
 * {@link com.zyncro.assembler.application.scope.PerActivity}
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    //Exposed to sub-graphs.
    Activity activity();
}