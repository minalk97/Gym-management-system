import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HomeService } from '../home.service';

@Component({
  selector: 'app-member',
  templateUrl: './member.component.html',
  styleUrls: ['./member.component.css']
})
export class MemberComponent implements OnInit {

  constructor(public router:Router,public svc:HomeService) { }

  ngOnInit() {
    
  }
  logout()
  {
    this.svc.logout();
  }

}
