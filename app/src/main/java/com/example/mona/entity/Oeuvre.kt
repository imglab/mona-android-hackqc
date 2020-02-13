package com.example.mona.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "oeuvre")
data class Oeuvre(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "title") val title: String?= null,
    @ColumnInfo(name = "date") val date: String?= null,
    @ColumnInfo(name = "category") val category: Bilingual? = null,
    @ColumnInfo(name = "subcategory") val subcategory: Bilingual?= null,
    @ColumnInfo(name = "dimension") val dimension: List<Any>?= null,
    @ColumnInfo(name = "materials") val materials: List<Bilingual>?= null,
    @ColumnInfo(name = "techniques") val techniques: List<Bilingual>?= null,
    @ColumnInfo(name = "artists") val artists: List<Artist>?= null,
    @ColumnInfo(name = "borough") val borough: String?= null,
    @ColumnInfo(name = "location") val location: Location?= null,
    @ColumnInfo(name = "collection") val collection: String?= null,
    @ColumnInfo(name = "details") val details: String?= null
)