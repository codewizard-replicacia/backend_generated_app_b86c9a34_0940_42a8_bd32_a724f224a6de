package com.mycompany.group234.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.mycompany.group234.model.PreviousCompany;
import com.mycompany.group234.model.PerformanceAppraisal;
import com.mycompany.group234.model.Organization;
import com.mycompany.group234.model.Trainings;
import com.mycompany.group234.model.EmployeePersonalInfo;
import com.mycompany.group234.model.EmploymentInformation;
import com.mycompany.group234.model.EmergencyContactInfo;
import com.mycompany.group234.model.SkillsAndCompetencies;
import com.mycompany.group234.model.EducationalBG;
import com.mycompany.group234.model.EmlpoyeeProfile;
import com.mycompany.group234.converter.DurationConverter;
import com.mycompany.group234.converter.UUIDToByteConverter;
import com.mycompany.group234.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "EducationalBG")
@Table(name = "\"EducationalBG\"", schema =  "\"generated_app\"")
@Data
                        
public class EducationalBG {
	public EducationalBG () {   
  }
	  
  @Column(name = "\"RecentGraduation\"", nullable = true )
  private Boolean recentGraduation;
  
	  
  @Column(name = "\"CertificatesVerifiedDate\"")
  @Temporal(value = TemporalType.DATE)
  private Date certificatesVerifiedDate;  
  
	  
  @Column(name = "\"RelevantCourses\"", nullable = true )
  private String relevantCourses;
  
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"EducationBGID\"", nullable = true )
  private Integer educationBGID;
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "EducationalBG [" 
  + "RecentGraduation= " + recentGraduation  + ", " 
  + "CertificatesVerifiedDate= " + certificatesVerifiedDate  + ", " 
  + "RelevantCourses= " + relevantCourses  + ", " 
  + "EducationBGID= " + educationBGID 
 + "]";
	}
	
}