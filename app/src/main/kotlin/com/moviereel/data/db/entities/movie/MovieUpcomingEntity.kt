package com.moviereel.data.db.entities.movie


import android.arch.persistence.room.Entity
import com.moviereel.data.db.entities.BaseEntity

/**
 * @author lusinabrian on 16/05/17.
 * @Notes An upcoming Movie model. Used when storing upcoming movie items in the database
 */

@Entity(tableName = "movie_upcoming")
class MovieUpcomingEntity : BaseEntity()