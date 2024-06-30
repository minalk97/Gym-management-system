import { Component, OnInit, Input } from '@angular/core';
import { Register } from '../register';
import { HomeService } from '../home.service';
import { Member } from '../memberdetails';
import { Router } from '@angular/router';

@Component({
  selector: 'app-manager-all-members',
  templateUrl: './manager-all-members.component.html',
  styleUrls: ['./manager-all-members.component.css']
})
export class ManagerAllMembersComponent implements OnInit {
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
    this.router.navigate(['/managermemberdetails']);
  }
  goback()
    {
      this.svc.backToManager();
    }
}
