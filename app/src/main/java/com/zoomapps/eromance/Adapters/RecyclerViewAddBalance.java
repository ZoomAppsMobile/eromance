package com.zoomapps.eromance.Adapters;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;

import com.zoomapps.eromance.Models.ModelAddBalance;
import com.zoomapps.eromance.R;

import static android.media.CamcorderProfile.get;

public class RecyclerViewAddBalance extends RecyclerView.Adapter<RecyclerViewAddBalance.ViewHolder> {

    private ModelAddBalance[] dataSet;
    //1
    public RecyclerViewAddBalance(ModelAddBalance[] dataSet){
        this.dataSet = dataSet;
    }



    //2
     @Override
     public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
         View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_add_balance_coin_list,parent,false);
         return new ViewHolder(view);
     }
    //5
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
        ModelAddBalance modelAddBalance = dataSet[position];
        viewHolder.tv_value_balance.setText("" + modelAddBalance.getPrice());
        viewHolder.tv_value_coins.setText("" + modelAddBalance.getExchange_coins());
        viewHolder.tv_currency.setText("" + modelAddBalance.getCurrency());
        viewHolder.radioButton.setChecked(modelAddBalance.is_check());
    }
    //3
    @Override
    public int getItemCount() {
        return dataSet.length;
    }
    //4
   class ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_value_balance, tv_value_coins, tv_currency;
        private RadioButton radioButton;
         public ViewHolder(View itemView) {
         super(itemView);
            tv_value_balance = (TextView) itemView.findViewById(R.id.tv_value_balance);
            tv_currency = (TextView) itemView.findViewById(R.id.tv_currency);
            tv_value_coins = (TextView) itemView.findViewById(R.id.tv_value_coins);
            radioButton = (RadioButton) itemView.findViewById(R.id.radioButton);
        }
    }
}
