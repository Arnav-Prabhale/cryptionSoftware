/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cryptionsoftware;

import java.io.File;

/**
 *
 * @author arnavprabhale
 */
public class Run
{
    
    public static void main(String[] args)
	{
		Encryptor en = Encryptor.getEncrypter(true);
		Decryptor de = Decryptor.getDecrypter(true);
		
		File src = new File("/Users/arnavprabhale/Desktop/TE/encrpt software/send");
		File rec = new File("/Users/arnavprabhale/Desktop/TE/encrpt software/receive");
		
                //en.encrypt(rec, src);
		de.decrypt(src, rec);
	}
}
