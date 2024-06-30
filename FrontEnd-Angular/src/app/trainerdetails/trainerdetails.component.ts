import { Component, OnInit } from '@angular/core';
import { Trainer } from '../trainer';
import { HomeService } from '../home.service';

@Component({
  selector: 'app-trainerdetails',
  templateUrl: './trainerdetails.component.html',
  styleUrls: ['./trainerdetails.component.css']
})
export class TrainerdetailsComponent implements OnInit {
email=sessionStorage.getItem('emailTrainer')
data:Trainer;
  constructor(public svc:HomeService) { }

  ngOnInit() {
    this.memberDetails(this.email);
  }
  memberDetails(email){
    this.svc.getTrainerByIdFromREST(email).subscribe(
      data=>{
        this.data=data;
        console.log(data)
      }
    )
    return this.data;
  }
  goback()
  {
    this.svc.backToAllTrainers();
  }
}
