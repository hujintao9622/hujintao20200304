package com.bawei.hujintao.util;

import com.bawei.hujintao.widget.Api;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * date:2020/3/4 0004
 * author:胡锦涛(Administrator)
 * function:
 */
public class RetrofitUtil {
    private static final String bas="http://mobile.bwstudent.com/";
    private final Api api;

    private RetrofitUtil(){
        //日志拦截器
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        //okhttp
        OkHttpClient okhttp = new OkHttpClient().newBuilder()
                .addInterceptor(httpLoggingInterceptor)
                .writeTimeout(5, TimeUnit.SECONDS)
                .readTimeout(5, TimeUnit.SECONDS)
                .connectTimeout(5, TimeUnit.SECONDS)
                .build();
        //retrofit
        Retrofit build = new Retrofit.Builder()
                .client(okhttp)
                .baseUrl(bas)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        //api
        api = build.create(Api.class);
    }
    private static final class Holder{
        private static final RetrofitUtil RETROFIT_UTIL=new RetrofitUtil();
    }

    public static RetrofitUtil getInstance() {
        return Holder.RETROFIT_UTIL;
    }

    public Api getApi() {
        return api;
    }
}
