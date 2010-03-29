// MessageMoveCharacter.java by Matt Fritz
// November 21, 2009
// Handles moving a specific character in a specific room

package sockets.messages;

import java.io.Serializable;

import astar.AStarCharacter;

public class MessageMoveCharacter extends Message implements Serializable
{
	private AStarCharacter character;
	private String roomName = "";
	private int destGridX = 0;
	private int destGridY = 0;
	
	public MessageMoveCharacter() {super("MessageMoveCharacter");}
	
	public MessageMoveCharacter(AStarCharacter character, String roomName, int destGridX, int destGridY)
	{
		super("MessageMoveCharacter");
		
		this.character = character;
		this.roomName = roomName;
		this.destGridX = destGridX;
		this.destGridY = destGridY;
	}

	public AStarCharacter getCharacter() {
		return character;
	}
	
	public void setCharacter(AStarCharacter character) {
		this.character = character;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public int getDestGridX() {
		return destGridX;
	}

	public void setDestGridX(int destGridX) {
		this.destGridX = destGridX;
	}

	public int getDestGridY() {
		return destGridY;
	}

	public void setDestGridY(int destGridY) {
		this.destGridY = destGridY;
	}
}