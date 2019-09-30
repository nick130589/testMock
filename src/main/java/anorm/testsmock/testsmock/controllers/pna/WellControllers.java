package anorm.testsmock.testsmock.controllers.pna;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import anorm.testsmock.testsmock.generators.WellGenerator;
import anorm.testsmock.testsmock.models.getWellList.GetWellResponse;

@RestController
public class WellControllers {

    @Autowired
    WellGenerator wellGenerator;

    @GetMapping("/services/pna/wells")
    public GetWellResponse getWells(@RequestParam int pageNr, @RequestParam int pageSize, @RequestParam String orderBy, @RequestParam String direction){
        return wellGenerator.generateWellList(1000, pageNr, pageSize);
    }
}
