package in.peacock.peacockapi.models;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="destinations")
public class Destination {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
    private String name;
    private String destinationType;
    private String country;
    private String country_id;
    private String parentDestinationName;
    private String parentDestinationId;
    private Double latitude;
    private Double longitude;
    private Date createdAt;
    private Date updatedAt;
}
