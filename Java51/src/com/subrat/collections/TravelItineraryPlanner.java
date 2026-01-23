package com.subrat.collections;

import java.util.ArrayList;
import java.util.List;

class Activity {
	private String name;
	private String shedule;

	public Activity(String name, String shedule) {
		super();
		this.name = name;
		this.shedule = shedule;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShedule() {
		return shedule;
	}

	public void setShedule(String shedule) {
		this.shedule = shedule;
	}

	@Override
	public String toString() {
		return "Activity [name=" + name + ", shedule=" + shedule + "]";
	}

}

class Destination {
	private String dName;
	private List<Activity> activities;

	public Destination(String dName) {
		super();
		this.dName = dName;
		this.activities = new ArrayList();
	}

	void addActivity(Activity a) {
		activities.add(a);
	}

	void listOfActivities() {
		for (Activity a : activities) {
			IO.println(a);
		}
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public List<Activity> getActivities() {
		return activities;
	}

	public void setActivities(List<Activity> activities) {
		this.activities = activities;
	}

	@Override
	public String toString() {
		return "Destination [dName=" + dName + ", activities=" + activities + "]";
	}

}

class ItineraryPlanner {
	private List<Destination> destination;

	public ItineraryPlanner() {
		super();
		this.destination = new ArrayList();
	}

	void addDestination(Destination d) {
		destination.add(d);
	}

	void listOfDestination() {
		for (Destination d : destination) {
			IO.println(d);
		}
	}

}

class TravelItineraryPlanner {

	void main() {
		ItineraryPlanner ip = new ItineraryPlanner();
		Destination paris = new Destination("paris");
		Destination london = new Destination("london");

		paris.addActivity(new Activity(" Visit Eiffel Tower", "(morning)"));
		paris.addActivity(new Activity(" Louvre Museum ", "(Afternoon)"));
		london.addActivity(new Activity("British Museum", "(Morning)"));
		london.addActivity(new Activity("london eye", "afternoon"));
		ip.addDestination(paris);
		ip.addDestination(london);
		ip.listOfDestination();
	}
}
//Program-02
//===========
//Travel Itinerary Planner:
//Build a travel itinerary planner that organizes destinations, activities, and schedules for travelers using collections.
//
//Activity:
//Represents an activity with a name and schedule.
//Contains a constructor to initialize the activity's details and getters to access these details.
//Overrides the toString() method to provide a string representation of an activity.
//
//Destination:
//Represents a destination with a name and a list of activities.
//Has a constructor to set the destination's name and initialize an empty list of activities.
//Provides methods to add activities to the destination and retrieve the list of activities.
//Overrides the toString() method to provide a string representation of a destination.
//
//ItineraryPlanner:
//Manages a list of destinations.
//Contains methods to add destinations and retrieve the list of destinations.
//
//TravelItineraryPlanner (Main Class):
//Creates an instance of ItineraryPlanner.
//Creates two Destination objects: "Paris" and "London".
//Adds activities to each destination.
//Adds these destinations to the itinerary planner.
//Displays the itinerary by listing destinations and their respective activities.
//
//
//Output:-
//Destination: Paris
//- Visit Eiffel Tower (Morning)
//- Louvre Museum (Afternoon)
//
//Destination: London
//- British Museum (Morning)
//- London Eye (Afternoon)