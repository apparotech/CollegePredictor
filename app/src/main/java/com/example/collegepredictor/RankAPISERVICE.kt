package com.example.collegepredictor
import com.example.collegepredictor.model.ModelClass
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface RankAPISERVICE {
    @GET("{uid}")
    fun getApiResponseAKTUBTECH(@Path("uid") uid: String?): Call<List<ModelClass>>
}