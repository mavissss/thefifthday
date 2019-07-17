package com.bytedance.android.lesson.restapi.solution.bean;

import com.google.gson.annotations.SerializedName;

/**
 * @author Xavier.S
 * @date 2019.01.18 17:53
 */
public class PostVideoResponse {

    // TODO-C2 (3) Implement your PostVideoResponse Bean here according to the response json
    @SerializedName("success") private Boolean success;
    @SerializedName("feeds") private Item item;
    public Boolean getSuccess(){
        return success;
    }
    public Item getItem(){
        return item;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public class Item{
        @SerializedName("student_id") private String studentId;
        @SerializedName("user_name") private String username;
        @SerializedName("image_url") private String  imageUrl;
        @SerializedName("video_url") private String  videoUrl;
        public String getStudentId(){
            return studentId;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public void setStudentId(String studentId) {
            this.studentId = studentId;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public void setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
        }

        public String getUsername(){
            return username;
        }
        public String getImageUrl(){
            return imageUrl;
        }
        public String getVideoUrl(){
            return videoUrl;
        }
    }
}
