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
public class CompanyAddrLabel extends AddrLabel{
    private String attn;
    private String companyName;
    
    public CompanyAddrLabel(String name, String cityStateZip, String street,String CompanyName, String attn){
        super(name, cityStateZip, street);
        this.attn = attn;
        this.companyName = companyName;
    }

    @Override
    public String[] getLabel() {
       String[] s = {super.getName(),"\n",companyName , super.getCityStateZip(),"\n", super.getStreet(),"\n\n"};
       return s;    }


}
