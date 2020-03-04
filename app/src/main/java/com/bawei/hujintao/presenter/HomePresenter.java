package com.bawei.hujintao.presenter;

import com.bawei.hujintao.base.BasePresenter;
import com.bawei.hujintao.contract.IHomeContract;
import com.bawei.hujintao.model.HomeModel;
import com.bawei.hujintao.model.entity.HomeEntity;

/**
 * date:2020/3/4 0004
 * author:胡锦涛(Administrator)
 * function:P层
 */
public class HomePresenter extends BasePresenter<IHomeContract.IView> implements IHomeContract.IPresenter {

    private HomeModel homeModel;

    @Override
    protected void initModel() {
        homeModel = new HomeModel();
    }

    @Override
    public void getHomeData() {
        homeModel.getHomeData(new IHomeContract.IModel.IModelCallback() {
            @Override
            public void onSuccess(HomeEntity t) {
                getView().onSuccess(t);
            }

            @Override
            public void onFailure(Throwable e) {
                getView().onFailure(e);
            }
        });
    }
}
