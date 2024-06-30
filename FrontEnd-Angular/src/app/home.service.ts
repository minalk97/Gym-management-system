import { Injectable } from '@angular/core';
import{Home} from './home'
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {Observable} from 'rxjs';
import {tap} from 'rxjs/operators';
import { Register } from './register';
import { Member } from './memberdetails';
import { Instruments } from './instruments';
import { Router } from '@angular/router';
import { Schedule } from './schedule';
import { ExerciseChart } from './exercisechart';
import { Trainer } from './trainer';
import { DietPlan } from './dietplan';
import { Allocation } from './allocation';
import { Membership } from './membership';
import { FoodItem } from './fooditem';
import { AddSchedule } from './addschedule';
import { MealChart } from './mealchart';
//import { BasicProfile } from './basicprofile';
@Injectable({
  providedIn: 'root'
})
export class HomeService {
  dataS: Schedule;
  //email:string="rucha@gmail.com"
  member: Member;
  trainer: Trainer;
  data: any;
  getAllUrl: string = "/api/getAllMembers"
  email = sessionStorage.getItem('emailTrainer');
  id = sessionStorage.getItem('sessionId');
  sessionemail = sessionStorage.getItem("sessionEmail");
 
  constructor(public http:HttpClient,public router:Router) {
    const httpOptions = {
      headers: new HttpHeaders({
        'Content-Type':  'application/json'
      })
    };
  }
 logout()
  {
    sessionStorage.removeItem('sessionId');
    this.router.navigate(['/login']);
  }

  public getAllDietPlans(email):Observable<DietPlan>
  {
    
    return this.http.get<DietPlan>('/api/getDietPlanById?email='+email).pipe(
      tap(data=>console.log(data))
    )

  }

  public getExerciseScheduleFromRest(id):Observable<Schedule>
  {
    
    return this.http.get<Schedule>('/api/getAllPlansForMember?email='+id).pipe(
      tap(data=>console.log(data))
    )

  }

  public  getMemberByIdFromREST(sessionemail):Observable<Member>{
      return this.http.get<Member>('/api/getMemberById?email='+sessionemail).pipe(
        tap(trainer=>console.log(trainer))
      ); 
  
  }

  public  getTrainerByIdFromREST(email):Observable<Trainer>{
    return this.http.get<Trainer>('/api/getTrainerById?email='+email).pipe(
      tap(member=>console.log(member))
    ); 

}

  public getAllMembers():Observable<Register>{
    return this.http.get<Register>(this.getAllUrl).pipe(
      tap(data=>console.log(data))
      
    );
  }

  public getAllTrainers():Observable<Trainer>{
    return this.http.get<Trainer>('/api/getAllTrainers').pipe(
      tap(data=>console.log(data))
      
    );
  }

  public getAllInstrumentsRecord():Observable<Instruments>{
    return this.http.get<Instruments>('/api/getAllinstruments').pipe(
      tap(data=>console.log(data))
      
    );
  }

  public getAllMembershipPlans(): Observable<Membership> {
    return this.http.get<Membership>('/api/getAllMembershipPlans').pipe(
      tap(data => console.log(data))

    );
  }

  allocateTrainer(allocation: Allocation) {
    return this.http.post('/api/allocate', allocation);
  }
  public getAllExercise(): Observable<ExerciseChart> {
    return this.http.get<ExerciseChart>('/api/getAllChartDetails').pipe(
      tap(data => console.log(data))

    );
  }
  public getAllMealChartDetails(): Observable<MealChart> {
    return this.http.get<MealChart>('/api/getAllMealChartDetails').pipe(
      tap(data => console.log(data))

    );
  }
  public getAllFoodItemDetails(): Observable<FoodItem> {
    return this.http.get<FoodItem>('/api/getAllFoodItemDetails').pipe(
      tap(data => console.log(data))

    );
  }

  public addSchedule(schedule: AddSchedule) {
    /*alert(schedule.date);
    alert(schedule.sets);
    alert(schedule.exerciseid);
    alert(schedule.email);
    alert(schedule.time);*/
    return this.http.post('/api/addPlan', schedule);
  }
  public addDietPlan(dietplan: DietPlan) {
    return this.http.post('/api/addNewDietPlan', dietplan);
  }
  back()
  {
    this.router.navigate(['/member']);
  }

  backToTrainer()
  {
    this.router.navigate(['/trainerprofile']);
  }
  backToManagerAllMembers()
  {
    this.router.navigate(['/managerallmembers']);
  }
  backToAllTrainers()
  {
    this.router.navigate(['/alltrainers']);
  }
  backToManager()
  {
this.router.navigate(['/manager']);
  }
 }
