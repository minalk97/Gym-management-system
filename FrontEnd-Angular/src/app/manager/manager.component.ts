import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HomeService } from '../home.service';

@Component({
  selector: 'app-manager',
  templateUrl: './manager.component.html',
  styleUrls: ['./manager.component.css']
})
export class ManagerComponent implements OnInit {

  constructor(public router:Router,public svc:HomeService) { }

  ngOnInit() {
    
  }
  logout()
  {
    this.svc.logout();
  }

}
