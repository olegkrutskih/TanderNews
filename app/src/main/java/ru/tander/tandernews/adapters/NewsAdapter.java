package ru.tander.tandernews.adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import ru.tander.tandernews.R;
import ru.tander.tandernews.models.NewsModel;

/**
 * Created by Krat0S on 15.08.2017.
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    //private ArrayList<String[]> mDataset;
    private ArrayList<NewsModel.Result> mNewses;
    private OnItemClickListener mItemClickListener;

    public NewsAdapter(ArrayList<NewsModel.Result> newses){
        mNewses = newses;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView mTitle;
        TextView mContent;
        TextView mStartDate;
        TextView mEndDate;
        RelativeLayout mPlaceHolder;

        ViewHolder(View v) {
            super(v);
            mTitle = v.findViewById(R.id.title);
            mContent = v.findViewById(R.id.tvContent);
            mStartDate = v.findViewById(R.id.sdate);
            mEndDate = v.findViewById(R.id.edate);
            mPlaceHolder = v.findViewById(R.id.mainHolder);
            mPlaceHolder.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            if (mItemClickListener != null) {
                mItemClickListener.onItemClick(itemView, getPosition());
            }
        }

    }

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    public void setOnItemClickListener(final OnItemClickListener mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }

    @Override
    public NewsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.news_item, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(NewsAdapter.ViewHolder holder, int position) {
//        holder.mTitle.setText(mDataset.get(position)[0]);
//        holder.mDate.setText(mDataset.get(position)[1]);

        NewsModel.Result news = mNewses.get(position);
        holder.mTitle.setText(news.getTitle());
        holder.mContent.setText(Html.fromHtml(news.getNewstext()));
        holder.mStartDate.setText(news.getShowdate());
        holder.mEndDate.setText(news.getEnddate());

    }

    @Override
    public int getItemCount() {
        return mNewses.size();
    }
}
