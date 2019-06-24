package firstspring;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {
	
	private int id;
	private String name;
	private List<String> answers;
	private List<Answer> ans;
	private Map<String , String > answer;
	private Map<Answer,User> userAnswer;
	public Question() {
	}
	
	public Question(int id , String name , List<String> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	
	public Question(int id ,List<Answer> ans ,  String name ) {
		super();
		this.id = id;
		this.ans = ans;
		this.name = name;
	}
	
	public Question(int id , String name , Map<String,String> answer) {
		super();
		this.id = id;
		this.name = name;
		this.answer = answer;
	}
	
	public Question(String name , int id , Map<Answer , User> userAnswer) {
		super();
		this.name =name;
		this.id= id;
		this.userAnswer = userAnswer;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	
	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}
	
	public void setAnswer(Map<String,String> answer) {
		this.answer = answer;
	}
	
	public void setUserAnswer(Map<Answer,User> userAnswer) {
		this.userAnswer = userAnswer;
	}
	
	public void displayInfo() {
		System.out.println(id+" "+name);
		System.out.println("Answers are : ");
		Iterator<String> it = answers.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public void info() {
		System.out.println(id+" "+name);
		System.out.println("Answers are : ");
		Iterator<Answer> itr = ans.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	public void displayMapInfo() {
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Answers...");
		Set<Entry<String,String>> set = answer.entrySet();
		Iterator<Entry<String, String>> itr = set.iterator();
		while(itr.hasNext()) {
			Entry<String , String> entry = itr.next();
			System.out.println("Answer: " + entry.getKey() + " Posted By: " + entry.getValue());
		}
	}
	
	public void displayUserMapInfo() {
		System.out.println(" Id : " + id);
		System.out.println(" Name : " + name);
		System.out.println(" Answers : ....");
		for(Map.Entry<Answer, User> entry : userAnswer.entrySet()) {
			System.out.println("Answer: " + entry.getKey() + " Posted By : " + entry.getValue());
		}
	}
	
	
}
