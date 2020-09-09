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
public class LabelTester{
    
    public static void main(String args[]){
        AddrLabel[] labels = new AddrLabel[3];
        
        labels[0] = new CompanyAddrLabel("Johnny", "Rockville MD 20852", "old gate", "Starbucks", "attn:");
        labels[1] = new FriendAddrLabel("Fred", "Bethesda MD 20859", "Sinnot dr" );
        labels[2] = new ProfessionalAddrLabel("julio", "Gathersberg MD 20198", "Laguna dr", "MR.");
        
        for (AddrLabel label : labels){
            String[] addr = label.getLabel();
            for(String line : addr){
                System.out.println(line);
            }
        }
        
    }
}
