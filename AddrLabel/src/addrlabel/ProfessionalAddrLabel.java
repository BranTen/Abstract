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
public class ProfessionalAddrLabel extends AddrLabel{
    private String suff;
    public ProfessionalAddrLabel (String name, String cityStateZip, String street, String suff){
        super(name, cityStateZip, street);
        this.suff = suff;
    }

    @Override
    public String[] getLabel() {
        String[] s = {super.getName(),suff,"\n", super.getCityStateZip(),"\n", super.getStreet(),"\n\n"};
       return s;
    }


    
}
