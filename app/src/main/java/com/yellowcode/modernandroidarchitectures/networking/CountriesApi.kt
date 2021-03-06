package com.yellowcode.modernandroidarchitectures.networking

import com.yellowcode.modernandroidarchitectures.model.CountryModel
import io.reactivex.Single
import retrofit2.http.GET

interface CountriesApi {

    @GET("all")
    fun getCountries(): Single<List<CountryModel>>
}