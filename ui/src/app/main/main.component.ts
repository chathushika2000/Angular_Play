import { Component, OnInit } from '@angular/core';
import {FootballserviceService} from "../footballservice.service";

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {
  header: String[] =['clubName','footballWin','footballDraws','footballDefeats','goalsReceived','goalScored','footballPoints','matchesPlayed'];
  data  : any;

  constructor(private footballService: FootballserviceService) { }

  ngOnInit(): void {
    this.footballService.getClub().subscribe((footballClub)=>{
      this.data = footballClub;
      console.log(this.data)
    });
  }

  SortByWin(){
    this.footballService.getWinSort().subscribe((footballClub)=>{
      this.data = footballClub;
      console.log(this.data)
    });
  }

  SortByGoal(){
    this.footballService.getGoalSort().subscribe((footballClub)=>{
      this.data = footballClub;
      console.log(this.data)
    });
  }

  generate(){
    this.footballService.Generate().subscribe((footballClub)=>{
      this.data = footballClub;
      console.log(this.data)
    });
  }

}
