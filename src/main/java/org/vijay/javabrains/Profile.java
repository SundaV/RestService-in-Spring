package org.vijay.javabrains;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Profile {
	private String name;
	private int phoneno;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(int phoneno) {
		this.phoneno = phoneno;
	}

	public Profile() {

	}

	public Profile(String name, int phoneno) {

		this.name = name;
		this.phoneno = phoneno;
	}
}
