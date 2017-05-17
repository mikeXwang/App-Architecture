package com.frodo.app.android.simple.entity;

import com.google.gson.annotations.SerializedName;

import android.os.Parcel;
import android.os.Parcelable;
 

import java.io.Serializable;

/**
 * Created by frodo on 2016/3/3.
 */
public class Movie implements Serializable, Parcelable {

	@SerializedName("poster_path")
	public String posterPath;
	@SerializedName("adult")
	public boolean adult;
	@SerializedName("overview")
	public String overView;
	@SerializedName("release_date")
	public String releaseDate;
	@SerializedName("genre_ids")
	public int[] genreIds;
	@SerializedName("id")
	public int id;
	@SerializedName("original_title")
	public String originalTitle;
	@SerializedName("original_language")
	public String originalLanguage;
	@SerializedName("title")
	public String title;
	@SerializedName("backdrop_path")
	public String backdropPath;
	@SerializedName("popularity")
	public float popularity;
	@SerializedName("vote_count")
	public int voteCount;
	@SerializedName("video")
	public boolean video;
	@SerializedName("vote_average")
	public float voteAverage;

	public Movie() {
	}

	public Movie(Parcel in) {
		posterPath = in.readString();
		adult = in.readByte() != 0;
		overView = in.readString();
		releaseDate = in.readString();
		genreIds = in.createIntArray();
		id = in.readInt();
		originalTitle = in.readString();
		originalLanguage = in.readString();
		title = in.readString();
		backdropPath = in.readString();
		popularity = in.readFloat();
		voteCount = in.readInt();
		video = in.readByte() != 0;
		voteAverage = in.readFloat();
	}

	public static final Creator<Movie> CREATOR = new Creator<Movie>() {
		@Override
		public Movie createFromParcel(Parcel in) {
			return new Movie(in);
		}

		@Override
		public Movie[] newArray(int size) {
			return new Movie[size];
		}
	};

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(posterPath);
		dest.writeByte((byte) (adult ? 1 : 0));
		dest.writeString(overView);
		dest.writeString(releaseDate);
		dest.writeIntArray(genreIds);
		dest.writeInt(id);
		dest.writeString(originalTitle);
		dest.writeString(originalLanguage);
		dest.writeString(title);
		dest.writeString(backdropPath);
		dest.writeFloat(popularity);
		dest.writeInt(voteCount);
		dest.writeByte((byte) (video ? 1 : 0));
		dest.writeFloat(voteAverage);
	}
}
