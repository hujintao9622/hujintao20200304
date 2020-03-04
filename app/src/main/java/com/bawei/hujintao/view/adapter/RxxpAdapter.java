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
public class RxxpAdapter extends RecyclerView.Adapter<RxxpAdapter.MyViewHolder> {
    private List<HomeEntity.ResultBean.RxxpBean.CommodityListBean> list;

    public RxxpAdapter(List<HomeEntity.ResultBean.RxxpBean.CommodityListBean> rxxp) {

        list = rxxp;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), R.layout.rxxp, null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        HomeEntity.ResultBean.RxxpBean.CommodityListBean commodityListBean = list.get(position);
        holder.rxName.setText(commodityListBean.getCommodityName());
        holder.rxPrice.setText("￥"+commodityListBean.getPrice());
        Glide.with(holder.rxImg).load(commodityListBean.getMasterPic()).into(holder.rxImg);
        if (o != null) {
            o.onTouch(position);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.rx_img)
        ImageView rxImg;
        @BindView(R.id.rx_name)
        TextView rxName;
        @BindView(R.id.rx_price)
        TextView rxPrice;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
    onTouchListener o;

    public void setO(onTouchListener o) {
        this.o = o;
    }

    public interface onTouchListener{
        void onTouch(int position);
    }
}
