import { Component, OnInit,Input } from '@angular/core';
import { HomeService } from '../home.service';
import { DietPlan } from '../dietplan';
@Component({
  selector: 'app-mydietplan',
  templateUrl: './mydietplan.component.html',
  styleUrls: ['./mydietplan.component.css']
})
export class MydietplanComponent implements OnInit {

  @Input() dietplan:DietPlan

  dietplans:any;
  id=sessionStorage.getItem("sessionId");
	//email:string="rucha@gmail.com";
  constructor(public svc:HomeService) { }

  ngOnInit() {
  
  this.svc.getAllDietPlans(this.id).subscribe(
    data=>{
     this.dietplans=data
    })
    

 //return this.data;
}
goback()
  {
    this.svc.back();
  }
}

