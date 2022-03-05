import '@vaadin/map';
import { html, LitElement } from 'lit';
import { customElement } from 'lit/decorators.js';

@customElement('map-view')
export class MapView extends LitElement {
  createRenderRoot() {
    return this;
  }

  render() {
    return html`<vaadin-map class="map" id="theMap"></vaadin-map>`;
  }
}
