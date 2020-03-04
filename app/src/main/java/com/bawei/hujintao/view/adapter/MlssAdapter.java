package com.bawei.hujintao.view.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bawei.hujintao.R;
import com.bawei.hujintao.model.entity.HomeEntity;
import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * date:2020/3/4 0004
 * author:胡锦涛(Administrator)
 * function:
 */
public class MlssAdapter extends RecyclerView.Adapter<MlssAdapter.MyViewHolder> {
    private List<HomeEntity.ResultBean.MlssBean.CommodityListBeanXX> list;

    public MlssAdapter(List<HomeEntity.ResultBean.MlssBean.CommodityListBeanXX> mlss) {

        list = mlss;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), R.layout.mlss, null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        HomeEntity.ResultBean.MlssBean.CommodityListBeanXX commodityListBeanXX = list.get(position);
        holder.mlName.setText(commodityListBeanXX.getCommodityName());
        holder.mlPrice.setText("￥"+commodityListBeanXX.getPrice());
        Glide.with(holder.mlImg).load(commodityListBeanXX.getMasterPic()).into(holder.mlImg);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.ml_img)
        ImageView mlImg;
        @BindView(R.id.ml_name)
        TextView mlName;
        @BindView(R.id.ml_price)
        TextView mlPrice;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
