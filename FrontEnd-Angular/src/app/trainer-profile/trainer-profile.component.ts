import { Component, OnInit } from '@angular/core';
import { HomeService } from '../home.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-trainer-profile',
  templateUrl: './trainer-profile.component.html',
  styleUrls: ['./trainer-profile.component.css']
})
export class TrainerProfileComponent implements OnInit {

  constructor(public router:Router,public svc:HomeService) { }

  ngOnInit() {
    
  }
  logout()
  {
    this.svc.logout();
  }
}
