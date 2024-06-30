import { Component, OnInit } from '@angular/core';
import { Trainer } from '../trainer';
import { HomeService } from '../home.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-alltrainers',
  templateUrl: './alltrainers.component.html',
  styleUrls: ['./alltrainers.component.css']
})
export class AlltrainersComponent implements OnInit {
  data:Trainer;
  constructor(public svc:HomeService,private router:Router) { }

  ngOnInit() {
    this.svc.getAllTrainers().subscribe(
      data=>{
        this.data=data;
        
        console.log(data);
      });
  }
  memberDetails(email){
    sessionStorage.setItem('emailTrainer',email)
    this.router.navigate(['/trainerdetails']);
  }
  goback()
  {
    this.svc.backToManager();
  }
}
