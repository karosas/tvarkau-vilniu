package lt.vilnius.tvarkau.events_listeners;

import com.google.android.gms.maps.model.Marker;

public class MapInfoWindowShownEvent {

    public final Marker marker;

    public MapInfoWindowShownEvent(Marker marker){
        this.marker = marker;
    }
}
