package com.chiclaim.dagger.sample.presenter;


import com.chiclaim.dagger.sample.Callback;
import com.chiclaim.dagger.sample.bean.MenuBalance;
import com.chiclaim.dagger.sample.model.MenuBalanceRepository;
import com.chiclaim.dagger.sample.view.IAddMenuBalanceView;

import javax.inject.Inject;

public class AddMenuBalancePresenter implements IAddMenuBalancePresenter {

    private final IAddMenuBalanceView mView;

    private final MenuBalanceRepository mMenuBalanceRepository;

    @Inject
    AddMenuBalancePresenter(IAddMenuBalanceView view, MenuBalanceRepository mMenuBalanceRepository) {
        this.mView = view;
        this.mMenuBalanceRepository = mMenuBalanceRepository;
    }

    @Override
    public void addMenuBalance() {
        mMenuBalanceRepository.addMenuBalance(new Callback<MenuBalance>() {
            @Override
            public void onSuccess(MenuBalance data) {
                mView.addMenuBalanceSuccess(data);
            }

            @Override
            public void onFailed(String errorMsg) {
                mView.addMenuBalanceFailure(errorMsg);
            }
        });
    }
}
