// Generated code from Butter Knife. Do not modify!
package io.bloco.cardcase.presentation.common;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CardInfoView$$ViewBinder<T extends io.bloco.cardcase.presentation.common.CardInfoView> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689624, "field 'avatar' and method 'pickAvatar'");
    target.avatar = finder.castView(view, 2131689624, "field 'avatar'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.pickAvatar();
        }
      });
    view = finder.findRequiredView(source, 2131689648, "field 'avatarEditOverlay'");
    target.avatarEditOverlay = view;
    view = finder.findRequiredView(source, 2131689625, "field 'name'");
    target.name = finder.castView(view, 2131689625, "field 'name'");
    view = finder.findRequiredView(source, 2131689649, "field 'email' and method 'clickEmail'");
    target.email = finder.castView(view, 2131689649, "field 'email'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.clickEmail();
        }
      });
    view = finder.findRequiredView(source, 2131689650, "field 'phone' and method 'clickPhone'");
    target.phone = finder.castView(view, 2131689650, "field 'phone'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.clickPhone();
        }
      });
    view = finder.findRequiredView(source, 2131689651, "field 'fields'");
    target.fields = finder.castView(view, 2131689651, "field 'fields'");
    view = finder.findRequiredView(source, 2131689626, "field 'time'");
    target.time = finder.castView(view, 2131689626, "field 'time'");
  }

  @Override public void unbind(T target) {
    target.avatar = null;
    target.avatarEditOverlay = null;
    target.name = null;
    target.email = null;
    target.phone = null;
    target.fields = null;
    target.time = null;
  }
}
