package anorm.testsmock.testsmock.models.getWellList;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class GetWellResponse{

	@JsonProperty("pageNr")
	private int pageNr;

	@JsonProperty("pageSize")
	private int pageSize;

	@JsonProperty("content")
	private List<ContentItem> content;

	@JsonProperty("totalElements")
	private int totalElements;
}