// Generated code from Butter Knife. Do not modify!
package io.bloco.cardcase.presentation.home;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CardDetailDialog$$ViewBinder<T extends io.bloco.cardcase.presentation.home.CardDetailDialog> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689607, "field 'cardInfoView'");
    target.cardInfoView = finder.castView(view, 2131689607, "field 'cardInfoView'");
  }

  @Override public void unbind(T target) {
    target.cardInfoView = null;
  }
}
