package com.infy.form;

import java.util.Collections;
import java.util.Date;
import java.util.List;
 
public class MyDataNode {
 
    private String addressType;
    private String addressLine;
    private String countryLabel;
    private String country;
    private String districtLabel;
    private String district;
 
    private List<MyDataNode> children;
    
    private boolean changed;
 
    public MyDataNode(String addressType, String addressLine,String countryLabel, 
    		String country, String districtLabel, String district, List<MyDataNode> children) {
        this.addressType = addressType;
        this.addressLine = addressLine;
        this.countryLabel = countryLabel;
        this.country = country;
        this.district = district;
        this.districtLabel = districtLabel;
        this.children = children;
        this.changed = false;
 
        if (this.children == null) {
            this.children = Collections.emptyList();
        }
    }

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		 if (this.addressLine == null ? addressLine != null : !this.addressLine.equals(addressLine)) {
         	System.out.println("changed ");
             this.addressLine = addressLine;
             changed = true;
         }
		this.addressLine = addressLine;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}
	
	public String getDistrictLabel() {
		return districtLabel;
	}

	public void setDistrictLabel(String districtLabel) {
		this.districtLabel = districtLabel;
	}
	
	
	public String getCountryLabel() {
		return countryLabel;
	}

	public void setCountryLabel(String countryLabel) {
		 if (this.countryLabel == null ? countryLabel != null : !this.countryLabel.equals(countryLabel)) {
         	System.out.println("changed ");
             this.countryLabel= countryLabel;
             changed = true;
         }
		this.countryLabel = countryLabel;
	}
	
	
	public List<MyDataNode> getChildren() {
		return children;
	}

	public void setChildren(List<MyDataNode> children) {
		this.children = children;
	}
	public boolean hasChanged (){
		return changed;
	}
	public String toString(){
		return this.addressType;
	}
 
    
    
}
