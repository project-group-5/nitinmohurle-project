package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Seat {
	    @NotNull
		@Id
		@GeneratedValue
		private String seatId;
		private int seatNo;
		private String seatType;
		private String Office;
		private int floor;
		private String location;
		@NotNull
		private float duration;
		
		
		

		public Seat() {
			
		
		
	}   

		public String getSeatId() {
			return seatId;
		}

		public void setSeatId(@NotNull String seatId) {
			this.seatId = seatId;
		}

		public int getSeatNo() {
			return seatNo;
		}

		public void setSeatNo(int seatNo) {
			this.seatNo = seatNo;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getSeatType() {
			return seatType;
		}

		public void setSeatType(String string) {
			this.seatType = string;
		}

		public String getOffice() {
			return Office;
		}

		public void setOffice(String office) {
			this.Office = office;
		}

		public int getFloor() {
			return floor;
		}

		public void setFloor(int floor) {
			this.floor = floor;
		}

		public float getDuration() {
			return duration;
		}

		public void setDuration(float duration) {
			this.duration = duration;
		}

		@Override
		public String toString() {
			return "Seat [seatId=" + seatId + ", seatNo=" + seatNo + ", seatType=" + seatType + ", Office=" + Office
					+ ", floor=" + floor + ", location=" + location + ", duration=" + duration + "]";
		}

		
		

		
			
		

		

		
		

		

	
		

}