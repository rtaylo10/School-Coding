// Generated code from Butter Knife. Do not modify!
package io.bloco.cardcase.presentation.common;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class Toolbar$$ViewBinder<T extends io.bloco.cardcase.presentation.common.Toolbar> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689641, "field 'title'");
    target.title = finder.castView(view, 2131689641, "field 'title'");
    view = finder.findRequiredView(source, 2131689640, "field 'iconStart'");
    target.iconStart = finder.castView(view, 2131689640, "field 'iconStart'");
    view = finder.findRequiredView(source, 2131689642, "field 'iconEnd'");
    target.iconEnd = finder.castView(view, 2131689642, "field 'iconEnd'");
    view = finder.findRequiredView(source, 2131689643, "field 'iconDev'");
    target.iconDev = finder.castView(view, 2131689643, "field 'iconDev'");
  }

  @Override public void unbind(T target) {
    target.title = null;
    target.iconStart = null;
    target.iconEnd = null;
    target.iconDev = null;
  }
}
