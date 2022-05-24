package org.team4.airbnb.domain;

import javax.persistence.Embeddable;

@Embeddable
public class RoomFeature {

	private int maxGuest;
	private int numberOfRoom;
	private int numberOfBed;
	private int numberOfBathroom;
}
