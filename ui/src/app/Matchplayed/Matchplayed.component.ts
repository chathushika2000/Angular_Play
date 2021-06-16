import { Component, OnInit } from '@angular/core';
import {FootballserviceService} from "../footballservice.service";

@Component({
  selector: 'app-Matchplayed',
  templateUrl: './Matchplayed.component.html',
  styleUrls: ['./Matchplayed.component.css']
})
export class MatchplayedComponent implements OnInit {
  header: String[] = ["date", "teamOne","teamTwo","teamOneScore","teamTwoScore"];
  data : any
  constructor(private footballService: FootballserviceService) { }

  ngOnInit() {
    this.footballService.getHistory().subscribe((MatchSchedule)=> {
      this.data = MatchSchedule;
      console.log(this.data);
    })
  }

  search(){
    this.footballService.getHistory().subscribe((MatchSchedule)=> {
      this.data = MatchSchedule;
      var dateHtml =  (<HTMLInputElement>document.getElementById("date")).value;
      let tempData =  this.data.filter((e:{date:string}) => e.date == dateHtml);

      this.data = tempData;
      console.log(this.data)


    })
  }

}
