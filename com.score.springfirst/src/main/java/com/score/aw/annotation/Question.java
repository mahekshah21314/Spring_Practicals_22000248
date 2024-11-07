package com.score.aw.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Question {
	@Autowired
	@Qualifier("a2")
	private String Ques1;
	
	
	private Answer answer;
	public String getQues1() {
		return Ques1;
	}
	public void setQues1(String ques1) {
		Ques1 = ques1;
	}
	public Answer getAnswer() {
		return answer;
	}
	public void setAnswer(Answer answer) {
		this.answer = answer;
	}
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(String ques1, Answer answer) {
		super();
		Ques1 = ques1;
		this.answer = answer;
	}
	@Override
	public String toString() {
		return "Question [Ques1=" + Ques1 + ", answer=" + answer + "]";
	}
	
	
}
