package com.ty.foodorder.DTO;

import javax.persistence.Entity ;
import javax.persistence.GeneratedValue ;
import javax.persistence.GenerationType ;
import javax.persistence.Id ;

@Entity
public class AdminDTO
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String email;
private String password;
public int getId ( )
{
	return id ;
}
public void setId ( int id )
{
	this.id = id ;
}
public String getEmail ( )
{
	return email ;
}
public void setEmail ( String email )
{
	this.email = email ;
}
public String getPassword ( )
{
	return password ;
}
public void setPassword ( String password )
{
	this.password = password ;
}
@Override
public String toString() {
	return "AdminDTO [id=" + id + ", email=" + email + ", password=" + password + "]";
}

}
