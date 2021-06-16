import { Routes, RouterModule } from '@angular/router';
import { MatchplayedComponent } from './Matchplayed/Matchplayed.component';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { MainComponent } from './main/main.component';



const routes: Routes = [
  { path:'Main',component:MainComponent },
  { path:'Matchplayed',component:MatchplayedComponent }
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class MyRouteRoutingModule { }
