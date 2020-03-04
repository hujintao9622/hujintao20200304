package com.bawei.hujintao.widget;

import com.bawei.hujintao.model.entity.HomeEntity;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * date:2020/3/4 0004
 * author:胡锦涛(Administrator)
 * function:
 */
public interface Api {
    @GET("small/commodity/v1/commodityList")
    Observable<HomeEntity> getHomeData();
}
