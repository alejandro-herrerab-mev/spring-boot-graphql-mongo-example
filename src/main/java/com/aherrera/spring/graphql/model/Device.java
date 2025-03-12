package com.aherrera.spring.graphql.model;

import org.springframework.data.annotation.Id;

public class Device {

	@Id
	private String id;

	private String name;

	private Data data;

	public Device() {
	}
	

	public Device(String id) {
		this.id = id;
	}


	public Device(String id, String name, Data data) {
		this.id = id;
		this.name = name;
		this.data = data;
	}


	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Device [id=" + id + ", name=" + name + "]";
	}

}

// [
// {
// "id": "1",
// "name": "Google Pixel 6 Pro",
// "data": {
// "color": "Cloudy White",
// "capacity": "128 GB"
// }
// },
// {
// "id": "2",
// "name": "Apple iPhone 12 Mini, 256GB, Blue",
// "data": null
// },
// {
// "id": "3",
// "name": "Apple iPhone 12 Pro Max",
// "data": {
// "color": "Cloudy White",
// "capacity GB": 512
// }
// },
// {
// "id": "4",
// "name": "Apple iPhone 11, 64GB",
// "data": {
// "price": 389.99,
// "color": "Purple"
// }
// },
// {
// "id": "5",
// "name": "Samsung Galaxy Z Fold2",
// "data": {
// "price": 689.99,
// "color": "Brown"
// }
// },
// {
// "id": "6",
// "name": "Apple AirPods",
// "data": {
// "generation": "3rd",
// "price": 120
// }
// },
// {
// "id": "7",
// "name": "Apple MacBook Pro 16",
// "data": {
// "year": 2019,
// "price": 1849.99,
// "CPU model": "Intel Core i9",
// "Hard disk size": "1 TB"
// }
// },