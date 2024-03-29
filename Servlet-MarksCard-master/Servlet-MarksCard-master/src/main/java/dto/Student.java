package dto;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Student
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
int id;
String name;
@Column(unique = true)
String email;
@Column(unique = true)
long mobile;
String password;
String standard;
Date dob;
int age;

@OneToMany
List<MarksCard> marksCards;
}
