package ru.tander.tandernews.models;

/**
 * Created by Krat0S on 16.08.2017.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NewsModel {

    public class Result {
        @SerializedName("enddate")
        @Expose
        private String enddate;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("newstext")
        @Expose
        private String newstext;
        @SerializedName("id_news_status")
        @Expose
        private Integer idNewsStatus;
        @SerializedName("name_status")
        @Expose
        private String nameStatus;
        @SerializedName("id_news")
        @Expose
        private Integer idNews;
        @SerializedName("link")
        @Expose
        private Object link;
        @SerializedName("rn")
        @Expose
        private Integer rn;
        @SerializedName("showdate")
        @Expose
        private String showdate;

        public String getEnddate() {
            return enddate;
        }

        public void setEnddate(String enddate) {
            this.enddate = enddate;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getNewstext() {
            return newstext;
        }

        public void setNewstext(String newstext) {
            this.newstext = newstext;
        }

        public Integer getIdNewsStatus() {
            return idNewsStatus;
        }

        public void setIdNewsStatus(Integer idNewsStatus) {
            this.idNewsStatus = idNewsStatus;
        }

        public String getNameStatus() {
            return nameStatus;
        }

        public void setNameStatus(String nameStatus) {
            this.nameStatus = nameStatus;
        }

        public Integer getIdNews() {
            return idNews;
        }

        public void setIdNews(Integer idNews) {
            this.idNews = idNews;
        }

        public Object getLink() {
            return link;
        }

        public void setLink(Object link) {
            this.link = link;
        }

        public Integer getRn() {
            return rn;
        }

        public void setRn(Integer rn) {
            this.rn = rn;
        }

        public String getShowdate() {
            return showdate;
        }

        public void setShowdate(String showdate) {
            this.showdate = showdate;
        }
    }

    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("result")
    @Expose
    private List<Result> result = null;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }
}
