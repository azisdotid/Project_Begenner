package com.example.azisdotid.orderojol;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by DELL on 02/04/2018.
 */

public class RecycleviewAdapter extends RecyclerView.Adapter<RecycleviewAdapter.RecyleviewViewHolder> {
    private List<NewsPojo> list;



    @Override
    public RecyleviewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecyleviewViewHolder(
                LayoutInflater.from(parent.getContext())
                        .inflate(
                                R.layout.row_list_recycleview,parent,
                                false
                        )
        );
    }

    @Override
    public void onBindViewHolder(RecyleviewViewHolder holder, int position) {
        holder.bind(list.get(position));
    }
    public void setData(List<NewsPojo>list){
        this.list=list;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RecyleviewViewHolder extends RecyclerView.ViewHolder{

        private ImageView iv_image;
        private TextView tv_title;

        public RecyleviewViewHolder(View itemView) {
            super(itemView);

            iv_image = itemView.findViewById(R.id.iv_image);
            tv_title = itemView.findViewById(R.id.tv_title);
        }

        public void bind(final NewsPojo newsPojo) {
            tv_title.setText(newsPojo.getTitle());
            Picasso.with(itemView.getContext())
                    .load(newsPojo.getLink_gambar())
                    .into(iv_image);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent =new Intent(itemView.getContext(),DetailActivity.class);
                    intent.putExtra(DetailActivity.INTENT_DETAIL,newsPojo.getDetail());

                    itemView.getContext().startActivity(intent);

                }
            });
        }
    }
}
