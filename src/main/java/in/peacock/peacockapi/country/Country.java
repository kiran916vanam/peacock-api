package in.peacock.peacockapi.country;

import java.util.Date;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name="countries")
public class Country {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
    private String name;
    private String iso3;
    private String numeric_code;
    private String iso2;
    private String phonecode;
    private String capital;
    private String currency;
    private String currency_name;
    private String currency_symbol;
    private String tld;
    @Column(name="native")
    private String nativity;
    private String region;
    private Integer region_id;
    private String subregion;
    @Nullable
    private Integer subregion_id;
    private String nationality;
    private String timezones;
    private String translations;
    private Double latitude;
    private Double longitude;
    private String emoji;
    private String emojiU;
    private Date created_at;
    private Date updated_at;
    private int flag;
    private String wikiDataId;
}
