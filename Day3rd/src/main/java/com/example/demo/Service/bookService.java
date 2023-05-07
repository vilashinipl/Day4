package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.book;
import com.example.demo.Repository.bookRepo;

@Service
public class bookService {
	@Autowired 
	bookRepo s_repo;
	public String adddetails(book stu)
	{
		s_repo.save(stu);
		return "Welcome to REST API";
	}
	public List<book> getdetails()
	{
		return s_repo.findAll();
	}
	public Optional<book> getdetailsById(int id)
	{
		return s_repo.findById(id);
	}
	public String updateSS(book stu)
	{
		s_repo.save(stu);
		return "Updated!";
	}
	public String deleteByRequestParamId(int id)
	{
		s_repo.deleteById(id);
		return "Deleted!";
	}
}