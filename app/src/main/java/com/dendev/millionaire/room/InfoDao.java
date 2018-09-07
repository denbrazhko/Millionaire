package com.dendev.millionaire.room;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

@Dao
public interface InfoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Info info);

    @Update
    void update(Info info);

    @Delete
    void delete(Info info);

    @Query("SELECT * FROM info WHERE id = :id")
    Info getById(long id);


}
