package fr.solutec.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor @AllArgsConstructor @Data
@Entity
public class Message {
	@Id @GeneratedValue
	private Long id;
	private String contenu;
	@CreationTimestamp @Temporal(TemporalType.TIMESTAMP)
	private Date date;	
	
	@ManyToOne
	private User user;
	@ManyToOne
	private Room room;
}
