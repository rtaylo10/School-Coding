// Generated code from Butter Knife. Do not modify!
package io.bloco.cardcase.presentation.developer;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class DevActivity$$ViewBinder<T extends io.bloco.cardcase.presentation.developer.DevActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689628, "field 'numTestCards'");
    target.numTestCards = finder.castView(view, 2131689628, "field 'numTestCards'");
    view = finder.findRequiredView(source, 2131689627, "field 'incrementer'");
    target.incrementer = finder.castView(view, 2131689627, "field 'incrementer'");
    view = finder.findRequiredView(source, 2131689625, "field 'decrementer'");
    target.decrementer = finder.castView(view, 2131689625, "field 'decrementer'");
    view = finder.findRequiredView(source, 2131689626, "field 'generator'");
    target.generator = finder.castView(view, 2131689626, "field 'generator'");
  }

  @Override public void unbind(T target) {
    target.numTestCards = null;
    target.incrementer = null;
    target.decrementer = null;
    target.generator = null;
  }
}
