import { Component, OnInit, Input } from '@angular/core';
import { Schedule } from '../schedule';
import { HomeService } from '../home.service';

@Component({
  selector: 'app-myschedule',
  templateUrl: './myschedule.component.html',
  styleUrls: ['./myschedule.component.css']
})
export class MyscheduleComponent implements OnInit {
  @Input() schedule:Schedule
  schedules:any;
//email:string="rucha@gmail.com";
id=sessionStorage.getItem("sessionId");
  constructor(public svc:HomeService) { }

  ngOnInit() {

   
  this.svc.getExerciseScheduleFromRest(this.id).subscribe(
    data=>{
      
     this.schedules=data
     console.log(data)
    }
)


  }
  goback()
  {
    this.svc.back();
  }
}