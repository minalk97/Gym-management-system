import { Component, OnInit } from '@angular/core';
import { Trainer } from '../trainer';
import { HomeService } from '../home.service';

@Component({
  selector: 'app-trainer-basicprofile',
  templateUrl: './trainer-basicprofile.component.html',
  styleUrls: ['./trainer-basicprofile.component.css']
})
export class TrainerBasicprofileComponent implements OnInit {
  email=sessionStorage.getItem('sessionTrainerId')
 trainer:Trainer;
  constructor(public svc:HomeService) { 
   
  }

  ngOnInit() {
    this.svc.getTrainerByIdFromREST(this.email).subscribe(
      trainer=>{
        this.trainer=trainer;
        console.log(this.trainer);
        let sid=sessionStorage.getItem('sessionId')
             console.log(sid);   
                                         
  }
    )
  }
  goback()
  {
    this.svc.backToTrainer();
  }
}
