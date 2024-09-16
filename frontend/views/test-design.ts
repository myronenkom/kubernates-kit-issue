import { LitElement, html, css } from 'lit-element';
import { customElement } from 'lit-element/decorators.js';

@customElement('test-design')
export class TestDesign extends LitElement {
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
<div style="width: 100%; height: 100%;">
  Div 
</div>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
