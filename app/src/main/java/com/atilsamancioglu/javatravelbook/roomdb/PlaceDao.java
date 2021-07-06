package com.atilsamancioglu.javatravelbook.roomdb;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.atilsamancioglu.javatravelbook.model.Place;

import java.util.List;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;

@Dao
public interface PlaceDao {

    @Query("SELECT * FROM Place")
    Flowable<List<Place>> getAll();

    @Insert
    Completable insert(Place place);
    //void insert(Place place);

    @Delete
    Completable delete(Place place);
    //void delete(Place place);
}
