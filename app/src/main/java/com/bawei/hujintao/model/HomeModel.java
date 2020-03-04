package com.bawei.hujintao.model;

import com.bawei.hujintao.contract.IHomeContract;
import com.bawei.hujintao.model.entity.HomeEntity;
import com.bawei.hujintao.util.RetrofitUtil;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * date:2020/3/4 0004
 * author:胡锦涛(Administrator)
 * function:M层
 */
public class HomeModel implements IHomeContract.IModel {
    @Override
    public void getHomeData(IModelCallback iModelCallback) {
        RetrofitUtil.getInstance().getApi().getHomeData()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<HomeEntity>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(HomeEntity homeEntity) {
                        iModelCallback.onSuccess(homeEntity);
                    }

                    @Override
                    public void onError(Throwable e) {
                        iModelCallback.onFailure(e);
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
