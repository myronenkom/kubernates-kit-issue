import { LitElement, html, css } from 'lit-element';
import { customElement } from 'lit/decorators.js';

@customElement('sub-tab1-content-layout')
export class SubTab1ContentLayout extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html``;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
