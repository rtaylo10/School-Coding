// Generated code from Butter Knife. Do not modify!
package io.bloco.cardcase.presentation.common;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CardViewHolder$$ViewBinder<T extends io.bloco.cardcase.presentation.common.CardViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689624, "field 'avatar'");
    target.avatar = finder.castView(view, 2131689624, "field 'avatar'");
    view = finder.findRequiredView(source, 2131689625, "field 'name'");
    target.name = finder.castView(view, 2131689625, "field 'name'");
    view = finder.findRequiredView(source, 2131689626, "field 'time'");
    target.time = finder.castView(view, 2131689626, "field 'time'");
  }

  @Override public void unbind(T target) {
    target.avatar = null;
    target.name = null;
    target.time = null;
  }
}