package in.peacock.peacockapi.country;

import java.util.Date;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@Setter
@ToString
@Table(name="countries")
public class Country {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
    public String name;
    public String iso3;
    public String numeric_code;
    public String iso2;
    public String phonecode;
    public String capital;
    public String currency;
    public String currency_name;
    public String currency_symbol;
    public String tld;
    @Column(name="native")
    public String nativity;
    public String region;
    public Integer region_id;
    public String subregion;
    @Nullable
    public Integer subregion_id;
    public String nationality;
    public String timezones;
    public String translations;
    public Double latitude;
    public Double longitude;
    public String emoji;
    public String emojiU;
    public Date created_at;
    public Date updated_at;
    public int flag;
    public String wikiDataId;
}
