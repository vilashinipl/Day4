package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class book {
	@Id
	private int id;
	private String bookname;
	private String bookgenre;
	private int releasemonth;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookgenre() {
		return bookgenre;
	}
	public void setBookgenre(String bookgenre) {
		this.bookgenre = bookgenre;
	}
	public int getReleasemonth() {
		return releasemonth;
	}
	public void setReleasemonth(int releasemonth) {
		this.releasemonth = releasemonth;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", bookname=" + bookname + ", bookgenre=" + bookgenre + ", releasemonth="
				+ releasemonth + "]";
	}
}
	