package com.bayviewglen.zork;

import java.util.ArrayList;

public class Hints {
	static ArrayList<String> group1 = new ArrayList<String>();
	static ArrayList<String> group2 = new ArrayList<String>();
	
	public String getHint() {
		String hint = "";
		if (Player.getNumKilled() < 5) {
			// hint = get random hint from group 1
		} else {
			// hint = get random hint from group 2
		}
		return hint;
	}
	
	public static void populate() {
		group1.add("I heard that they're going to broadcast the newest murder spree on TV");
		group1.add("Where are announcements to a population given?");
		group1.add("Parents sometimes hide things from their children.");
		group1.add("Sometimes going for a walk outside can be nice.");
		group1.add("School can be a stressful time. Where do students go to hang out?");
		
		group2.add("What is black and white and red all over?");
		group2.add("In order for people to know who sent a letter, they will put their name on it.");
		group2.add("The best place to hide something is in plain sight.");
		group2.add("Sometimes you must make sacrifices to get what you want. Sometimes these sacrifices cost the life of those close to you.");
		group2.add("Children are often afraid of the dark. They will often have a source of light in their room.");
	}
}
