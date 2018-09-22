// Generated code from Butter Knife. Do not modify!
package io.bloco.cardcase.presentation.developer;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class DevActivity$$ViewBinder<T extends io.bloco.cardcase.presentation.developer.DevActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689621, "field 'testModeSwitch'");
    target.testModeSwitch = finder.castView(view, 2131689621, "field 'testModeSwitch'");
    view = finder.findRequiredView(source, 2131689619, "field 'numTestCards'");
    target.numTestCards = finder.castView(view, 2131689619, "field 'numTestCards'");
    view = finder.findRequiredView(source, 2131689618, "field 'incrementer'");
    target.incrementer = finder.castView(view, 2131689618, "field 'incrementer'");
    view = finder.findRequiredView(source, 2131689616, "field 'decrementer'");
    target.decrementer = finder.castView(view, 2131689616, "field 'decrementer'");
    view = finder.findRequiredView(source, 2131689617, "field 'generator'");
    target.generator = finder.castView(view, 2131689617, "field 'generator'");
  }

  @Override public void unbind(T target) {
    target.testModeSwitch = null;
    target.numTestCards = null;
    target.incrementer = null;
    target.decrementer = null;
    target.generator = null;
  }
}
