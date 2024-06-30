import { Component, OnInit, Input } from '@angular/core';
import { Register } from '../register';
import { HomeService } from '../home.service';
import { Member } from '../memberdetails';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';

@Component({
  selector: 'app-trainer',
  templateUrl: './trainer.component.html',
  styleUrls: ['./trainer.component.css']
})
export class TrainerComponent implements OnInit {
  @Input() register:Register;
  data:Member;
  
  constructor(public svc:HomeService,private router:Router) { }

  ngOnInit() {
    this.svc.getAllMembers().subscribe(
      data=>{
        this.data=data;
        
        console.log(data);
      });
      
    }
    memberDetails(email){
      sessionStorage.setItem('sessionemail',email)
      this.router.navigate(['/details']);
    }
    goback()
    {
      this.svc.backToTrainer();
    }
}
