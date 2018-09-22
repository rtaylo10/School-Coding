// Generated code from Butter Knife. Do not modify!
package io.bloco.cardcase.presentation.user;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class UserActivity$$ViewBinder<T extends io.bloco.cardcase.presentation.user.UserActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689601, "field 'rootLayout'");
    target.rootLayout = finder.castView(view, 2131689601, "field 'rootLayout'");
    view = finder.findRequiredView(source, 2131689604, "field 'cardView'");
    target.cardView = finder.castView(view, 2131689604, "field 'cardView'");
    view = finder.findRequiredView(source, 2131689602, "field 'edit' and method 'onEditClicked'");
    target.edit = finder.castView(view, 2131689602, "field 'edit'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onEditClicked();
        }
      });
    view = finder.findRequiredView(source, 2131689603, "field 'done' and method 'onDoneClicked'");
    target.done = finder.castView(view, 2131689603, "field 'done'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onDoneClicked();
        }
      });
  }

  @Override public void unbind(T target) {
    target.rootLayout = null;
    target.cardView = null;
    target.edit = null;
    target.done = null;
  }
}
