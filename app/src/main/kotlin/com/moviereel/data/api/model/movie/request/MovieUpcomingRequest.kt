package com.moviereel.data.api.model.movie.request

/**
 * @author lusinabrian on 01/04/17
 */

class MovieUpcomingRequest internal constructor(page: Int, language: String, region: String) : MovieBaseRequest(page, language, region)