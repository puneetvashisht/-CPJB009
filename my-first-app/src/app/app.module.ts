import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { BadgeComponent } from './badge.component';
import {RouterModule, Routes} from '@angular/router'
import { FirstComponent } from './components/first.component';
import { SecondComponent } from './components/second.component';

const appRoutes: Routes= [
  { path: '', component: FirstComponent },
  { path: 'second',component: SecondComponent },
];



@NgModule({
  declarations: [
    AppComponent, BadgeComponent, FirstComponent, SecondComponent
  ],
  imports: [
    BrowserModule, RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
