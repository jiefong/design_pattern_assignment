/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contactmanagementsoftware;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author Leanne
 */
public interface OtherInformations extends Serializable{
    public HashMap<String,String> getOtherInformations();
    public void setOtherInformations(HashMap<String,String> newOtherInformations);
}