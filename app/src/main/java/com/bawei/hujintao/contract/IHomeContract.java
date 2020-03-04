package com.bawei.hujintao.contract;

import com.bawei.hujintao.model.entity.HomeEntity;

/**
 * date:2020/3/4 0004
 * author:胡锦涛(Administrator)
 * function:契约
 */
public interface IHomeContract {
    interface IView{
        void onSuccess(HomeEntity t);
        void onFailure(Throwable e);
    }
    interface IPresenter{
        void getHomeData();
    }
    interface IModel{
        void getHomeData(IModelCallback iModelCallback);
        interface IModelCallback{
            void onSuccess(HomeEntity t);
            void onFailure(Throwable e);
        }
    }
}
