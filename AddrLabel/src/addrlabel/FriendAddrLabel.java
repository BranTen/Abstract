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
public class FriendAddrLabel extends AddrLabel{

    public FriendAddrLabel(String name, String cityStateZip, String street){
        super(name, cityStateZip, street);
    }
    @Override
    public String[] getLabel() {
        String[] s = {super.getName(),"\n", super.getCityStateZip(),"\n", super.getStreet(),"\n\n"};
       return s;
    }


}
