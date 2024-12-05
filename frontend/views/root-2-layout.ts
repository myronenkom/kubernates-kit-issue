import { LitElement, html, css } from 'lit-element';
import { customElement } from 'lit/decorators.js';
import '@vaadin/horizontal-layout/src/vaadin-horizontal-layout.js';

@customElement('root-2-layout')
export class Root2Layout extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout theme="spacing" id="subTab" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
<sub-tab2-lit id="subTab2Lit"></sub-tab2-lit>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
