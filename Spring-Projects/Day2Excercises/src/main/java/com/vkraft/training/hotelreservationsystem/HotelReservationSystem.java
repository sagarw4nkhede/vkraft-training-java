package com.vkraft.training.hotelreservationsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Room {
	private int roomNumber;
	private String roomType;
	private boolean isAvailable;
	private double pricePerNight;

	public Room(int roomNumber, String roomType, double pricePerNight) {
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.isAvailable = true;
		this.pricePerNight = pricePerNight;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public String getRoomType() {
		return roomType;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailability(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public double getPricePerNight() {
		return pricePerNight;
	}

	public void displayRoomDetails() {
		String availability = isAvailable ? "Available" : "Not Available";
		System.out.println(
				"Room " + roomNumber + " (" + roomType + ") - ₹" + pricePerNight + " per night - " + availability);
	}
}

class Hotel {
	private List<Room> rooms;

	public Hotel() {
		rooms = new ArrayList<>();
		// Adding some rooms to the hotel
		rooms.add(new Room(101, "Single", 2000));
		rooms.add(new Room(102, "Double", 3000));
		rooms.add(new Room(103, "Suite", 5000));
	}

	public void displayRooms() {
		System.out.println("Available Rooms:");
		for (Room room : rooms) {
			room.displayRoomDetails();
		}
	}

	public Room getRoomByNumber(int roomNumber) {
		for (Room room : rooms) {
			if (room.getRoomNumber() == roomNumber) {
				return room;
			}
		}
		return null;
	}

	public boolean bookRoom(int roomNumber) {
		Room room = getRoomByNumber(roomNumber);
		if (room != null && room.isAvailable()) {
			room.setAvailability(false);
			System.out.println("Room " + roomNumber + " has been successfully booked.");
			return true;
		} else {
			System.out.println("Room " + roomNumber + " is not available.");
			return false;
		}
	}

	public double calculateTotalCharges(int roomNumber, int nights) {
		Room room = getRoomByNumber(roomNumber);
		if (room != null) {
			return room.getPricePerNight() * nights;
		}
		return 0;
	}
}

public class HotelReservationSystem {
	public static void main(String[] args) {
		Hotel hotel = new Hotel();

		Scanner scanner = new Scanner(System.in);
		int roomNumber, nights;

		hotel.displayRooms();

		System.out.println("\nEnter the room number you would like to book:");
		roomNumber = scanner.nextInt();

		if (hotel.bookRoom(roomNumber)) {
			System.out.println("Enter the number of nights:");
			nights = scanner.nextInt();

			double totalCharges = hotel.calculateTotalCharges(roomNumber, nights);
			System.out.println("Total charges for your stay: ₹" + totalCharges);
		} else {
			System.out.println("Sorry, the room is not available.");
		}
	}
}
