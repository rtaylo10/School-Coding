// Generated code from Butter Knife. Do not modify!
package io.bloco.cardcase.presentation.common;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class SearchToolbar$$ViewBinder<T extends io.bloco.cardcase.presentation.common.SearchToolbar> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689655, "field 'field'");
    target.field = finder.castView(view, 2131689655, "field 'field'");
    view = finder.findRequiredView(source, 2131689654, "method 'onCloseClicked'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onCloseClicked();
        }
      });
  }

  @Override public void unbind(T target) {
    target.field = null;
  }
}
