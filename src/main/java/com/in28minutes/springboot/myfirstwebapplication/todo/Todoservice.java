package com.in28minutes.springboot.myfirstwebapplication.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
@Service
public class Todoservice {
private static List<Todo> todos=new ArrayList<>();
static
{
	todos.add(new Todo(1,"Ramachandra","Learn WEB",false,LocalDate.now().plusYears(1)));
	todos.add(new Todo(2,"Ramachandra","Learn Devops",false,LocalDate.now().plusYears(2)));
	todos.add(new Todo(3,"Ramachandra","Learn WEBDEV",false,LocalDate.now().plusYears(3)));
}

/*public Todo findbyID(int id)
{
	return todos.get(id);
}
*/
public List<Todo> findbyname(String name)
{
	return todos;
}

}
