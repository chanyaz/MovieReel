package com.moviereel.data.api

import com.moviereel.BuildConfig

/**
 * @author lusinabrian on 28/03/17
 * * Will hold data/constants for accessing the api endpoints
 * *
 */

internal object ApiEndPoint {

    // movie endpoints
    const val ENDPOINT_MOVIE_NOW_PLAYING = "movie/now_playing"
    const val ENDPOINT_MOVIE_LATEST = "movie/latest"
    const val ENDPOINT_MOVIE_POPULAR = "movie/popular"
    const val ENDPOINT_MOVIE_TOP_RATED = "movie/top_rated"
    const val ENDPOINT_MOVIE_UPCOMING = "movie/upcoming"

    // tv endpoints
    const val ENDPOINT_TV_TOP_RATED = "tv/top_rated"
    const val ENDPOINT_TV_ON_THE_AIR = "tv/on_the_air"
    const val ENDPOINT_TV_AIRING_TODAY = "tv/airing_today"
    const val ENDPOINT_TV_POPULAR = "tv/popular"
    const val ENDPOINT_TV_LATEST = "tv/latest"
}