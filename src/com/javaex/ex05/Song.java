package com.javaex.ex05;

public class Song {

	// field
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;

	// constructor
	public Song() {
	}

	public Song(String title, String artist, String album, String composer, int year) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
	}
	public Song(String title, String artist, String album, String composer, int year, int track) {
		this(title, artist, album, composer, year);
		this.track = track;
	}

	// method - getter/setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}

	// method - general
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}

	public void showinfo() {
		System.out.println(
				artist + ", " + title + " ( " + album + ", " + year + "," + track + "번 track, " + composer + " 작곡 )");
	}
}
