package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Xavier.S
 * @date 2019.01.17 18:08
 */
public class Cat {

    // TODO-C1 (1) Implement your Cat Bean here according to the response json
    @SerializedName("breeds")
    private List<String> breeds;

    @SerializedName("id")
    private String id;

    @SerializedName("url")
    private String url;

    @SerializedName("width")
    private int width;

    @SerializedName("height")
    private int height;

    public List<String> getBreeds() {return breeds;}

    public void setBreeds()
    {
        this.breeds=breeds;
    }

    public String getId()
    {
        return id;
    }

    public void setId()
    {
        this.id=id;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl()
    {
        this.url=url;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth()
    {
        this.width=width;
    }

    public int getHeight()
    {
        return  height;
    }

    public void setHeight()
    {
        this.height=height;
    }











}
