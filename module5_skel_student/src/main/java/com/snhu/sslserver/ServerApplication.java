package com.snhu.sslserver;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

}

@RestController
class ServerController{
//FIXME:  Add hash function to return the checksum value for the data string that should contain your name.    
	@RequestMapping("/hash")
    public String myHash() throws NoSuchAlgorithmException{
    	String data = "Afahri Kerr";
       
    	//Create MessageDigest object to encrypt message
    	MessageDigest md = MessageDigest.getInstance("SHA-256");
    	
    	//Pass data to the MessageDigest
    	md.update(data.getBytes());
    	
    	byte[] digest = md.digest();
    	
    	//Convert hash value to hex
    	StringBuffer hex = new StringBuffer();
    	
    	for(int i = 0; i < digest.length; i++) {
    		hex.append(Integer.toHexString(0xFF & digest[i]));
    	}
        return "<p>data: " + data + "<p>SHA-256 CheckSum:" + hex;
    }
}
