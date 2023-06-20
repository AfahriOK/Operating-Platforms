package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */
public class Game extends Entity {
	// creates an ArrayList to store the team objects in
		private static List<Team> teams = new ArrayList<Team>();
		
		@SuppressWarnings("unused")
		// constructor 
		private Game() {
			
		}
		// referring to parent class object in Entity create a Game object
		public Game(long id, String name) {
			super(id, name);
		}
		
		/**
		 * @return the id
		 */
		
		// method used to add Teams and iterate through them
		public Team addTeam(String name) {
			Team team = null;
			// Creates the iterator
			Iterator<Team> teamIterator = teams.iterator();
			
			// iteration logic to avoid duplicate teams
			while (teamIterator.hasNext()) {
				team = teamIterator.next();
				if(team.getName().equals(name)) {
					break;
				}
			team = null;
			}
			// if the iterator cannot find a team with the same name add new team
			if(team == null) {
				team = new Team(teams.size()+1,name);
				teams.add(team);
			}
			return team;
		}
		
		@Override
		public String toString() {
			return "Game [id=" + this.getId() + ",name=" + this.getName() + "]";
		}

}
