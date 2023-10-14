package game.geoGuesser;

import com.google.cloud.firestore.*;
import com.google.firebase.cloud.FirestoreClient;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class GeoService {
    public String getGeoImage(String document_id) throws ExecutionException, InterruptedException {
        Firestore dbFirestore = FirestoreClient.getFirestore();
        return "test";
       /*DocumentReference documentReference = dbFirestore.collection("techPhotos").document(document_id);
        ApiFuture<DocumentSnapshot> future = documentReference.get();
        DocumentSnapshot document = future.get();
        GeoImage image;
        if (document.exists()) {
            image = document.toObject(GeoImage.class);
            return image;
        }
        return null;*/
    }
}
