import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {catchError, map} from "rxjs/operators";
import {throwError} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class FootballserviceService {
  private url  = '/api/football/club';
  private urlHistory  = '/api/football/History'
  private urlSortByWin = '/api/football/WinSort'
  private urlSortByGoal =  '/api/football/GoalSort'
  private urlGenerate = '/api/football/Generate '

constructor(private http : HttpClient) { }

getClub(){
  return this.http.get(this.url).
  pipe(
    map((data) => {
      return data;
    })
  );
}

  getHistory(){
    return this.http.get(this.urlHistory).
    pipe(
      map((data) => {
        return data;
      })
    );
  }

  getWinSort(){
    return this.http.get(this.urlSortByWin).
    pipe(
      map((data) => {
        return data;
      })
    );
  }


  getGoalSort(){
    return this.http.get(this.urlSortByGoal).
    pipe(
      map((data) => {
        return data;
      })
    );
  }
  Generate(){
    return this.http.get(this.urlGenerate).
    pipe(
      map((data) => {
        return data;
      })
    );
  }

}
