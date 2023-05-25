package com.example.guide.Model;

public class FamousPlacesModel {

    String Places_name;
    String Places_Content;
    String location;

    public FamousPlacesModel(String places_name, String places_Content, String location) {
        Places_name = places_name;
        Places_Content = places_Content;
        this.location = location;
    }

    public String getPlaces_name() {
        return Places_name;
    }

    public void setPlaces_name(String places_name) {
        Places_name = places_name;
    }

    public String getPlaces_Content() {
        return Places_Content;
    }

    public void setPlaces_Content(String places_Content) {
        Places_Content = places_Content;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
