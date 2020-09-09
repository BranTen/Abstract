/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addrlabel;

/**
 *
 * @author Brandon
 */
public abstract class AddrLabel {

// apppropriate instance variables
private String attn_name; // etc.

private String name, cityStateZip, street;
public AddrLabel(String name, String cityStateZip, String street){
    this.name = name;
    this.cityStateZip = cityStateZip;
    this.street = street;

}
public  String getName(){
    return name;
}
public  String getCityStateZip(){
    return cityStateZip;
}
public  String getStreet(){
    return street;
}


public abstract String[] getLabel();
}
