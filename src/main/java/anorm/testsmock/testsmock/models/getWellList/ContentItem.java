package anorm.testsmock.testsmock.models.getWellList;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ContentItem{

	@JsonProperty("wellNr")
	private String wellNr;

	@JsonProperty("resourceCrew")
	private String resourceCrew;

	@JsonProperty("apiNr")
	private String apiNr;

	@JsonProperty("plugByDate")
	private String plugByDate;

	@JsonProperty("campaign")
	private String campaign;

	@JsonProperty("range")
	private String range;

	@JsonProperty("rigOnDate")
	private String rigOnDate;

	@JsonProperty("wellName")
	private String wellName;

	@JsonProperty("strategicWellIndicator")
	private String strategicWellIndicator;

	@JsonProperty("section")
	private String section;

	@JsonProperty("rigOffDate")
	private String rigOffDate;

	@JsonProperty("township")
	private String township;
}