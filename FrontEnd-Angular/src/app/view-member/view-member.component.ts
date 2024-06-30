import { Component, OnInit } from '@angular/core';
import { HomeService } from '../home.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-view-member',
  templateUrl: './view-member.component.html',
  styleUrls: ['./view-member.component.css']
})
export class ViewMemberComponent {

  data:any;
  constructor(public svc:HomeService,public router:Router) { }
  getAllMembers(){
    this.svc.getAllMembers().subscribe(
      data=>
      {
        this.data=data;
        console.log(data);
      })
      this.router.navigate['/details']
  }
}
