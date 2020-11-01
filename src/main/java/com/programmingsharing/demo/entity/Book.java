package com.programmingsharing.demo.entity;

import java.io.Serializable;

public class Book implements Serializable {
	private static final long serialVersionUID = 1L;
	private String isbn10;
	private String title;
	private int format;

	public Book(String isbn10, String title, int format) {
		super();
		this.isbn10 = isbn10;
		this.title = title;
		this.format = format;
	}

	public String getIsbn() {
		return isbn10;
	}

	public void setIsbn(String isbn) {
		this.isbn10 = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getFormat() {
		return format;
	}

	public void setFormat(int format) {
		this.format = format;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + format;
		result = prime * result + ((isbn10 == null) ? 0 : isbn10.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (format != other.format)
			return false;
		if (isbn10 == null) {
			if (other.isbn10 != null)
				return false;
		} else if (!isbn10.equals(other.isbn10))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn10 + ", title=" + title + ", format=" + format + "]";
	}

}