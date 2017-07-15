package com.example.android.newsfeed;

/**
 * Created by FEY-AGAPE on 15/07/2017.
 */

/**
 * An {@link News} object contains information related to a news item.
 */
public class News {

    /**
     * Name of the News Section
     */
    private String mTitle;

    /**
     * Title of the News item
     */
    private String mSection;

    /**
     * Time of the News item
     */
    private String mPublished;

    /**
     * Website URL of the News item
     */
    private String mUrl;

    /**
     * Constructs a new {@link News} object.
     *
     * @param title          is the title of the news item
     * @param section           is the section of the new
     * @param published is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     * @param url                is the website URL to find more details about the earthquake
     */
    public News(String title, String section, String published, String url) {
        mTitle = title;
        mSection = section;
        mPublished = published;
        mUrl = url;
    }

    public String getTitle()  {
        return mTitle;
    }

    public String getSection(){ return mSection; }

    public String getPublished() {
        return mPublished;
    }

    public String getUrl() {
        return mUrl;
    }
}