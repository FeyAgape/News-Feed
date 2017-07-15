package com.example.android.newsfeed;

/**
 * Created by FEY-AGAPE on 12/07/2017.


/**
 *
 * These list item layouts will be provided to an adapter view like ListView
 * to be displayed to the user.
 */

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class NewsAdapter extends ArrayAdapter<News> {


    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context of the app
     * @param newses is the list of news, which is the data source of the adapter
     */
    public NewsAdapter(Context context, List<News> newses) {
        super(context, 0, newses);
    }

    /**
     * Returns a list item view that displays information about the news at the given position
     * in the list of news.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }

        News currentNews = getItem(position);
        String newsTitle = currentNews.getTitle();
        TextView newsTitleView = (TextView) listItemView.findViewById(R.id.title);
        newsTitleView.setText(newsTitle);

        String newsSection = currentNews.getSection();
        TextView newsSectionView = (TextView) listItemView.findViewById(R.id.section);
        newsSectionView.setText(newsSection);
        TextView newsPublishedView = (TextView) listItemView.findViewById(R.id.date);

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        DateFormat dfDisplay = new SimpleDateFormat("dd-MMM-yyyy \n HH:mm");
        Date startDate;

        try {
            startDate = df.parse(currentNews.getPublished());
            String newDateString = dfDisplay.format(startDate);
            newsPublishedView.setText(newDateString);
        } catch (ParseException e) {
            Log.e("DATE ISSUE", e.toString());
            newsPublishedView.setVisibility(View.GONE);
        }
        return listItemView;
    }
}