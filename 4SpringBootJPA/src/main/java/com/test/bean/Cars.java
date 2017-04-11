package com.test.bean;

import java.io.Serializable;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModelProperty;

/*@Entity
@Table(name="carshowroom")*/
@Document
public class Cars implements Serializable {

	@Id
	@ApiModelProperty(value="enter new car vin",required = true)
	String vin;
	@ApiModelProperty(value="enter new car brand",required = true)
	String carbrand;
	@ApiModelProperty(value="enter new car name",required = true)
	String carname;
	@ApiModelProperty(value="enter new car color",required = true)
	String carcolor;
	@ApiModelProperty(value="enter new car price",required = true)
	String carprice;

	public String getCarbrand() {
		return carbrand;
	}

	public void setCarbrand(String carbrand) {
		this.carbrand = carbrand;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public String getCarcolor() {
		return carcolor;
	}

	public void setCarcolor(String carcolor) {
		this.carcolor = carcolor;
	}

	public String getCarprice() {
		return carprice;
	}

	public void setCarprice(String carprice) {
		this.carprice = carprice;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	@Override
	public String toString() {
		return "Cars [vin=" + vin + ", carbrand=" + carbrand + ", carname=" + carname + ", carcolor=" + carcolor
				+ ", carprice=" + carprice + "]";
	}

	public Cars(String vin, String carbrand, String carname, String carcolor, String carprice) {
		super();
		this.vin = vin;
		this.carbrand = carbrand;
		this.carname = carname;
		this.carcolor = carcolor;
		this.carprice = carprice;
	}

	public Cars() {
	}

}
