package com.application.rest.webservices.restfulwebservicesapplication.jwt.resources;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

//  {
//	    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTU2MTY1NDQzOCwiaWF0IjoxNTYxMDQ5NjM4fQ.ZwzDN8t4zm78Q71GIBfF6EEPqwlJKSwU-exV0ErINJCUWLhObmme6HCQvAxxprqEQb5fdzP9AkoyL343hFr4Lw"
//	}

  
  private String username;
    private String password;

    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

