package com.moviereel.data.db

import com.moviereel.data.db.models.movie.MovieLatestModel
import com.moviereel.data.db.models.movie.MovieNowPlayingModel
import com.moviereel.data.db.models.movie.MoviePopularModel
import com.moviereel.data.db.models.movie.MovieTopRatedModel

import io.reactivex.Observable

/**
 * @author lusinabrian on 28/03/17
 * * Interface that will be delegated the duty of storing and accessing the database
 * * will be implemented by [DbHelperImpl]
 * * follows CRUD principle
 */

interface DbHelper {
    // CREATE
    // create all the entities in the database exactly as they are fetched from the db

    /**
     * Inserts a movie item into the database. This will map the POJO to a movie item
     * @param movieNowPlayingModel POJO representation of a movie item received from API
     * *
     * @return [Boolean] True if insertion is successful, false, otherwise
     * *
     */
    fun insertMovieNowPlayingItem(movieNowPlayingModel: MovieNowPlayingModel): Observable<Boolean>

    /**
     * Inserts a movie item list into the database, BULK INSERT
     * @param movieNowPlayingModels List of movie items
     * *
     * @return [Boolean] True if insertion is a success, false otherwise
     * *
     */
    fun insertMovieNowPlayingItemList(movieNowPlayingModels: List<MovieNowPlayingModel>): Observable<Boolean>

    /**
     * Inserts the latest movie item to the data
     * @param movieLatestModel latest movie model
     * *
     * @return [Boolean] True if data insertion is a success, False otherwise
     * *
     */
    fun insertMovieLatestItem(movieLatestModel: MovieLatestModel): Observable<Boolean>

    /**
     * Inserts a popular movie item to the database
     * @param moviePopularModel POJO with data relating to a popular movie item
     * *
     * @return [Boolean] True if insertion of data is a success, False otherwise
     */
    fun insertMoviePopularItem(moviePopularModel: MoviePopularModel): Observable<Boolean>

    /**
     * Inserts a list of Popular movie items to the database
     * @param moviePopularModels List of popular movie items
     * *
     * @return [Boolean] True if insertion of list is a success
     */
    fun insertMoviePopularItemList(moviePopularModels: List<MoviePopularModel>): Observable<Boolean>

    /**
     * Inserts a single top rated movie into the database
     * @param movieTopRatedModel top rated movie model
     * *
     * @return [Boolean] True if insertion of data is successful
     */
    fun insertMovieTopRatedItem(movieTopRatedModel: MovieTopRatedModel): Observable<Boolean>

    /**
     * Inserts a list of top rated movies
     * @param movieTopRatedModels list of top rated movies to insert
     * *
     * @return [Boolean] True, if insertion is a success
     */
    fun insertMovieTopRatedItemList(movieTopRatedModels: List<MovieTopRatedModel>): Observable<Boolean>

    //----------------------------------------------------------------------------------------------
    // READ
    // read data from the db

    /**
     * Gets a now playing movie item from the database database.
     * @param movieNowPlayingId Id of a now playing movie item
     * *
     * @return [MovieNowPlayingModel] MovieNowPlaying Model
     * *
     */
    fun getNowPlayingMovieItem(movieNowPlayingId: Long): Observable<MovieNowPlayingModel>

    /**
     * Retrieves all the now playing movie items from a database
     * @return [<] List of now playing movie items
     * *
     */
    val movieNowPlayingItems: Observable<List<MovieNowPlayingModel>>

    /**
     * Gets the latest movie item by its given id
     * @param movieLatestModelId latest movie model id
     * *
     * @return [MovieLatestModel] Latest Movie Latest model
     * *
     */
    fun getMovieLatestItem(movieLatestModelId: Long): Observable<MovieLatestModel>

    /**
     * Gets a popular movie item from the database
     * @param moviePopularId Id of a popular movie item
     * *
     * @return [MoviePopularModel] popular movie item
     */
    fun getMoviePopularItem(moviePopularId: Long): Observable<MoviePopularModel>

    /**
     * Gets a list of popular movie items from db
     * @return [<] List of popular movie items
     */
    val moviePopularItemList: Observable<List<MoviePopularModel>>

    /**
     * Inserts a single top rated movie into the database
     * @param movieTopRatedId top rated movie model id
     * *
     * @return [MovieTopRatedModel] Top rated movie model
     */
    fun getMovieTopRatedItem(movieTopRatedId: Long): Observable<MovieTopRatedModel>

    /**
     * Inserts a list of top rated movies
     * @return [<] List of top rated movies
     */
    val movieTopRatedItemList: Observable<List<MovieTopRatedModel>>

    //----------------------------------------------------------------------------------------------
    // UPDATE
    // update data in the db

    /**
     * Updates a now playing movie item.
     * @param movieNowPlayingModel Id of a now playing movie item
     * *
     * @return [Boolean] True if update is a success
     * *
     */
    fun updateNowPlayingMovieItem(movieNowPlayingModel: MovieNowPlayingModel): Observable<Boolean>

    /**
     * Updates latest movie item
     * @param movieLatestModel latest movie model
     * *
     * @return [Boolean] True if data insertion is a success, False otherwise
     * *
     */
    fun updateMovieLatestItem(movieLatestModel: MovieLatestModel): Observable<Boolean>

    /**
     * Updates a popular movie item
     * @param moviePopularModel POJO with data relating to a popular movie item
     * *
     * @return [Boolean] True if updating the data item was a success
     */
    fun updateMoviePopularItem(moviePopularModel: MoviePopularModel): Observable<Boolean>

    /**
     * Updates a top rated movie item
     * @param movieTopRatedModel top rated movie model
     * *
     * @return [Boolean] True if updating of data is successful
     */
    fun updateMovieTopRatedItem(movieTopRatedModel: MovieTopRatedModel): Observable<Boolean>

    //----------------------------------------------------------------------------------------------
    // DELETE
    // delete data from the db

    /**
     * Deletes a movie now playing item given its id
     * @param movieNowPlayingId Id of a now playing movie item
     * *
     * @return [Long] id of the deleted movie now playing item
     * *
     */
    fun deleteNowPlayingMovieItem(movieNowPlayingId: Long): Observable<Long>

    /**
     * Deletes all movie now playing items
     * @return [Integer] Number of deleted items from the database
     * *
     */
    fun deleteMovieNowPlayingItems(movieNowPlayingModels: List<MovieNowPlayingModel>): Observable<Int>

    /**
     * Deletes the latest movie item given its id
     * @param movieLatestId latest movie model id
     * *
     * @return [Boolean] True if data deletion is a success, False otherwise
     * *
     */
    fun deleteMovieLatestItem(movieLatestId: Long): Observable<Boolean>

    /**
     * Inserts a popular movie item to the database
     * @param moviePopularId POJO with data relating to a popular movie item
     * *
     * @return [Long] id of deleted popular movie item
     */
    fun deleteMoviePopularItem(moviePopularId: Long): Observable<Long>

    /**
     * Inserts a list of Popular movie items to the database
     * @param moviePopularModels List of popular movie items
     * *
     * @return [Integer] number of deleted items
     */
    fun deleteMoviePopularItemList(moviePopularModels: List<MoviePopularModel>): Observable<Int>

    /**
     * Deletes a single top rated movie item from db
     * @param movieTopRatedId top rated movie model id
     * *
     * @return [Long] id of deleted data item
     */
    fun deleteMovieTopRatedItem(movieTopRatedId: Long): Observable<Long>

    /**
     * Deletes top rated movie item list
     * @param movieTopRatedModels list of top rated movies to insert
     * *
     * @return [Integer] List size of deleted items from database
     */
    fun deleteMovieTopRatedItemList(movieTopRatedModels: List<MovieTopRatedModel>): Observable<Int>
}