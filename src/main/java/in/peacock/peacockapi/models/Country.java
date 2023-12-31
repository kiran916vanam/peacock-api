package in.peacock.peacockapi.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="countries")
public class Country {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
    private String name;
    private String iso3;
    // private String numeric_code;
    // private String iso2;
    private String phonecode;
    private String capital;
    private String currency;
    private String currencyName;
    private String currencySymbol;
    // private String tld;
    // @Column(name="native")
    // private String nativity;
    // private String region;
    // private Integer region_id;
    // private String subregion;
    // @Nullable
    // private Integer subregion_id;
    // private String nationality;
    // private String timezones;
    // private String translations;
    private Double latitude;
    private Double longitude;
    private String emoji;
    private String emojiU;
    private Date createdAt;
    private Date updatedAt;
    @Column(name="flag")
    private int notServing;
    // private String wikiDataId;
}
