import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { DemoParentComponent } from './demo/demo-parent/demo-parent.component';
import { DemoChildComponent } from './demo/demo-parent/demo-child/demo-child.component';

@NgModule({
  declarations: [
    AppComponent,
    DemoParentComponent,
    DemoChildComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
