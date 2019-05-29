package com.bayviewglen.zork;

import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

class Character {
	private String characterName;
	private String startingLocation;
	private ArrayList<String> startingItems;
	private ArrayList<String> wantedItems;
	private ArrayList<String> speech;
	private ArrayList<String> functions; // stores functions you can do to this character.
	private static HashMap <String, Item> items = new HashMap <String, Item>();
	
	public Character(String characterName, String startingLocation, ArrayList<String> startingItems, ArrayList<String> wantedItems, ArrayList<String> speech, ArrayList<String> functions) {
		this.characterName = characterName;
		this.startingLocation = startingLocation;
		this.startingItems = startingItems;
		this.wantedItems = wantedItems;
		this.speech = speech;
		this.functions = functions;
	}
	
	// adds an item to the inventory
	// if an item is already 
	public static void addToInventory(Item item, int amount) {
		if (items.containsKey(item.getItemName())) {
			items.get(item.getItemName()).addAmount(amount);
		}
		else {
			items.put(item.getItemName(), item);
		}
	}
	
	// checks for an item in the inventory 
	// return item if it is, null if not
	public boolean contains(String name) {
		if (items.containsKey(name)) {
			return true;
		}	
		
		return false;
	}
	
	public ArrayList<String> speech() {
		return speech;
	}
	

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}
	
	public String getStartingLocation() {
		return startingLocation;
	}

	public void setStartingLocation(String startingLocation) {
		this.startingLocation = startingLocation;
	}
	
	public ArrayList<String> getStartingItems() {
		return startingItems;
	}

	public void setStartingItems(ArrayList<String> startingItems) {
		this.startingItems = startingItems;
	}
	
	public ArrayList<String> getWantedItems() {
		return wantedItems;
	}

	public void setWantedItems(String wantedItems) {
		this.wantedItems = wantedItems;
	}
	
	public ArrayList<String> getSpeech() {
		return speech;
	}

	public void setSpeech(String speech) {
		this.speech = speech;
	}
}
