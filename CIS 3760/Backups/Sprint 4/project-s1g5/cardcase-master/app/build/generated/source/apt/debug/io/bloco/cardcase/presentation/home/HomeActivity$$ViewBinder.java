// Generated code from Butter Knife. Do not modify!
package io.bloco.cardcase.presentation.home;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class HomeActivity$$ViewBinder<T extends io.bloco.cardcase.presentation.home.HomeActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131689653, "field 'searchToolbar'");
    target.searchToolbar = finder.castView(view, 2131689653, "field 'searchToolbar'");
    view = finder.findRequiredView(source, 2131689601, "field 'sortingMenu'");
    target.sortingMenu = finder.castView(view, 2131689601, "field 'sortingMenu'");
    view = finder.findRequiredView(source, 2131689603, "field 'homeEmpty'");
    target.homeEmpty = finder.castView(view, 2131689603, "field 'homeEmpty'");
    view = finder.findRequiredView(source, 2131689604, "field 'homeSearchEmpty'");
    target.homeSearchEmpty = finder.castView(view, 2131689604, "field 'homeSearchEmpty'");
    view = finder.findRequiredView(source, 2131689605, "field 'cardsView'");
    target.cardsView = finder.castView(view, 2131689605, "field 'cardsView'");
    view = finder.findRequiredView(source, 2131689606, "field 'exchangeButton' and method 'onClickedExchange'");
    target.exchangeButton = finder.castView(view, 2131689606, "field 'exchangeButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickedExchange();
        }
      });
    view = finder.findRequiredView(source, 2131689607, "field 'beamTransferButton' and method 'onClickedBeam'");
    target.beamTransferButton = finder.castView(view, 2131689607, "field 'beamTransferButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickedBeam();
        }
      });
    view = finder.findRequiredView(source, 2131689608, "field 'shareCardButton' and method 'onClickedShare'");
    target.shareCardButton = finder.castView(view, 2131689608, "field 'shareCardButton'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClickedShare();
        }
      });
    view = finder.findRequiredView(source, 2131689609, "field 'transitionOverlay'");
    target.transitionOverlay = view;
    view = finder.findRequiredView(source, 2131689602, "field 'sortingDirection'");
    target.sortingDirection = finder.castView(view, 2131689602, "field 'sortingDirection'");
  }

  @Override public void unbind(T target) {
    target.searchToolbar = null;
    target.sortingMenu = null;
    target.homeEmpty = null;
    target.homeSearchEmpty = null;
    target.cardsView = null;
    target.exchangeButton = null;
    target.beamTransferButton = null;
    target.shareCardButton = null;
    target.transitionOverlay = null;
    target.sortingDirection = null;
  }
}
