import { Component, OnInit, Input } from '@angular/core';
import { Register } from '../register';
import { HomeService } from '../home.service';
import { Member } from '../memberdetails';
import { TrainerComponent } from '../trainer/trainer.component';
import { Router } from '@angular/router';

@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.css']
})
export class DetailsComponent implements OnInit{
  @Input() member:Member;
  data:Member;
email=sessionStorage.getItem('sessionemail');
  route: Router;
  constructor(public svc:HomeService) { }

  ngOnInit() {

    this.memberDetails(this.email);
  }
  memberDetails(email){
    this.svc.getMemberByIdFromREST(email).subscribe(
      data=>{
        this.data=data;
        console.log(data)
      }
    )
    return this.data;
  }

}
