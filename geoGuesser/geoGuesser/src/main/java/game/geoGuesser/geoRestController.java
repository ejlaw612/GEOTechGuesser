package game.geoGuesser;

import com.google.cloud.firestore.DocumentReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

@RestController
public class geoRestController {
    public GeoService geoService;
    public geoRestController(GeoService geoService) {
        this.geoService = geoService;
    }
    @GetMapping("/get")
    public String getGeoImage(@RequestParam String document_id) throws InterruptedException, ExecutionException {
        return geoService.getGeoImage(document_id);
    }
}
