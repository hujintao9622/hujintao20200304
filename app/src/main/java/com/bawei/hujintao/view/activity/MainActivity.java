package com.bawei.hujintao.view.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bawei.hujintao.R;
import com.bawei.hujintao.base.BaseActivity;
import com.bawei.hujintao.contract.IHomeContract;
import com.bawei.hujintao.model.entity.HomeEntity;
import com.bawei.hujintao.presenter.HomePresenter;
import com.bawei.hujintao.view.adapter.MlssAdapter;
import com.bawei.hujintao.view.adapter.RxxpAdapter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
/**
 * date:2020/3/4 0004
 * author:胡锦涛(Administrator)
 * function:展示页
 */
public class MainActivity extends BaseActivity<HomePresenter> implements IHomeContract.IView {
    @BindView(R.id.rc_rxxp)
    RecyclerView rcRxxp;
    @BindView(R.id.rc_mlss)
    RecyclerView rcMlss;
    int pos=0;
    private List<HomeEntity.ResultBean.RxxpBean.CommodityListBean> rxxp;

    @Override
    protected HomePresenter providePresenter() {
        return new HomePresenter();
    }

    @Override
    protected void initData() {
        mpresenter.getHomeData();
    }

    @Override
    protected void initView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        rcRxxp.setLayoutManager(linearLayoutManager);
        rcMlss.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    protected int layoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void onSuccess(HomeEntity t) {
        //获取数据
        HomeEntity.ResultBean result = t.getResult();
        rxxp = result.getRxxp().getCommodityList();
        List<HomeEntity.ResultBean.MlssBean.CommodityListBeanXX> mlss = result.getMlss().getCommodityList();
        //设置适配器
        RxxpAdapter rxxpAdapter = new RxxpAdapter(rxxp);
        rxxpAdapter.setO(new RxxpAdapter.onTouchListener() {
            @Override
            public void onTouch(int position) {
                pos=position;
            }
        });
        rcRxxp.setAdapter(rxxpAdapter);
        rcMlss.setAdapter(new MlssAdapter(mlss));
    }

    @Override
    public void onFailure(Throwable e) {
        //失败打印
        Log.e("tag",e.getMessage());
    }
    //事件拦截

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                break;
            case MotionEvent.ACTION_MOVE:
                if (pos==rxxp.size()-1){
                    return false;
                }
                break;
            case MotionEvent.ACTION_UP:
                break;

        }
        return true;
    }
}
