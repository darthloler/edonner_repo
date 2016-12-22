package com.edonner.services;

import com.edonner.actors.Donor;
import com.edonner.actors.NGO;

public class ValidateService {

	public int validatedonor(Donor u){
if(u.getAddress()==null ||u.getDob()==null||u.getEmail()==null||u.getFirstName()==null||u.getLastName()==null||u.getPassword()==null||u.getPhoneNo()==null||u.getPincode()==null)
			
		{
			return 0;
		}
		return 1;
	}
public	int validatengo(NGO n)
	{
		if(n.getAddress()==null||n.getEmail()==null||n.getName()==null||n.getPhoneno()==null||n.getPincode()==null||n.getYearofestd()==null)
		{
			return 0;
		}
		return 1;

}
}