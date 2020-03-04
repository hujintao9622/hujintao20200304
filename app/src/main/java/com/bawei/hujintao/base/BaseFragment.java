package com.bawei.hujintao.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * date:2020/3/4 0004
 * author:胡锦涛(Administrator)
 * function:
 */
public abstract class BaseFragment<P extends BasePresenter> extends Fragment {
    protected P mpresenter;
    private Unbinder bind;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=View.inflate(getContext(),layoutId(),null);
        mpresenter=providePresenter();
        if (mpresenter != null) {
            mpresenter.attach(this);
        }
        bind = ButterKnife.bind(this,view);
        initView(view);
        return view;
    }

    protected abstract void initView(View view);

    protected abstract P providePresenter();

    protected abstract int layoutId();

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }

    protected abstract void initData();

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (mpresenter != null) {
            mpresenter.detach();
        }
        if (bind != null) {
            bind.unbind();
        }
    }
}
