package com.bytedance.android.lesson.restapi.solution.newtork;




import com.bytedance.android.lesson.restapi.solution.bean.Cat;

import java.util.List;
import java.util.ListResourceBundle;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * @author Xavier.S
 * @date 2019.01.15 16:42
 */
public interface ICatService {

    @GET("v1/images/search?limit=5")
    Call<List<Cat>> randomCat();


    // TODO-C1 (2) Implement your Cat Request here, url: https://api.thecatapi.com/v1/images/search?limit=5
}