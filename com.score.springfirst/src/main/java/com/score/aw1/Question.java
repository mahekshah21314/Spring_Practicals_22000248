package com.score.aw1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Question {
	private String Ques1;
	
	@Autowired
	@Qualifier("a2")
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
