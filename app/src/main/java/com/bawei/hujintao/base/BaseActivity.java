package com.bawei.hujintao.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * date:2020/3/4 0004
 * author:胡锦涛(Administrator)
 * function:activity基类
 */
public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity {
    protected P mpresenter;
    private Unbinder bind;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layoutId());
        mpresenter=providePresenter();
        if (mpresenter != null) {
            mpresenter.attach(this);
        }
        bind = ButterKnife.bind(this);
        initView();
        initData();
    }

    protected abstract P providePresenter();

    protected abstract void initData();

    protected abstract void initView();

    protected abstract int layoutId();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mpresenter != null) {
            mpresenter.detach();
        }
        if (bind != null) {
            bind.unbind();
        }
    }
}
