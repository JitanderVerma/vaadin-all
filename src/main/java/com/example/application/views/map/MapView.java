package com.example.application.views.map;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.littemplate.LitTemplate;
import com.vaadin.flow.component.map.Map;
import com.vaadin.flow.component.map.configuration.Coordinate;
import com.vaadin.flow.component.map.configuration.View;
import com.vaadin.flow.component.template.Id;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Map")
@Route(value = "map", layout = MainLayout.class)
@Tag("map-view")
@JsModule("./views/map/map-view.ts")
public class MapView extends LitTemplate implements HasSize {

    @Id("theMap")
    private Map map;

    public MapView() {
        setSizeFull();
        map.setSizeFull();
        View view = map.getView();
        view.setCenter(Coordinate.fromLonLat(10.0, 55.0));
        view.setZoom(4);
    }
}
