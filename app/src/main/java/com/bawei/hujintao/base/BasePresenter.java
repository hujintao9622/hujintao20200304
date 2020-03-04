package com.bawei.hujintao.base;

import java.lang.ref.WeakReference;

/**
 * date:2020/3/4 0004
 * author:胡锦涛(Administrator)
 * function:presenter基类
 */
public abstract class BasePresenter <V>{

    private WeakReference<V> weakReference;

    public void attach(V view){
        weakReference = new WeakReference<>(view);
    }
    //解决内存泄露
    public void detach(){
        if (weakReference != null) {
            weakReference.clear();
            weakReference=null;
        }
    }

    public BasePresenter() {
        initModel();
    }

    protected abstract void initModel();
    public V getView(){
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
