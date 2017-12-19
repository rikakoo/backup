package com.human;

public class HumanName {
	public String say;
 	private String mei;

 	HumanName(){
 		say = "onai";
 		mei = "rikako";
 	}
 	public String getName(){

 		return say + mei;

 	}
 	public String getmei(){
			return mei;
		}
 	public HumanName (String say , String mei){
 		this.say = say;
 		this.mei =mei;
 	}
}
