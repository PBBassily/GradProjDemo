package eg.alexu.eng.mobdev.gradprojdemo.model;

import android.graphics.Color;
import android.media.Image;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by Paula B. Bassily on 23/01/2018.
 */
public class Story implements Serializable{

    private int storyId;
    private String storyName;
    private String cover ;
    private String coverColor;
    private Date creationDate ;

    private List<Scene> scenes;

    public Story() {

    }

    public Story(String storyName, Date creationDate,String cover) {
        this.storyName = storyName;
        this.creationDate = creationDate;
        this.cover = cover ;
    }

    public Story(int storyId, String storyName , String cover , String coverColor, Date creationDate , List<Scene> scenes) {
        this.storyName = storyName;
        this.creationDate = creationDate;
        this.cover = cover;
        this.storyId = storyId;
        this.coverColor = coverColor;
        this.scenes = scenes;
    }

    public int getStoryId() {
        return storyId;
    }

    public void setStoryId(int storyId) {
        this.storyId = storyId;
    }


    public String getStoryName() {
        return storyName;
    }

    public void setStoryName(String storyName) {
        this.storyName = storyName;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getCoverColor() {
        return coverColor;
    }

    public void setCoverColor(String coverColor) {
        this.coverColor = coverColor;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public List<Scene> getScenes() {
        return scenes;
    }

    public void setScenes(List<Scene> scenes) {
        this.scenes = scenes;
    }

}
