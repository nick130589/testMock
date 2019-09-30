package anorm.testsmock.testsmock.generators;

import java.text.SimpleDateFormat;
import java.util.*;

import org.springframework.stereotype.Service;

import com.github.javafaker.Faker;

import anorm.testsmock.testsmock.models.getWellList.ContentItem;
import anorm.testsmock.testsmock.models.getWellList.GetWellResponse;

@Service
public class WellGenerator {

    Faker faker = new Faker();

    public GetWellResponse generateWellList(int totalElements, int pageNr, int pageSize){

        List<ContentItem> wellList = new ArrayList<>();
        SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy");

        final Date currentDate = new Date();
        String date = dateFormatter.format(currentDate);

        Calendar c = Calendar.getInstance();
        c.setTime(currentDate);

        for (int i = 0; i < pageSize; i++) {
            ContentItem contentItem = new ContentItem();

            c.add(Calendar.DAY_OF_MONTH, i);

            contentItem.setWellNr("" + i)
                    .setWellName("test" + i)
                    .setApiNr("wellName" + i)
                    .setStrategicWellIndicator("StrategicWellIndicator" + 1)
                    .setCampaign("Campaign" + i)
                    .setTownship("TownShip" + i)
                    .setRange("Range" + i)
                    .setSection("Section" + i)
                    .setPlugByDate(date)
                    .setRigOnDate(dateFormatter.format(c.getTime()))
                    .setRigOffDate(date)
                    .setResourceCrew("ResourceCrew" + i);

            wellList.add(contentItem);
        }

        GetWellResponse getWellResponse = new GetWellResponse();
        getWellResponse.setContent(wellList)
                .setPageNr(pageNr)
                .setPageSize(pageSize)
                .setTotalElements(totalElements);

        return getWellResponse;
    }
}
